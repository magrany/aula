package br.com.senai.infoa.backend.aula.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudante")
public class Estudante {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "email")
  private String email;

  @Column(name = "data_nascimento")
  private LocalDate dataNascimento;

  @ManyToOne
  @JoinColumn(name = "endereco_id")
  private Endereco endereco;

  @ManyToMany
  @JoinTable(name = "estudante_materia", joinColumns = @JoinColumn(name = "estudante_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "materia_id", referencedColumnName = "id"))
  private List<Materia> materias;

  public Estudante() {
  }

  public Estudante(String nome, String email, LocalDate dataNascimento, Endereco endereco, Integer id) {
    this.nome = nome;
    this.email = email;
    this.dataNascimento = dataNascimento;
    this.endereco = endereco;
    this.id = id;
  }

  public Estudante(String email, Integer id, String nome) {
    this.email = email;
    this.id = id;
    this.nome = nome;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  public List<Materia> getMaterias() {
    return materias;
  }

  public void setMaterias(List<Materia> materias) {
    this.materias = materias;
  }

}
