package com.br;

import java.util.Date;


import com.br.pdvpostocombustivel.domain.entity.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNomeCompleto("João da Silva");
        pessoa1.setCpfCnpj("123.456.789-00");
        pessoa1.setDataNascimento(new Date(90, 7, 29));
        pessoa1.setNumeroCtps(123456);
        
        System.out.println("Nome Completo: " + pessoa1.getNomeCompleto());
        System.out.println("CPF/CNPJ: " + pessoa1.getCpfCnpj());
        System.out.println("Data de Nascimento: " + pessoa1.getDataNascimento());
        System.out.println("Número da CTPS: " + pessoa1.getNumeroCtps());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNomeCompleto("Maria Oliveira");
        pessoa2.setCpfCnpj("987.654.321-00");
        pessoa2.setDataNascimento(new Date(85, 4, 15)); 
        pessoa2.setNumeroCtps(654321);

        System.out.println("Nome Completo: " + pessoa2.getNomeCompleto());
        System.out.println("CPF/CNPJ: " + pessoa2.getCpfCnpj());
        System.out.println("Data de Nascimento: " + pessoa2.getDataNascimento());
        System.out.println("Número da CTPS: " + pessoa2.getNumeroCtps());

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNomeCompleto("Carlos Pereira");
        pessoa3.setCpfCnpj("111.222.333-44");
        pessoa3.setDataNascimento(new Date(92, 11, 5)); 
        pessoa3.setNumeroCtps(789012);
        
        System.out.println("Nome Completo: " + pessoa3.getNomeCompleto());
        System.out.println("CPF/CNPJ: " + pessoa3.getCpfCnpj());
        System.out.println("Data de Nascimento: " + pessoa3.getDataNascimento());
        System.out.println("Número da CTPS: " + pessoa3.getNumeroCtps());


    }
}
