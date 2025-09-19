package com.br.pdvpostocombustivel.domain.entity;
// imports
import jakarta.persistence.*;
import jakarta.websocket.OnMessage;
import java.time.LocalDate;

// anotations
@Entity
@Table(name="pessoa")

public class Pessoa {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    
    @Column(length = 200,nullable = false)
    private String nomeCompleto;

    @Column(length = 14,nullable = false)
    private String cpfCnpj;

    @Column(length=8,nullable = false)
    private LocalDate dataNascimento;


    @Column(length = 14)
    private int numeroCtps;

    //construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, LocalDate dataNascimento, int numeroCtps,Double salario) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
       


    }

    //classe

    public Pessoa() {
    }

    

    //getters

    public long getId() {
        return id;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;

    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public int getNumeroCtps() {
        return numeroCtps;
    }

  


    //setter

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setNumeroCtps(int numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

    //fim

}


