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

    private List<LancamentosGastos> valoresGastos = new ArrayList<>();
    private List<LancamentosGastos> datasGastos = new ArrayList<>();
    private List<LancamentosGastos> quantidadesPorConsumos = new ArrayList<>();

    public LancamentosGastos() {
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

    public List<LancamentosGastos> getValoresGastos() {
        return valoresGastos;
    }

    public void salvarValoresGastos(String arquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            outputStream.writeObject(valoresGastos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarValoresGastos(String arquivo) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arquivo))) {
            valoresGastos = (List<LancamentosGastos>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void criarValorGasto(LancamentosGastos valorGasto) {
        valoresGastos.add(valorGasto);
        salvarValoresGastos("valores_gastos.dat");
    }

    public void deletarValorGasto(LancamentosGastos valorGasto) {
        valoresGastos.remove(valorGasto);
        salvarValoresGastos("valores_gastos.dat");
    }

    public void alterarValorGasto(int index, LancamentosGastos newValorGasto) {
        valoresGastos.set(index, newValorGasto);
        salvarValoresGastos("valores_gastos.dat");
    }

    public List<LancamentosGastos> getDatasGastos() {
        return datasGastos;
    }

    public void criarDataGasto(LancamentosGastos dataGasto) {
        datasGastos.add(dataGasto);
    }

    public void deletarDataGasto(LancamentosGastos dataGasto) {
        datasGastos.remove(dataGasto);
    }

    public void alterarDataGasto(int index, LancamentosGastos newDataGasto) {
        datasGastos.set(index, newDataGasto);
    }

    public List<LancamentosGastos> getQuantidadesPorConsumos() {
        return quantidadesPorConsumos;
    }

    public void criarQuantidadePorConsumo(LancamentosGastos quantidadePorConsumo) {
        quantidadesPorConsumos.add(quantidadePorConsumo);
    }

    public void deletarQuantidadePorConsumo(LancamentosGastos quantidadePorConsumo) {
        quantidadesPorConsumos.remove(quantidadePorConsumo);
    }

    public void alterarQuantidadePorConsumo(int index, LancamentosGastos newQuantidadePorConsumo) {
        quantidadesPorConsumos.set(index, newQuantidadePorConsumo);
    }
}