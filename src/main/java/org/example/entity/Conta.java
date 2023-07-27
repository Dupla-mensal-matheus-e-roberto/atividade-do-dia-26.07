package org.example.entity;

import java.math.BigDecimal;

public class Conta {

    private String nome_completo;
    private double saldo;
    private double saldo_investido;

    public Conta(double valor, String nome){
        this.saldo = valor;
        this.nome_completo = nome;
        this.saldo_investido = 0;
    }

    public double resgatarSaldo(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Valor R$ " + valor + " resgatado!");
        }else{
            System.out.println("O valor inserido é maior do que o saldo atual!");
        }
        return this.saldo;
    }

    public double depositarSaldo(double valor){
        return this.saldo += valor;
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: R$ " + String.format("%.2f",this.saldo) + "\n" +
                "Valor investido: R$ " + String.format("%.2f",this.saldo_investido) + "\n");
    }

    public void investirSaldo(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            this.saldo_investido += valor;
            System.out.println("Valor R$ " + String.format("%.2f",valor) + " investido!");
        }else{
            System.out.println("O valor inserido é maior do que o saldo atual!");
        }
    }

    public void bonus(){
        this.saldo_investido = this.saldo_investido * 1.05;
    }
    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo_investido() {
        return saldo_investido;
    }

    public void setSaldo_investido(double saldo_investido) {
        this.saldo_investido = saldo_investido;
    }
}
