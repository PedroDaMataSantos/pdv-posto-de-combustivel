package com.br.pdvpostocombustivel.domain.entity;

//imports

import java.util.Date;

public class Custo {

    //atributos

    private Double imposto;
    private Double frete;
    private Double custoFixo;
    private Double custoVariavel;
    private Double margemLucro;
    private Date dataProcessamento;

    //contrutor

    public Custo(Double imposto,Double frete,Double custoFixo,Double custoVariavel,Double margemLucro,Date dataProcessamento){
        this.imposto=imposto;
        this.frete=frete;
        this.custoFixo=custoFixo;
        this.custoVariavel=custoVariavel;
        this.custoVariavel=custoVariavel;
        this.margemLucro=margemLucro;
        this.dataProcessamento=dataProcessamento;
    }

    //getter

    public Double getImposto(){
        return imposto;
    }
    public Double getFrete(){
        return frete;
    }
    public Double getCustoFixo(){
        return custoFixo;
    }
    public Double getCustoVariavel(){
        return custoVariavel;
    }
    public Double getMargemLucro(){
        return margemLucro;
    }
    public Date getDataProcessamento(){
        return dataProcessamento;
    }
    //setter
    public void setImposto(Double imposto){
        this.imposto=imposto;
    }
    public void setFrete(Double frete){
        this.frete=frete;
    }
    public void setCustoFixo(Double custoFixo){
        this.custoFixo=custoFixo;
    }
    public void setCustoVariavel(Double custoVariavel){
        this.custoVariavel=custoVariavel;
    }
    public void setMargemLucro(Double margemLucro){
        this.margemLucro=margemLucro;
    }
    public void setDataProcessamento(Date dataProcessamento){
        this.dataProcessamento=dataProcessamento;
    }

    //FIM

    
}
