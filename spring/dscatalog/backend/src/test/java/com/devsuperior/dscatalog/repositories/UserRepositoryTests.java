package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.entities.User;
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
public class UserRepositoryTests {

    @Autowired
    private UserRepository repository;

    private long existingId;
    private long nonExistingId;
    private long countTotalUsers;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalUsers = 2L;
    }

    @Test
    public void findAllPagedShouldReturnFirstPageSortedByEmail() {
        Pageable pageable = PageRequest.of(0, 12, Sort.by("email").ascending());
        Page<User> list = repository.findAll(pageable);

        assertEquals(countTotalUsers, list.getContent().size());
        assertEquals("alex@gmail.com", list.getContent().get(0).getEmail());
        assertEquals("maria@gmail.com", list.getContent().get(1).getEmail());
    }

    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenIdExists() {
        Optional<User> result = repository.findById(existingId);

        assertTrue(result.isPresent());
        assertEquals(existingId, result.get().getId());
    }

    @Test
    public void findByIdShouldReturnEmptyOptionalWhenIdDoesNotExists() {
        Optional<User> result = repository.findById(nonExistingId);

        assertTrue(result.isEmpty());
    }

    @Test
    public void findByEmailShouldReturnNonEmptyOptionalWhenIdExists() {
        User result = repository.findByEmail("alex@gmail.com");

        assertEquals(1L, result.getId());
        assertEquals("Alex", result.getFirstName());
        assertEquals("Brown", result.getLastName());
        assertEquals("alex@gmail.com", result.getEmail());
        assertEquals("[Role { id: 1, authority: ROLE_OPERATOR }]", result.getRoles().toString());
    }

    @Test
    public void findByEmailShouldReturnEmptyWhenEmailDoesNotExists() {
        assertNull(repository.findByEmail("nonExistingId@gmail.com"));
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
        User user = Factory.createUser();
        user.setId(null);

        user = repository.save(user);
        Optional<User> result = repository.findById(user.getId());

        assertNotNull(user.getId());
        assertEquals(countTotalUsers + 1L, user.getId());
        assertTrue(result.isPresent());
        assertSame(result.get(), user);
    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() {
        repository.deleteById(existingId);

        Optional<User> result = repository.findById(existingId);

        assertFalse(result.isPresent());
    }

    @Test
    public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdDoesNotExist() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            repository.deleteById(nonExistingId);
        });
    }

}
