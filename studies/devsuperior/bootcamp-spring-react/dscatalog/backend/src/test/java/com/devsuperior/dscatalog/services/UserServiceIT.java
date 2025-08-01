package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.dto.UserDTO;
import com.devsuperior.dscatalog.dto.UserInsertDTO;
import com.devsuperior.dscatalog.dto.UserUpdateDTO;
import com.devsuperior.dscatalog.entities.User;
import com.devsuperior.dscatalog.repositories.UserRepository;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import com.devsuperior.dscatalog.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class UserServiceIT {

    @Autowired
    private UserService service;

    @Autowired
    private UserRepository repository;

    private Long existingId;
    private Long nonExistingId;
    private Long countTotalUsers;
    private String existingEmail;
    private String nonExistingEmail;

    private UserDTO userDTO;
    private UserInsertDTO userInsertDTO;
    private UserUpdateDTO userUpdateDTO;
    private User user;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalUsers = 2L;
        existingEmail = "alex@gmail.com";
        nonExistingEmail = "nonExistingId@gmail.com";
        user = Factory.createUser();
        userDTO = Factory.createUserDTO();
        userInsertDTO = Factory.createUserInsertDTO();
        userUpdateDTO = Factory.createUserUpdateDTO();
    }

    @Test
    public void findAllPagedShouldReturnPageWhenPage0Size10() {
        PageRequest pageRequest = PageRequest.of(0, 10);

        Page<UserDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals(0, result.getNumber());
        assertEquals(10, result.getSize());
        assertEquals(countTotalUsers, result.getTotalElements());
    }

    @Test
    public void findAllPagedShouldReturnEmptyPageWhenPageDoesNotExist() {
        PageRequest pageRequest = PageRequest.of(50, 10);

        Page<UserDTO> result = service.findAllPaged(pageRequest);

        assertTrue(result.isEmpty());
    }

    @Test
    public void findAllPagedShouldReturnSortedPageWhenSortByEmail() {
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by("email"));

        Page<UserDTO> result = service.findAllPaged(pageRequest);

        assertFalse(result.isEmpty());
        assertEquals(2, result.getContent().size());
        assertEquals("alex@gmail.com", result.getContent().get(0).getEmail());
        assertEquals("maria@gmail.com", result.getContent().get(1).getEmail());
    }

    @Test
    public void findByIdShouldReturnExistingUserDTOWhenIdExists() {
        UserDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals("alex@gmail.com", result.getEmail());
    }

    @Test
    public void findByIdShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.findById(nonExistingId);
        });
    }

    @Test
    public void insertShouldReturnCreatedUserDTO() {
        UserDTO result = service.insert(userInsertDTO);

        assertNotNull(result);
        assertNotNull(result.getId());
        assertEquals(countTotalUsers + 1, repository.count());
        assertUserDTOEquals(userDTO, result);
    }

    @Test
    public void updateShouldReturnUpdatedUserDTOWhenIdExists() {
        UserDTO result = service.update(existingId, userUpdateDTO);

        assertNotNull(result);
        assertEquals(existingId, result.getId());
        assertEquals(countTotalUsers, repository.count());
        assertUserDTOEquals(userDTO, result);
    }

    @Test
    public void updateShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.update(nonExistingId, userUpdateDTO);
        });
    }

    @Test
    public void deleteShouldDeleteResourceWhenIdExists() {
        service.delete(existingId);

        assertEquals(countTotalUsers - 1, repository.count());
    }

    @Test
    public void deleteShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.delete(nonExistingId);
        });
    }

    @Test
    void loadUserByUsernameShouldReturnUserDetailsWhenUserExists() {
        UserDetails result = service.loadUserByUsername(existingEmail);

        assertNotNull(result);
        assertEquals(user, result);
    }

    @Test
    void loadUserByUsernameShouldThrowUsernameNotFoundExceptionWhenUserDoesNotExist() {
        assertThrows(UsernameNotFoundException.class, () -> service.loadUserByUsername(nonExistingEmail));
    }

    private void assertUserDTOEquals(UserDTO expected, UserDTO actual) {
        assertEquals(expected.getFirstName(), actual.getFirstName());
        assertEquals(expected.getLastName(), actual.getLastName());
        assertEquals(expected.getEmail(), actual.getEmail());
        assertEquals(expected.getRoles().toString(), actual.getRoles().toString());
    }

}
