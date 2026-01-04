package com.devsuperior.dslearn.tests;

import com.devsuperior.dslearn.entities.Role;
import com.devsuperior.dslearn.entities.User;

public class Factory {

    public static User createUser() {
        User user = new User(1L, "Hugo Teixeira", "hugo@gmail.com", "$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG");
        user.getRoles().add(new Role(1L, "ROLE_OPERATOR"));
        return user;
    }

    public static Role createRole() {
        return new Role(1L, "ROLE_OPERATOR");
    }

}
