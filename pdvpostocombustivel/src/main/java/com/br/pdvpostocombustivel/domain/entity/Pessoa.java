package com.br.pdvpostocombustivel.domain.entity;
// imports
import java.util.Date;

public class Pessoa {

    // atributos
    private String nomeCompleto;

    private String cpfCnpj;

    private Date dataNascimento;

    private Integer numeroCtps;

    private Double salario;

    //construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, Integer numeroCtps,Double salario) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
        this.salario = salario;


    }

    //getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;

    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public Integer getNumeroCtps() {
        return numeroCtps;
    }

    public Double getSalario() {
        return salario;
    }

    //setter

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setCpf(Integer numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

     public void salario(Double salario) {
        this.salario = salario;
    }
    //fim

}


