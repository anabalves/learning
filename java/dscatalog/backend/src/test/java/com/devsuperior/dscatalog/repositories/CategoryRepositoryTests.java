package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class CategoryRepositoryTests {

    @Autowired
    private CategoryRepository repository;

    private long existingId;
    private long nonExistingId;
    private long countTotalCategories;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalCategories = 4L;
    }

    @Test
    public void findAllPagedShouldReturnFirstPageSortedByName() {
        Pageable pageable = PageRequest.of(0, 12, Sort.by("name").ascending());
        Page<Category> list = repository.findAll(pageable);

        assertEquals(countTotalCategories, list.getContent().size());
        assertEquals("Computadores", list.getContent().get(0).getName());
        assertEquals("Livros", list.getContent().get(2).getName());
    }

    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenIdExists() {
        Optional<Category> result = repository.findById(existingId);

        assertTrue(result.isPresent());
        assertEquals(existingId, result.get().getId());
    }

    @Test
    public void findByIdShouldReturnEmptyOptionalWhenIdDoesNotExists() {
        Optional<Category> result = repository.findById(nonExistingId);

        assertTrue(result.isEmpty());
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
        Category category = Factory.createCategory();
        category.setId(null);

        category = repository.save(category);
        Optional<Category> result = repository.findById(category.getId());

        assertNotNull(category.getId());
        assertEquals(countTotalCategories + 1L, category.getId());
        assertTrue(result.isPresent());
        assertSame(result.get(), category);
    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() {
        repository.deleteById(existingId);

        Optional<Category> result = repository.findById(existingId);

        assertFalse(result.isPresent());
    }

    @Test
    public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdDoesNotExist() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            repository.deleteById(nonExistingId);
        });
    }

}
