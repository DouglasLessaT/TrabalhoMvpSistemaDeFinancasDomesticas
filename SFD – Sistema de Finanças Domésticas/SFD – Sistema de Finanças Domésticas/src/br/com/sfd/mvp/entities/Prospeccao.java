package br.com.sfd.mvp.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Prospeccao {
    private int idProspeccao;
    private String descricao;
    private float valor;
    private int parcelas;

    public Prospeccao (){
    }

    public Prospeccao (int idProspeccao, String descricao, float valor, int parcelas) {
        super();
        this.idProspeccao = idProspeccao;
        this.descricao = descricao;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public void descricaoSimulador() {
        System.out.println("Descrição do Simulador: " + descricao);
    }
    
    public void inserirValor(float valor) {
        this.valor = valor;
    }
    
    public void inserirParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    
    public void executarProspeccao() {
        System.out.println("Executando prospecção...");
        System.out.println("ID: " + idProspeccao);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Parcelas: " + parcelas);
    }
    public void salvarProspeccao(String arquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            outputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Prospeccao carregarProspeccao(String arquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo))) {
            return (Prospeccao) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

	public int getIdProspeccao() {
		// TODO Auto-generated method stub
		return idProspeccao;
	}

	public String getDescricao() {
		// TODO Auto-generated method stub
		return descricao;
	}

	public float getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	public int getParcelas() {
		// TODO Auto-generated method stub
		return parcelas;
	}

	public char[] getId() {
		// TODO Auto-generated method stub
		return null;
	}
	
    public void executarProspeccao1() {
        // Restante do código...
        salvarProspeccao("prospeccao.dat");
    }
}

