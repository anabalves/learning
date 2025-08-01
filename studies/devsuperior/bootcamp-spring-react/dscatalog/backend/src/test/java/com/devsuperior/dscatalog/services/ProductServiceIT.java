package com.devsuperior.dscatalog.services;

import static org.junit.jupiter.api.Assertions.*;

import com.devsuperior.dscatalog.repositories.ProductRepository;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.tests.Factory;

@SpringBootTest
@Transactional
public class ProductServiceIT {

    @Autowired
    private ProductService service;

    @Autowired
    private ProductRepository repository;

    private Long existingId;
    private Long nonExistingId;
    private Long countTotalProducts;
    private ProductDTO productDTO;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalProducts = 25L;
        productDTO = Factory.createProductDTO();
    }

    @Test
    public void findAllPagedShouldReturnPageWhenPage0Size10() {
        PageRequest pageRequest = PageRequest.of(0, 10);

        Page<ProductDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals(0, result.getNumber());
        assertEquals(10, result.getSize());
        assertEquals(countTotalProducts, result.getTotalElements());
    }

    @Test
    public void findAllPagedShouldReturnEmptyPageWhenPageDoesNotExist() {
        PageRequest pageRequest = PageRequest.of(50, 10);

        Page<ProductDTO> result = service.findAllPaged(pageRequest);

        assertTrue(result.isEmpty());
    }

    @Test
    public void findAllPagedShouldReturnSortedPageWhenSortByName() {
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("name"));

        Page<ProductDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals(10, result.getContent().size());
        assertEquals("Macbook Pro", result.getContent().get(0).getName());
        assertEquals("PC Gamer Hera", result.getContent().get(9).getName());
    }

    @Test
    public void findByIdShouldReturnExistingProductDTOWhenIdExists() {
        ProductDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals("The Lord of the Rings", result.getName());
    }

    @Test
    public void findByIdShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.findById(nonExistingId);
        });
    }

    @Test
    public void insertShouldReturnCreatedProductDTO() {
        ProductDTO result = service.insert(productDTO);
        assertNotNull(result.getId());
        assertEquals(countTotalProducts + 1, repository.count());
        assertEquals(productDTO.getName(), result.getName());
        assertEquals(productDTO.getDescription(), result.getDescription());
        assertEquals(productDTO.getPrice(), result.getPrice());
        assertEquals(productDTO.getImgUrl(), result.getImgUrl());
        assertEquals(productDTO.getDate(), result.getDate());
    }

    @Test
    public void updateShouldReturnUpdatedProductDTOWhenIdExists() {
        ProductDTO updatedproductDTO = productDTO;

        ProductDTO result = service.update(existingId, updatedproductDTO);

        assertEquals(existingId, result.getId());
        assertEquals(updatedproductDTO.getName(), result.getName());
        assertEquals(updatedproductDTO.getDescription(), result.getDescription());
        assertEquals(updatedproductDTO.getPrice(), result.getPrice());
        assertEquals(updatedproductDTO.getImgUrl(), result.getImgUrl());
        assertEquals(updatedproductDTO.getDate(), result.getDate());
    }

    @Test
    public void updateShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        ProductDTO updatedproductDTO = productDTO;

        assertThrows(ResourceNotFoundException.class, () -> {
            service.update(nonExistingId, updatedproductDTO);
        });
    }

    @Test
    public void deleteShouldDeleteResourceWhenIdExists() {
        service.delete(existingId);

        assertEquals(countTotalProducts - 1, repository.count());
    }

    @Test
    public void deleteShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.delete(nonExistingId);
        });
    }

}
