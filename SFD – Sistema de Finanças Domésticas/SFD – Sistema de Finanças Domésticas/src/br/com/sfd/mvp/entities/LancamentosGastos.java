package br.com.sfd.mvp.entities;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LancamentosGastos implements Serializable {
    private static final long serialVersionUID = 1L;

    private int idLancamentosGerais;
    private float valorGasto;
    private Date dataGasto;
    private String quantidadePorConsumo;

    private static final String ARQUIVO_LANCAMENTOS = "lancamentos.dat";
    private static List<LancamentosGastos> lancamentosList;

    public LancamentosGastos() {
        lancamentosList = new ArrayList<>();
    }

    public LancamentosGastos(int idLancamentosGerais, float valorGasto, Date dataGasto, String quantidadePorConsumo) {
        this.idLancamentosGerais = idLancamentosGerais;
        this.valorGasto = valorGasto;
        this.dataGasto = dataGasto;
        this.quantidadePorConsumo = quantidadePorConsumo;
    }

    public int getIdLancamentosGerais() {
        return idLancamentosGerais;
    }

    public void setIdLancamentosGerais(int idLancamentosGerais) {
        this.idLancamentosGerais = idLancamentosGerais;
    }

    public float getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(float valorGasto) {
        this.valorGasto = valorGasto;
    }

    public Date getDataGasto() {
        return dataGasto;
    }

    public void setDataGasto(Date dataGasto) {
        this.dataGasto = dataGasto;
    }

    public String getQuantidadePorConsumo() {
        return quantidadePorConsumo;
    }

    public void setQuantidadePorConsumo(String quantidadePorConsumo) {
        this.quantidadePorConsumo = quantidadePorConsumo;
    }

    public void salvarLancamento() {
        lancamentosList.add(this);
        salvarListaLancamentos();
    }

    public static List<LancamentosGastos> getLancamentos() {
        carregarListaLancamentos();
        return lancamentosList;
    }

    public static LancamentosGastos buscarLancamentoPorId(int id) {
        carregarListaLancamentos();
        for (LancamentosGastos lancamento : lancamentosList) {
            if (lancamento.getIdLancamentosGerais() == id) {
                return lancamento;
            }
        }
        return null;
    }

    public void atualizarLancamento() {
        carregarListaLancamentos();
        for (int i = 0; i < lancamentosList.size(); i++) {
            if (lancamentosList.get(i).getIdLancamentosGerais() == this.idLancamentosGerais) {
                lancamentosList.set(i, this);
                salvarListaLancamentos();
                return;
            }
        }
    }

    public void excluirLancamento() {
        carregarListaLancamentos();
        lancamentosList.removeIf(lancamento -> lancamento.getIdLancamentosGerais() == this.idLancamentosGerais);
        salvarListaLancamentos();
    }

    private static void salvarListaLancamentos() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(ARQUIVO_LANCAMENTOS))) {
            outputStream.writeObject(lancamentosList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static LancamentosGastos carregarListaLancamentos() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(ARQUIVO_LANCAMENTOS))) {
            return (LancamentosGastos) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            lancamentosList = new ArrayList<>();
            return null;
        }
    }
}