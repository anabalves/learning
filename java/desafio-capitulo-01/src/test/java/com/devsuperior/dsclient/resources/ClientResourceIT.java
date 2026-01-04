package com.devsuperior.dsclient.resources;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.devsuperior.dsclient.dto.ClientDTO;
import com.devsuperior.dsclient.tests.Factory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class ClientResourceIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private Long existingId;
    private Long nonExistingId;
    private Long countTotalClients;

    private Integer page;

    private Integer linesPerPage;

    private String direction;

    private String orderBy;


    @BeforeEach
    void setUp() throws Exception {
        existingId = 1L;
        nonExistingId = 1000L;
        countTotalClients = 25L;

        page = 0;
        linesPerPage = 6;
        direction = "ASC";
        orderBy = "name";
    }

    @Test
    public void findAllShouldReturnSortedPageWhenSortByName() throws Exception {
        ResultActions result =
                mockMvc.perform(get(String.format("/clients?page=%d&linesPerPage=%d&direction=%s&orderBy=%s", page, linesPerPage, direction, orderBy))
                        .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.totalElements").value(countTotalClients));
        result.andExpect(jsonPath("$.content").exists());
        result.andExpect(jsonPath("$.size").value(6));
        result.andExpect(jsonPath("$.content[0].name").value("Adelir Lima Soares"));
        result.andExpect(jsonPath("$.content[1].name").value("Alice Limeira Dutra"));
        result.andExpect(jsonPath("$.content[2].name").value("Alzira Sarmanto Paula"));
        result.andExpect(jsonPath("$.content[3].name").value("Ana Cristina de Rodrigues Theodoro"));
        result.andExpect(jsonPath("$.content[4].name").value("Brunna Fontes Matta"));
        result.andExpect(jsonPath("$.content[5].name").value("Casemiro Temperini Lacerda"));
    }

    @Test
    public void findByIdShouldReturnClientDTOWhenIdExists() throws Exception {
        ResultActions result = mockMvc.perform(get("/clients/{id}", existingId)
                .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.id").value(existingId));
        result.andExpect(jsonPath("$.name").exists());
        result.andExpect(jsonPath("$.cpf").exists());
        result.andExpect(jsonPath("$.income").exists());
        result.andExpect(jsonPath("$.birthDate").exists());
        result.andExpect(jsonPath("$.children").exists());
    }

    @Test
    public void findByIdShouldReturnNotFoundWhenIdDoesNotExist() throws Exception {
        ResultActions result = mockMvc.perform(get("/clients/{id}", nonExistingId)
                .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isNotFound());
    }

    @Test
    public void insertShouldReturnClientDTOAndCreatedStatus() throws Exception {
        ClientDTO clientDTO = Factory.createClientDTO();
        String jsonBody = objectMapper.writeValueAsString(clientDTO);

        ResultActions result = mockMvc.perform(post("/clients")
                .content(jsonBody)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isCreated());
        result.andExpect(jsonPath("$.id").exists());
        result.andExpect(jsonPath("$.name").value(clientDTO.getName()));
        result.andExpect(jsonPath("$.cpf").value(clientDTO.getCpf()));
        result.andExpect(jsonPath("$.income").value(clientDTO.getIncome()));
        result.andExpect(jsonPath("$.birthDate").value(String.valueOf(clientDTO.getBirthDate())));
        result.andExpect(jsonPath("$.children").value(clientDTO.getChildren()));
    }

    @Test
    public void updateShouldReturnClientDTOWhenIdExists() throws Exception {
        ClientDTO clientDTO = Factory.createClientDTO();
        String jsonBody = objectMapper.writeValueAsString(clientDTO);

        ResultActions result =
                mockMvc.perform(put("/clients/{id}", existingId)
                        .content(jsonBody)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk());
        result.andExpect(jsonPath("$.id").value(existingId));
        result.andExpect(jsonPath("$.name").value(clientDTO.getName()));
        result.andExpect(jsonPath("$.cpf").value(clientDTO.getCpf()));
        result.andExpect(jsonPath("$.income").value(clientDTO.getIncome()));
        result.andExpect(jsonPath("$.birthDate").value(String.valueOf(clientDTO.getBirthDate())));
        result.andExpect(jsonPath("$.children").value(clientDTO.getChildren()));
    }

    @Test
    public void updateShouldReturnNotFoundWhenIdDoesNotExist() throws Exception {
        ClientDTO clientDTO = Factory.createClientDTO();
        String jsonBody = objectMapper.writeValueAsString(clientDTO);

        ResultActions result =
                mockMvc.perform(put("/clients/{id}", nonExistingId)
                        .content(jsonBody)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isNotFound());
    }

    @Test
    public void deleteShouldReturnNoContentWhenIdExists() throws Exception {
        ResultActions result = mockMvc.perform(delete("/clients/{id}", existingId)
                .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isNoContent());
    }

    @Test
    public void deleteShouldReturnNotFoundWhenIdDoesNotExist() throws Exception {
        ResultActions result = mockMvc.perform(delete("/clients/{id}", nonExistingId)
                .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isNotFound());
    }

}
