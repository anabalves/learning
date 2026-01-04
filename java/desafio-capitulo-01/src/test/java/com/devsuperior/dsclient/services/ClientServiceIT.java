package com.devsuperior.dsclient.services;

import com.devsuperior.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.repositories.ClientRepository;
import com.devsuperior.dsclient.services.exceptions.ResourceNotFoundException;
import com.devsuperior.dsclient.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class ClientServiceIT {

    @Autowired
    private ClientService service;

    @Autowired
    private ClientRepository repository;

    private Long existingId;
    private Long nonExistingId;
    private Long countTotalClients;
    private ClientDTO clientDTO;

    @BeforeEach
    void setUp() throws Exception {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalClients = 25L;
        clientDTO = Factory.createClientDTO();
    }

    @Test
    public void findAllPagedShouldReturnPageWhenPage0Size10() {
        PageRequest pageRequest = PageRequest.of(0, 10);

        Page<ClientDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals(0, result.getNumber());
        assertEquals(10, result.getSize());
        assertEquals(countTotalClients, result.getTotalElements());
    }

    @Test
    public void findAllPagedShouldReturnEmptyPageWhenPageDoesNotExist() {
        PageRequest pageRequest = PageRequest.of(50, 10);

        Page<ClientDTO> result = service.findAllPaged(pageRequest);

        assertTrue(result.isEmpty());
    }

    @Test
    public void findAllPagedShouldReturnSortedPageWhenSortByName() {
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("name"));

        Page<ClientDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals("Adelir Lima Soares", result.getContent().get(0).getName());
        assertEquals("Alice Limeira Dutra", result.getContent().get(1).getName());
        assertEquals("Alzira Sarmanto Paula", result.getContent().get(2).getName());
    }

    @Test
    public void findByIdShouldReturnExistingClientDTOWhenIdExists() {
        ClientDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals("Marisa Nazare Nogueira", result.getName());
    }

    @Test
    public void findByIdShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.findById(nonExistingId);
        });
    }

    @Test
    public void insertShouldReturnCreatedClientDTO() {
        ClientDTO result = service.insert(clientDTO);
        assertNotNull(result.getId());
        assertEquals(countTotalClients + 1, repository.count());
        assertEquals(clientDTO.getName(), result.getName());
        assertEquals(clientDTO.getCpf(), result.getCpf());
        assertEquals(clientDTO.getIncome(), result.getIncome());
        assertEquals(clientDTO.getBirthDate(), result.getBirthDate());
        assertEquals(clientDTO.getChildren(), result.getChildren());
    }

    @Test
    public void updateShouldReturnUpdatedClientDTOWhenIdExists() {
        ClientDTO updatedClientDTO = clientDTO;

        ClientDTO result = service.update(existingId, updatedClientDTO);

        assertEquals(existingId, result.getId());
        assertEquals(updatedClientDTO.getName(), result.getName());
        assertEquals(updatedClientDTO.getCpf(), result.getCpf());
        assertEquals(updatedClientDTO.getIncome(), result.getIncome());
        assertEquals(updatedClientDTO.getBirthDate(), result.getBirthDate());
        assertEquals(updatedClientDTO.getChildren(), result.getChildren());
    }

    @Test
    public void updateShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        ClientDTO updatedClientDTO = clientDTO;

        assertThrows(ResourceNotFoundException.class, () -> {
            service.update(nonExistingId, updatedClientDTO);
        });
    }

    @Test
    public void deleteShouldDeleteResourceWhenIdExists() {
        service.delete(existingId);

        assertEquals(countTotalClients - 1, repository.count());
    }

    @Test
    public void deleteShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.delete(nonExistingId);
        });
    }

}
