package com.br.pdvpostocombustivel.domain.entity;
public class Produto {
    
    private String nome;
    private String fornecedor;
    private String categoria;
    private String marca;

    //construtor
    public Produto(String nome, String fornecedor, String categoria, String marca) {
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
        this.marca = marca;
    }
    //getters
    public String getNome() {
        return nome;
    }
    public String getFornecedor() {
        return fornecedor;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getMarca() {
        return marca;
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //fim
}
