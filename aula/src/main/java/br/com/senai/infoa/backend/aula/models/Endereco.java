package br.com.senai.infoa.backend.aula.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "cep")
    private String cep;

    @Column(name = "numero")
    private String numero;

    // Getters and Setters

    public Endereco() {
    }

    public Endereco(String cep, String numero, Integer id) {
        this.cep = cep;
        this.numero = numero;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
