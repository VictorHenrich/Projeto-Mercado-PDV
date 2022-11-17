
package models.produtos;

import java.util.ArrayList;
import java.util.Date;
import models.vendas.ItensCupomFiscal;

public class Produto {
    private int id;
    private String descricao;
    private float valorCompra;
    private float valorVenda;
    private String unidadeCompra;
    private String unidadeVenda;
    private int fatorConversao;
    private char status;
    private Date dataCadastro;
    private String barraSaida;
    private String barraEntrada;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private ArrayList<ItensCupomFiscal> itensVendas;
    private ArrayList<HistoricoMovimentacao> historicos;
    private Classe classe;
    private Marca marca;

    public Produto(   
        int id, 
        String descricao, 
        float valorCompra, 
        float valorVenda, 
        String unidadeCompra, 
        String unidadeVenda, 
        int fatorConversao, 
        char status, 
        Date dataCadastro, 
        String barraSaida, 
        String barraEntrada, 
        int estoqueMinimo, 
        int estoqueMaximo, 
        Classe classe, 
        Marca marca
    ) {
        this.id = id;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.unidadeCompra = unidadeCompra;
        this.unidadeVenda = unidadeVenda;
        this.fatorConversao = fatorConversao;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.barraSaida = barraSaida;
        this.barraEntrada = barraEntrada;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.classe = classe;
        this.marca = marca;
        this.historicos = new ArrayList();
        this.itensVendas = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getUnidadeCompra() {
        return unidadeCompra;
    }

    public void setUnidadeCompra(String unidadeCompra) {
        this.unidadeCompra = unidadeCompra;
    }

    public String getUnidadeVenda() {
        return unidadeVenda;
    }

    public void setUnidadeVenda(String unidadeVenda) {
        this.unidadeVenda = unidadeVenda;
    }

    public int getFatorConversao() {
        return fatorConversao;
    }

    public void setFatorConversao(int fatorConversao) {
        this.fatorConversao = fatorConversao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getBarraSaida() {
        return barraSaida;
    }

    public void setBarraSaida(String barraSaida) {
        this.barraSaida = barraSaida;
    }

    public String getBarraEntrada() {
        return barraEntrada;
    }

    public void setBarraEntrada(String barraEntrada) {
        this.barraEntrada = barraEntrada;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public ArrayList<ItensCupomFiscal> getItensVendas() {
        return itensVendas;
    }

    public ArrayList<HistoricoMovimentacao> getHistoricos() {
        return historicos;
    }
    
    
}
