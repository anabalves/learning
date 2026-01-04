package com.devsuperior.dslearn.repositories;

import com.devsuperior.dslearn.entities.Role;
import com.devsuperior.dslearn.tests.Factory;
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
public class RoleRepositoryTests {

    @Autowired
    private RoleRepository repository;

    private long existingId;
    private long nonExistingId;
    private long countTotalRoles;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalRoles = 3L;
    }

    @Test
    public void findAllPagedShouldReturnFirstPageSortedByName() {
        Pageable pageable = PageRequest.of(0, 12, Sort.by("authority").ascending());
        Page<Role> list = repository.findAll(pageable);

        assertEquals(countTotalRoles, list.getContent().size());
        assertEquals("ROLE_ADMIN", list.getContent().get(0).getAuthority());
        assertEquals("ROLE_INSTRUCTOR", list.getContent().get(1).getAuthority());
        assertEquals("ROLE_STUDENT", list.getContent().get(2).getAuthority());
    }

    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenIdExists() {
        Optional<Role> result = repository.findById(existingId);

        assertTrue(result.isPresent());
        assertEquals(existingId, result.get().getId());
    }

    @Test
    public void findByIdShouldReturnEmptyOptionalWhenIdDoesNotExists() {
        Optional<Role> result = repository.findById(nonExistingId);

        assertTrue(result.isEmpty());
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
        Role role = Factory.createRole();
        role.setId(null);

        role = repository.save(role);
        Optional<Role> result = repository.findById(role.getId());

        assertNotNull(role.getId());
        assertEquals(countTotalRoles + 1L, role.getId());
        assertTrue(result.isPresent());
        assertSame(result.get(), role);
    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() {
        repository.deleteById(existingId);

        Optional<Role> result = repository.findById(existingId);

        assertFalse(result.isPresent());
    }

    @Test
    public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdDoesNotExist() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            repository.deleteById(nonExistingId);
        });
    }

}
