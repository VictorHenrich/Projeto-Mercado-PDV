
package models.produtos;

import java.util.Date;
import java.util.UUID;
import models.vendas.ItensCupomFiscal;

public class HistoricoMovimentacao {
    private UUID uuid;
    private Date data;
    private String hora;
    private char tipo;
    private float quantidade;
    private char status;
    private Produto produto;
    private ItensCupomFiscal itemVenda;

    public HistoricoMovimentacao(
        UUID uuid, 
        Date data, 
        String hora, 
        char tipo, 
        float quantidade, 
        char status, 
        Produto produto, 
        ItensCupomFiscal itemVenda
    ) {
        this.uuid = uuid;
        this.data = data;
        this.hora = hora;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.status = status;
        this.produto = produto;
        this.itemVenda = itemVenda;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
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

    public ItensCupomFiscal getItemVenda() {
        return itemVenda;
    }

    public void setItemVenda(ItensCupomFiscal itemVenda) {
        this.itemVenda = itemVenda;
    }
    
    
}
