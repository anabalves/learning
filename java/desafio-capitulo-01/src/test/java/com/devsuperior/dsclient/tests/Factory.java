package com.devsuperior.dsclient.tests;

import java.time.Instant;

import com.devsuperior.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.entities.Client;

public class Factory {

    public static Client createClient() {
        return new Client(1L, "Marilena Stutz Anastacio", "28646757498", 800.0, Instant.parse("1979-02-16T03:00:00Z"), 2);
    }

    public static ClientDTO createClientDTO() {
        return new ClientDTO(createClient());
    }

}
