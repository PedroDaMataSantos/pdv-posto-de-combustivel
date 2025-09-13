package com.br.pdvpostocombustivel.domain.entity;
// imports
import java.util.Date;

public class Pessoa {

    // atributos
    private String nomeCompleto;

    private String cpfCnpj;

    private Date dataNascimento;

    private int numeroCtps;

    private Double salario;

    //construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, int numeroCtps,Double salario) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
        this.salario = salario;


    }

    //classe

    public Pessoa() {
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

    public int getNumeroCtps() {
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

    public void setNumeroCtps(int numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

     public void salario(Double salario) {
        this.salario = salario;
    }
    //fim

}


