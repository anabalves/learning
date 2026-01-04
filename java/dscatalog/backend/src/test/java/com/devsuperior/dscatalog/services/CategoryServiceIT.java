package com.devsuperior.dscatalog.services;

import static org.junit.jupiter.api.Assertions.*;

import com.devsuperior.dscatalog.dto.CategoryDTO;
import com.devsuperior.dscatalog.repositories.CategoryRepository;
import com.devsuperior.dscatalog.services.CategoryService;
import com.devsuperior.dscatalog.services.exceptions.DatabaseException;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.devsuperior.dscatalog.tests.Factory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class CategoryServiceIT {

    @Autowired
    private CategoryService service;

    @Autowired
    private CategoryRepository repository;

    private Long existingId;
    private Long nonExistingId;
    private Long nonDependentId;
    private Long countTotalCategories;
    private CategoryDTO categoryDTO;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        nonDependentId = 4L;
        countTotalCategories = 4L;
        categoryDTO = Factory.createCategoryDTO();
    }

    @Test
    public void findAllPagedShouldReturnPageWhenPage0Size10() {
        PageRequest pageRequest = PageRequest.of(0, 10);

        Page<CategoryDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals(0, result.getNumber());
        assertEquals(10, result.getSize());
        assertEquals(4, result.getContent().size());
        assertEquals(countTotalCategories, result.getTotalElements());
    }

    @Test
    public void findAllPagedShouldReturnEmptyPageWhenPageDoesNotExist() {
        PageRequest pageRequest = PageRequest.of(50, 10);

        Page<CategoryDTO> result = service.findAllPaged(pageRequest);

        assertTrue(result.isEmpty());
    }

    @Test
    public void findAllPagedShouldReturnSortedPageWhenSortByName() {
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("name"));

        Page<CategoryDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals(10, result.getSize());
        assertEquals(4, result.getContent().size());
        assertEquals("Computadores", result.getContent().get(0).getName());
        assertEquals("Vestuário", result.getContent().get(3).getName());
    }

    @Test
    public void findByIdShouldReturnExistingCategoryDTOWhenIdExists() {
        CategoryDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals("Livros", result.getName());
    }

    @Test
    public void findByIdShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.findById(nonExistingId);
        });
    }

    @Test
    public void insertShouldReturnCreatedCategoryDTO() {
        CategoryDTO result = service.insert(categoryDTO);

        assertNotNull(result.getId());
        assertEquals(countTotalCategories + 1, repository.count());
        assertEquals(categoryDTO.getName(), result.getName());
    }

    @Test
    public void updateShouldReturnUpdatedCategoryDTOWhenIdExists() {
        CategoryDTO updatedCategoryDTO = categoryDTO;

        CategoryDTO result = service.update(existingId, updatedCategoryDTO);

        assertEquals(existingId, result.getId());
        assertEquals(updatedCategoryDTO.getName(), result.getName());
    }

    @Test
    public void updateShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        CategoryDTO updatedCategoryDTO = categoryDTO;

        assertThrows(ResourceNotFoundException.class, () -> {
            service.update(nonExistingId, updatedCategoryDTO);
        });
    }

    @Test
    public void deleteShouldDeleteResourceWhenIdExistsAndIsNotDependent() {
        service.delete(nonDependentId);

        assertEquals(countTotalCategories - 1, repository.count());
    }

    @Test
    @Transactional(propagation = Propagation.NEVER)
    public void deleteShouldThrowDatabaseExceptionWhenIdExistsAndIsDependent() {
        assertThrows(DatabaseException.class, () -> {
            service.delete(existingId);
        });
    }


    @Test
    public void deleteShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.delete(nonExistingId);
        });
    }

}
