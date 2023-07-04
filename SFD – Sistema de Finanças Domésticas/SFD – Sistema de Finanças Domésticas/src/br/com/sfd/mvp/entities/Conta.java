package br.com.sfd.mvp.entities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idConta;
    private String nomeConta;
    private String numeroConta;

    private List<Conta> contas;

    public Conta() {
        contas = new ArrayList<>();
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

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public Conta verConta(int idConta) {
        for (Conta conta : contas) {
            if (conta.getIdConta() == idConta) {
                return conta;
            }
        }
        return null;
    }

    public void salvarContas(String arquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            outputStream.writeObject(contas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarContas(String arquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo))) {
            contas = (List<Conta>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Métodos CRUD para contas
    public void inserirConta(Conta conta) {
        contas.add(conta);
        salvarContas("contas.dat");
    }

    public void deletarConta(int idConta) {
        for (Conta conta : contas) {
            if (conta.getIdConta() == idConta) {
                contas.remove(conta);
                salvarContas("contas.dat");
                break;
            }
        }
    }

    public void alterarConta(Conta contaAtualizada) {
        for (int i = 0; i < contas.size(); i++) {
            Conta conta = contas.get(i);
            if (conta.getIdConta() == contaAtualizada.getIdConta()) {
                contas.set(i, contaAtualizada);
                salvarContas("contas.dat");
                break;
            }
        }
    }
}