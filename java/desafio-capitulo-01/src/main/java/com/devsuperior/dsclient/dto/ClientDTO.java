package com.devsuperior.dsclient.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.dsclient.entities.Client;

public class ClientDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant birthDate;
    private Integer children;

    public ClientDTO() { }

    public ClientDTO(Long id, String name, String cpf, Double income, Instant birthDate, Integer children) {
        setId(id);
        setName(name);
        setCpf(cpf);
        setIncome(income);
        setBirthDate(birthDate);
        setChildren(children);
    }

    public ClientDTO(Client entity) {
        setId(entity.getId());
        setName(entity.getName());
        setCpf(entity.getCpf());
        setIncome(entity.getIncome());
        setBirthDate(entity.getBirthDate());
        setChildren(entity.getChildren());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

}
