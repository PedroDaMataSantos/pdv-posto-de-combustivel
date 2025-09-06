package com.br.domain.entity;

//imports
import java.math.BigDecimal;
import java.util.Date;

public class Estoque {
    
    // atributos

    private BigDecimal quantidade;
    private String localTanque;
    private String localEndereco;
    private String loteFabrica;
    private String dataValidade;

    //construtor

    public Estoque(String localEndereco,String localTanque,String loteFabrica,BigDecimal quantidade,String dataValidade){
    this.quantidade=quantidade;
    this.localEndereco=localEndereco;
    this.localTanque=localTanque;
    this.loteFabrica=loteFabrica;
    this.dataValidade=dataValidade;
    }

    //getters

    public String getLocalEndereco(){
        return localEndereco;
    }
    public String getLocalTanque(){
        return localTanque;
    }
    public String getLotefabrica(){
        return loteFabrica;
    }
    public BigDecimal getQuantidade(){
        return quantidade;
    }
    public String getDataValidade(){
        return dataValidade;
    }

    //setter
    public void setLoteFabrica(String loteFabrica){
        this.loteFabrica=loteFabrica;
    }
    public void setQuantidade(BigDecimal quantidade){
        this.quantidade=quantidade;
    }
    public void setDataValidade(String dataValidade){
        this.dataValidade=dataValidade;
    }
    public void setLocalTanque(String localTanque){
        this.localTanque=localTanque;
    }
    public void setLocalEndereco(String localEndereco){
        this.localEndereco=localEndereco;





    
    }
    //fim
        
    }

