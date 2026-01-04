package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.Optional;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import com.devsuperior.dscatalog.services.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.repositories.ProductRepository;
import com.devsuperior.dscatalog.services.exceptions.DatabaseException;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import com.devsuperior.dscatalog.tests.Factory;

import javax.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class ProductServiceTests {

    @InjectMocks
    private ProductService service;

    @Mock
    private ProductRepository repository;

    @Mock
    private CategoryRepository categoryRepository;

    private long existingId;
    private long nonExistingId;
    private long dependentId;
    private PageImpl<Product> page;
    private Product product;
    private ProductDTO dto;
    private Category category;

    @BeforeEach
    void setUp() {

        existingId = 1L;
        nonExistingId = 1000L;
        dependentId = 4L;
        product = Factory.createProduct();
        category = Factory.createCategory();
        dto = Factory.createProductDTO();
        page = new PageImpl<>(List.of(product));

        when(repository.findAll((Pageable) any())).thenReturn(page);

        when(repository.save(any())).thenReturn(product);

        when(repository.findById(existingId)).thenReturn(Optional.of(product));
        doThrow(ResourceNotFoundException.class).when(repository).findById(nonExistingId);

        when(repository.getOne(existingId)).thenReturn(product);
        when(repository.getOne(nonExistingId)).thenThrow(EntityNotFoundException.class);

        when(categoryRepository.getOne(existingId)).thenReturn(category);
        when(categoryRepository.getOne(nonExistingId)).thenThrow(EntityNotFoundException.class);

        doNothing().when(repository).deleteById(existingId);
        doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(nonExistingId);
        doThrow(DataIntegrityViolationException.class).when(repository).deleteById(dependentId);
    }

    @Test
    public void findAllPagedShouldReturnPage() {
        Pageable pageable = PageRequest.of(0, 12);

        Page<ProductDTO> result = service.findAllPaged(pageable);

        assertNotNull(result);

        verify(repository, times(1)).findAll(pageable);
    }

    @Test
    public void findByIdShouldReturnProductDTOWhenIdExists() {
        ProductDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals(product.getId(), result.getId());
        assertProductDTOEquals(dto, result);
        verify(repository, times(1)).findById(existingId);
    }

    @Test
    public void findByIdShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.findById(nonExistingId);
        });

        verify(repository, times(1)).findById(nonExistingId);
    }

    @Test
    public void insertShouldReturnProductDTO() {
        ProductDTO result = service.insert(dto);

        assertNotNull(result);
        assertEquals(product.getId(), result.getId());

        verify(repository, times(1)).save(any());
    }

    @Test
    public void updateShouldReturnProductDTOWhenIdExists() {
        ProductDTO result = service.update(existingId, dto);

        assertNotNull(result);
        assertEquals(existingId, result.getId());
        assertProductDTOEquals(dto, result);

        verify(repository, times(1)).getOne(existingId);
    }

    @Test
    public void updateShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.update(nonExistingId, dto);
        });

        verify(repository, times(1)).getOne(nonExistingId);
    }

    @Test
    public void deleteShouldThrowDatabaseExceptionWhenDependentId() {
        assertThrows(DatabaseException.class, () -> {
            service.delete(dependentId);
        });

        verify(repository, times(1)).deleteById(dependentId);
    }

    @Test
    public void deleteShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.delete(nonExistingId);
        });

        verify(repository, times(1)).deleteById(nonExistingId);
    }

    @Test
    public void deleteShouldDoNothingWhenIdExists() {
        assertDoesNotThrow(() -> {
            service.delete(existingId);
        });

        verify(repository, times(1)).deleteById(existingId);
    }

    private void assertProductDTOEquals(ProductDTO expected, ProductDTO actual) {
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getDescription(), actual.getDescription());
        assertEquals(expected.getPrice(), actual.getPrice());
        assertEquals(expected.getImgUrl(), actual.getImgUrl());
        assertEquals(expected.getDate(), actual.getDate());
    }

}
