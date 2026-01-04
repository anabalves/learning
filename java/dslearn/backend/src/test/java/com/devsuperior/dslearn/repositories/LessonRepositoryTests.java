package com.devsuperior.dslearn.repositories;

import com.devsuperior.dslearn.entities.Course;
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
import static org.junit.jupiter.api.Assertions.assertThrows;

@DataJpaTest
public class LessonRepositoryTests {

    @Autowired
    private CourseRepository repository;

    private long existingId;
    private long nonExistingId;
    private long countTotalCourses;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalCourses = 1L;
    }

    @Test
    public void findAllPagedShouldReturnFirstPageSortedByName() {
        Pageable pageable = PageRequest.of(0, 12, Sort.by("name").ascending());
        Page<Course> list = repository.findAll(pageable);

        assertEquals(countTotalCourses, list.getContent().size());
        assertEquals("Bootcamp HTML", list.getContent().get(0).getName());
    }

    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenIdExists() {
        Optional<Course> result = repository.findById(existingId);

        assertTrue(result.isPresent());
        assertEquals(existingId, result.get().getId());
    }

    @Test
    public void findByIdShouldReturnEmptyOptionalWhenIdDoesNotExists() {
        Optional<Course> result = repository.findById(nonExistingId);

        assertTrue(result.isEmpty());
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull() {

    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() {
        repository.deleteById(existingId);

        Optional<Course> result = repository.findById(existingId);

        assertFalse(result.isPresent());
    }

    @Test
    public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdDoesNotExist() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            repository.deleteById(nonExistingId);
        });
    }

}
