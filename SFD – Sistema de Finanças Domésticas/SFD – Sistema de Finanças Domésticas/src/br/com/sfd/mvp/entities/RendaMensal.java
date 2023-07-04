package br.com.sfd.mvp.entities;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RendaMensal {
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

    public void carregarRendaMensal(String arquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo))) {
            rendaMensal = (List<RendaMensal>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
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

    public float obterSaldo() {
        float saldoTotal = 0;
        for (RendaMensal renda : rendaMensal) {
            saldoTotal += renda.valor;
        }
        return saldoTotal;
    }

    public void mostrarRelatorios() {
        System.out.println("ID: " + idRendaMensal);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Descrição: " + descricao);
    }

    public void inserirRendaMensal(RendaMensal renda) {
        rendaMensal.add(renda);
        salvarRendaMensal("renda_mensal.dat");
    }

    public void deletarRendaMensal(int idRendaMensal) {
        for (RendaMensal renda : rendaMensal) {
            if (renda.getIdRendaMensal() == idRendaMensal) {
                rendaMensal.remove(renda);
                salvarRendaMensal("renda_mensal.dat");
                break;
            }
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

    public int getIdRendaMensal() {
        return idRendaMensal;
    }
}