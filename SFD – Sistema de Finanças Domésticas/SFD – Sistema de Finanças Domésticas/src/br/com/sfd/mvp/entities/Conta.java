package br.com.sfd.mvp.entities;

import java.io.Serializable;

public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idConta;
    private String nomeConta;
    private String numeroConta;

    public Conta() {
    }

    public Conta(int idConta, String nomeConta, String numeroConta) {
        this.idConta = idConta;
        this.nomeConta = nomeConta;
        this.numeroConta = numeroConta;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
    
    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void executarConta() {
        System.out.println("Executando conta...");
        System.out.println("ID: " + idConta);
        System.out.println("Nome: " + nomeConta);
        System.out.println("Numero: " + numeroConta);
    }
}