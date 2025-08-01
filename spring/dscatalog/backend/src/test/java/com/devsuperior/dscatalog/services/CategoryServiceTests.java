package com.devsuperior.dscatalog.services;

import java.util.List;
import java.util.Optional;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import com.devsuperior.dscatalog.services.CategoryService;
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

import com.devsuperior.dscatalog.services.exceptions.DatabaseException;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import com.devsuperior.dscatalog.tests.Factory;

import javax.persistence.EntityNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class CategoryServiceTests {

    @InjectMocks
    private CategoryService service;

    @Mock
    private CategoryRepository repository;

    private long existingId;
    private long nonExistingId;
    private long dependentId;
    private PageImpl<Category> page;
    private Category category;
    private CategoryDTO dto;

    @BeforeEach
    void setUp() {

        existingId = 1L;
        nonExistingId = 1000L;
        dependentId = 4L;
        category = Factory.createCategory();
        dto = Factory.createCategoryDTO();
        page = new PageImpl<>(List.of(category));

        when(repository.findAll((Pageable) any())).thenReturn(page);

        when(repository.save(any())).thenReturn(category);

        when(repository.findById(existingId)).thenReturn(Optional.of(category));
        doThrow(ResourceNotFoundException.class).when(repository).findById(nonExistingId);

        when(repository.getOne(existingId)).thenReturn(category);
        when(repository.getOne(nonExistingId)).thenThrow(EntityNotFoundException.class);

        doNothing().when(repository).deleteById(existingId);
        doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(nonExistingId);
        doThrow(DataIntegrityViolationException.class).when(repository).deleteById(dependentId);
    }

    @Test
    public void findAllPagedShouldReturnPage() {
        Pageable pageable = PageRequest.of(0, 12);

        Page<CategoryDTO> result = service.findAllPaged(pageable);

        assertNotNull(result);

        verify(repository, times(1)).findAll(pageable);
    }

    @Test
    public void findByIdShouldReturnCategoryDTOWhenIdExists() {
        CategoryDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals(category.getId(), result.getId());
        assertCategoryDTOEquals(dto, result);
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
    public void insertShouldReturnCategoryDTO() {
        CategoryDTO result = service.insert(dto);

        assertNotNull(result);
        assertEquals(category.getId(), result.getId());

        verify(repository, times(1)).save(any());
    }

    @Test
    public void updateShouldReturnCategoryDTOWhenIdExists() {
        CategoryDTO result = service.update(existingId, dto);

        assertNotNull(result);
        assertEquals(existingId, result.getId());
        assertCategoryDTOEquals(dto, result);

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

    private void assertCategoryDTOEquals(CategoryDTO expected, CategoryDTO actual) {
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getName(), actual.getName());
    }

}
