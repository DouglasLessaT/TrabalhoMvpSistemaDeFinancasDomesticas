package br.com.sfd.mvp.entities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RendaMensal implements Serializable {
    private static final long serialVersionUID = 1L;
    private int idRendaMensal;
    private float valor;
    private Date data;
    private String descricao;
    private List<RendaMensal> rendaMensal;

    public RendaMensal() {
        rendaMensal = new ArrayList<>();
    }
    
    public RendaMensal(int idRendaMensal, float valor, Date data, String descricao) {
        this.idRendaMensal = idRendaMensal;
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public void salvarRendaMensal(String arquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            outputStream.writeObject(rendaMensal);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static RendaMensal carregarRendaMensal(String arquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo))) {
            return(RendaMensal) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void inserirValor(float valor) {
        this.valor = valor;
    }

    public void inserirData(Date data) {
        this.data = data;
    }

    public void inserirDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setIdRendaMensal(int idRendaMensal) {
		this.idRendaMensal = idRendaMensal;
	}

	public float obterSaldo() {
        float saldoTotal = 0;
        for (RendaMensal renda : rendaMensal) {
            saldoTotal += renda.valor;
        }
        return saldoTotal;
    }

    public void mostrarRelatorios() {
        for (RendaMensal renda : rendaMensal) {
            System.out.println("ID: " + renda.idRendaMensal);
            System.out.println("Valor: " + renda.valor);
            System.out.println("Data: " + renda.data);
            System.out.println("Descrição: " + renda.descricao);
            System.out.println();
        }
    }

    public void inserirRendaMensal(RendaMensal renda) {
        rendaMensal.add(renda);
        salvarRendaMensal("renda_mensal.dat");
    }

    public void deletarRendaMensal(int idRendaMensal) {
        RendaMensal rendaRemovida = null;
        for (RendaMensal renda : rendaMensal) {
            if (renda.getIdRendaMensal() == idRendaMensal) {
                rendaRemovida = renda;
                break;
            }
        }
        if (rendaRemovida != null) {
            rendaMensal.remove(rendaRemovida);
            salvarRendaMensal("renda_mensal.dat");
        }
    }

    public void alterarRendaMensal(RendaMensal rendaAtualizada) {
        for (int i = 0; i < rendaMensal.size(); i++) {
            RendaMensal renda = rendaMensal.get(i);
            if (renda.getIdRendaMensal() == rendaAtualizada.getIdRendaMensal()) {
                rendaMensal.set(i, rendaAtualizada);
                salvarRendaMensal("renda_mensal.dat");
                break;
            }
        }
    }

    public RendaMensal buscarRendaMensalPorId(int idRendaMensal) {
        for (RendaMensal renda : rendaMensal) {
            if (renda.getIdRendaMensal() == idRendaMensal) {
                return renda;
            }
        }
        return null;
    }

    public int getIdRendaMensal() {
        return idRendaMensal;
    }
}