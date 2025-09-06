package com.br.domain.entity;

public class Acesso {

    //atributos

    private String usuario;
    private String senha;

    //construtor 

    public Acesso(String usuario,String semha){
        this.usuario=usuario;
        this.senha=semha;
    }

    //getters

    public String getUsuario(){
        return usuario;

    }
    public String senha(){
        return senha;

    }

    //setters

    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }




}
