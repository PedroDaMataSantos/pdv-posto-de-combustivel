package com.br.pdvpostocombustivel.domain.entity;
// imports
import jakarta.persistence.*;
import java.time.LocalDate;

import com.br.enums.TipoPessoa;

// anotations
@Entity
@Table(name="pessoa")

public class Pessoa {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    
    @Column(name = "nome_completo",length = 200,nullable = false)
    private String nomeCompleto;

    @Column(name = "cpf_cnpj",length = 14,nullable = false)
    private String cpfCnpj;

    @Column(name = "data_nascimento",length=8,nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "numero_ctps",length = 14)
    private int numeroCtps;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_pessoa",nullable = false,length = 20)
    private TipoPessoa tipoPessoa;


    //construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, LocalDate dataNascimento, int numeroCtps,
    Double salario, TipoPessoa tipoPessoa) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
        this.tipoPessoa = tipoPessoa;

    }


    public Pessoa() {
    }

    

    //getters

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

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

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

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


