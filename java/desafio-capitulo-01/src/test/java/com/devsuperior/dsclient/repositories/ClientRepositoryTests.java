package com.devsuperior.dsclient.repositories;

import java.util.Optional;

import com.devsuperior.dsclient.entities.Client;
import com.devsuperior.dsclient.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class ClientRepositoryTests {

    @Autowired
    private ClientRepository repository;

    private long existingId;
    private long nonExistingId;
    private long countTotalClients;

    @BeforeEach
    void setUp() throws Exception {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalClients = 25L;
    }

    @Test
    public void findAllPagedShouldReturnFirstPageSortedByName() {
        Pageable pageable = PageRequest.of(0, 12, Sort.by("name").ascending());
        Page<Client> list = repository.findAll(pageable);

        assertEquals(12, list.getContent().size());
        assertEquals("Adelir Lima Soares", list.getContent().get(0).getName());
        assertEquals("Iseu Simoes Texeira", list.getContent().get(11).getName());
    }

    @Test
    public void findByIdShouldReturnNonEmptyOptionalWhenIdExists() {
        Optional<Client> result = repository.findById(existingId);

        assertTrue(result.isPresent());
        assertEquals(existingId, result.get().getId());
    }

    @Test
    public void findByIdShouldReturnEmptyOptionalWhenIdDoesNotExists() {
        Optional<Client> result = repository.findById(nonExistingId);

        assertTrue(result.isEmpty());
    }

    @Test
    public void saveShouldPersistWithAutoincrementWhenIdIsNull() {
        Client client = Factory.createClient();
        client.setId(null);

        client = repository.save(client);
        Optional<Client> result = repository.findById(client.getId());

        assertNotNull(client.getId());
        assertEquals(countTotalClients + 1L, client.getId());
        assertTrue(result.isPresent());
        assertSame(result.get(), client);
    }

    @Test
    public void deleteShouldDeleteObjectWhenIdExists() {
        repository.deleteById(existingId);

        Optional<Client> result = repository.findById(existingId);

        assertFalse(result.isPresent());
    }

    @Test
    public void deleteShouldThrowEmptyResultDataAccessExceptionWhenIdDoesNotExist() {
        assertThrows(EmptyResultDataAccessException.class, () -> {
            repository.deleteById(nonExistingId);
        });
    }

}
