package com.devsuperior.dscatalog.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.time.Instant;

import com.devsuperior.dscatalog.dto.*;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.entities.Role;
import com.devsuperior.dscatalog.entities.User;

public class Factory {

    public static Product createProduct() {
        Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-20T03:00:00Z"));
        product.getCategories().add(new Category(1L, "Electronics"));
        return product;
    }

    public static ProductDTO createProductDTO() {
        Product product = createProduct();
        return new ProductDTO(product, product.getCategories());
    }

    public static Category createCategory() {
        return new Category(1L, "Vestuário");
    }

    public static CategoryDTO createCategoryDTO() {
        Category category = createCategory();
        return new CategoryDTO(category);
    }

    public static User createUser() {
        User user = new User(1L, "Hugo", "Teixeira", "hugo@gmail.com", "$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG");
        user.getRoles().add(new Role(1L, "ROLE_OPERATOR"));
        return user;
    }

    public static User createUserDetails() {
        User user = new User(1L, "Maria", "Green", "maria@gmail.com", "$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG");
        user.getRoles().add(new Role(1L, "ROLE_OPERATOR"));
        user.getRoles().add(new Role(2L, "ROLE_ADMIN"));
        return user;
    }

    public static UserDTO createUserDTO() {
        User user = createUser();
        return new UserDTO(user);
    }
    public static UserInsertDTO createUserInsertDTO() {
        try {
            Constructor<UserInsertDTO> constructor = UserInsertDTO.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            UserInsertDTO dto = constructor.newInstance();

            dto.setFirstName("Hugo");
            dto.setLastName("Teixeira");
            dto.setEmail("hugo@gmail.com");
            dto.setPassword("123456");
            dto.getRoles().add(new RoleDTO(1L, "ROLE_OPERATOR"));

            return dto;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    public static UserUpdateDTO createUserUpdateDTO() {
        try {
            Constructor<UserUpdateDTO> constructor = UserUpdateDTO.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            UserUpdateDTO dto = constructor.newInstance();

            dto.setFirstName("Hugo");
            dto.setLastName("Teixeira");
            dto.setEmail("hugo@gmail.com");
            dto.getRoles().add(new RoleDTO(1L, "ROLE_OPERATOR"));

            return dto;
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            return null;
        }
    }

    public static Role createRole() {
        return new Role(1L, "ROLE_OPERATOR");
    }

    public static RoleDTO createRoleDTO() {
        Role role = createRole();
        return new RoleDTO(role);
    }

}
