package com.devsuperior.dsclient.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

import com.devsuperior.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.entities.Client;
import com.devsuperior.dsclient.repositories.ClientRepository;
import com.devsuperior.dsclient.services.exceptions.DatabaseException;
import com.devsuperior.dsclient.services.exceptions.ResourceNotFoundException;
import com.devsuperior.dsclient.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityNotFoundException;

@ExtendWith(SpringExtension.class)
public class ClientServiceTests {

    @InjectMocks
    private ClientService service;

    @Mock
    private ClientRepository repository;

    private long existingId;
    private long nonExistingId;
    private long dependentId;
    private PageImpl<Client> page;
    private Client client;
    private ClientDTO dto;

    @BeforeEach
    void setUp() throws Exception {
        existingId = 1L;
        nonExistingId = 2L;
        dependentId = 3L;
        client = Factory.createClient();
        dto = Factory.createClientDTO();
        page = new PageImpl<>(List.of(client));

        when(repository.findAll((Pageable)ArgumentMatchers.any())).thenReturn(page);

        when(repository.save(ArgumentMatchers.any())).thenReturn(client);

        when(repository.findById(existingId)).thenReturn(Optional.of(client));
        doThrow(ResourceNotFoundException.class).when(repository).findById(nonExistingId);

        when(repository.getOne(existingId)).thenReturn(client);
        when(repository.getOne(nonExistingId)).thenThrow(EntityNotFoundException.class);

        doNothing().when(repository).deleteById(existingId);
        doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(nonExistingId);
        doThrow(DataIntegrityViolationException.class).when(repository).deleteById(dependentId);
    }

    @Test
    public void findAllPagedShouldReturnPage() {
        Pageable pageable = PageRequest.of(0, 12);

        Page<ClientDTO> result = service.findAllPaged(pageable);

        assertNotNull(result);
        assertEquals(1, result.getContent().size());

        verify(repository, times(1)).findAll(pageable);
    }

    @Test
    public void findByIdShouldReturnClientDTOWhenIdExists() {
        ClientDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals(client.getId(), result.getId());
        assertClientDTOEquals(dto, result);

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
    public void insertShouldReturnClientDTO() {
        ClientDTO result = service.insert(dto);

        assertNotNull(result);
        assertEquals(client.getId(), result.getId());

        verify(repository, times(1)).save(any());
    }

    @Test
    public void updateShouldReturnClientDTOWhenIdExists() {
        ClientDTO result = service.update(existingId, dto);

        assertNotNull(result);
        assertEquals(existingId, result.getId());
        assertClientDTOEquals(dto, result);

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

    private void assertClientDTOEquals(ClientDTO expected, ClientDTO actual) {
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getCpf(), actual.getCpf());
        assertEquals(expected.getIncome(), actual.getIncome());
        assertEquals(expected.getBirthDate(), actual.getBirthDate());
        assertEquals(expected.getChildren(), actual.getChildren());
    }

}
