
package models.vendas;

import java.util.ArrayList;
import java.util.UUID;
import models.produtos.HistoricoMovimentacao;
import models.produtos.Produto;


public class ItensCupomFiscal {
    private UUID uuid;
    private float quantidadeProduto;
    private float valorUnitarioProduto;
    private char status;
    private Produto produto;
    private CupomFiscal cupomFiscal;
    private ArrayList<HistoricoMovimentacao> historicosMovimentacoes;

    public ItensCupomFiscal(
        UUID uuid, 
        float quantidadeProduto, 
        float valorUnitarioProduto, 
        char status, 
        Produto produto, 
        CupomFiscal cupomFiscal
    ) {
        this.uuid = uuid;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.status = status;
        this.produto = produto;
        this.cupomFiscal = cupomFiscal;
    }

    public float getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(float quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public void setValorUnitarioProduto(float valorUnitarioProduto) {
        this.valorUnitarioProduto = valorUnitarioProduto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public CupomFiscal getCupomFiscal() {
        return cupomFiscal;
    }

    public void setCupomFiscal(CupomFiscal cupomFiscal) {
        this.cupomFiscal = cupomFiscal;
    }

    public ArrayList<HistoricoMovimentacao> getHistoricosMovimentacoes() {
        return historicosMovimentacoes;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
    
    
}
