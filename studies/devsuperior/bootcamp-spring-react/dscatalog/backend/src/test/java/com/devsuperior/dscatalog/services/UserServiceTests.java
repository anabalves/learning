package com.devsuperior.dscatalog.services;

import com.devsuperior.dscatalog.dto.UserDTO;
import com.devsuperior.dscatalog.dto.UserInsertDTO;
import com.devsuperior.dscatalog.dto.UserUpdateDTO;
import com.devsuperior.dscatalog.entities.Role;
import com.devsuperior.dscatalog.entities.User;
import com.devsuperior.dscatalog.repositories.RoleRepository;
import com.devsuperior.dscatalog.repositories.UserRepository;
import com.devsuperior.dscatalog.services.exceptions.DatabaseException;
import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;
import com.devsuperior.dscatalog.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class UserServiceTests {

    @InjectMocks
    private UserService service;

    @Mock
    private UserRepository repository;

    @Mock
    private RoleRepository roleRepository;

    @Mock
    private BCryptPasswordEncoder passwordEncoder;

    private long existingId;
    private long nonExistingId;
    private long dependentId;
    private String existingEmail;
    private String nonExistingEmail;

    private User user;
    private UserDTO dto;
    private UserInsertDTO insertDTO;
    private UserUpdateDTO updateDTO;
    private Role role;
    private PageImpl<User> page;

    @BeforeEach
    void setUp() {
        existingId = 1L;
        nonExistingId = 1000L;
        dependentId = 3L;
        existingEmail = "alex@gmail.com";
        nonExistingEmail = "nonExistingId@gmail.com";
        user = Factory.createUser();
        dto = Factory.createUserDTO();
        insertDTO = Factory.createUserInsertDTO();
        updateDTO = Factory.createUserUpdateDTO();
        role = Factory.createRole();
        page = new PageImpl<>(List.of(user));

        when(repository.findAll((Pageable) any())).thenReturn(page);

        when(repository.save(any())).thenReturn(user);

        when(repository.findById(existingId)).thenReturn(Optional.of(user));
        doThrow(ResourceNotFoundException.class).when(repository).findById(nonExistingId);

        when(repository.findByEmail(existingEmail)).thenReturn(user);
        doThrow(UsernameNotFoundException.class).when(repository).findByEmail(nonExistingEmail);

        when(repository.getOne(existingId)).thenReturn(user);
        when(repository.getOne(nonExistingId)).thenThrow(EntityNotFoundException.class);

        when(roleRepository.getOne(existingId)).thenReturn(role);
        when(roleRepository.getOne(nonExistingId)).thenThrow(EntityNotFoundException.class);

        doNothing().when(repository).deleteById(existingId);
        doThrow(EmptyResultDataAccessException.class).when(repository).deleteById(nonExistingId);
        doThrow(DataIntegrityViolationException.class).when(repository).deleteById(dependentId);
    }

    @Test
    public void findAllPagedShouldReturnPage() {
        Pageable pageable = PageRequest.of(0, 12);

        Page<UserDTO> result = service.findAllPaged(pageable);

        assertNotNull(result);

        verify(repository, times(1)).findAll(pageable);
    }

    @Test
    public void findByIdShouldReturnUserDTOWhenIdExists() {
        UserDTO result = service.findById(existingId);

        assertNotNull(result);
        assertEquals(user.getId(), result.getId());
        assertUserDTOEquals(dto, result);
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
    public void insertShouldReturnUserDTO() {
        UserDTO result = service.insert(insertDTO);

        assertNotNull(result);
        assertUserDTOEquals(dto, result);

        verify(repository, times(1)).save(any());
    }

    @Test
    public void updateShouldReturnUserDTOWhenIdExists() {
        UserDTO result = service.update(existingId, updateDTO);

        assertNotNull(result);
        assertUserDTOEquals(dto, result);

        verify(repository, times(1)).getOne(existingId);
    }

    @Test
    public void updateShouldThrowResourceNotFoundExceptionWhenIdDoesNotExist() {
        assertThrows(ResourceNotFoundException.class, () -> {
            service.update(nonExistingId, updateDTO);
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
        assertEquals(expected.getId(), actual.getId());
        assertEquals(expected.getFirstName(), actual.getFirstName());
        assertEquals(expected.getLastName(), actual.getLastName());
        assertEquals(expected.getEmail(), actual.getEmail());
        assertEquals(expected.getRoles().toString(), actual.getRoles().toString());
    }

}
