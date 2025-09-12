package com.br.pdvpostocombustivel.domain.entity;
public class FluxoCaixa {

    //atributos
    private Double entrada;
    private Double saida;
    private Double depreciacao;
    private Double emprestimo;
    private Double outrasEntradas;
    private Double outrasSaidas;
    private double saldoFinal;

    //construtor
    public FluxoCaixa(Double entrada, Double saida, Double depreciacao, Double emprestimo, Double outrasEntradas, Double outrasSaidas) {
        this.entrada = entrada;
        this.saida = saida;
        this.depreciacao = depreciacao;
        this.emprestimo = emprestimo;
        this.outrasEntradas = outrasEntradas;
        this.outrasSaidas = outrasSaidas;
    }
    //metodos
    public double calcularSaldoFinal() {
        saldoFinal = (entrada + outrasEntradas + emprestimo) - (saida + outrasSaidas + depreciacao);
        System.out.println("O saldo final do caixa é: R$ " + saldoFinal);
        return saldoFinal;
    }
    //getters
    public Double getEntrada() {
        return entrada;
    }
    public Double getSaida() {
        return saida;
    }
    public Double getDepreciacao() {
        return depreciacao;
    }
    public Double getEmprestimo() {
        return emprestimo;
    }
    public Double getOutrasEntradas() {
        return outrasEntradas;
    }
    public Double getOutrasSaidas() {
        return outrasSaidas;
    }
    public double getSaldoFinal() {
        return saldoFinal;
    }
    //setters
    public void setEntrada(Double entrada) {
        this.entrada = entrada;
    }
    public void setSaida(Double saida) {
        this.saida = saida;
    }
    public void setDepreciacao(Double depreciacao) {
        this.depreciacao = depreciacao;
    }
    public void setEmprestimo(Double emprestimo) {
        this.emprestimo = emprestimo;
    }
    public void setOutrasEntradas(Double outrasEntradas) {
        this.outrasEntradas = outrasEntradas;
    }
    public void setOutrasSaidas(Double outrasSaidas) {
        this.outrasSaidas = outrasSaidas;
    }
    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    //fim 
    
}
