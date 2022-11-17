
package models.vendas;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import models.pessoas.Cliente;
import models.pessoas.Colaborador;

public class CupomFiscal {
    private UUID uuid;
    private Date dataVenda;
    private String horaVenda;
    private float valorDesconto;
    private float valorAcrescimo;
    private float valorTotal;
    private char status;
    private Cliente cliente;
    private Colaborador colaborador;
    private ArrayList<ItensCupomFiscal> itensCupom;

    public CupomFiscal(
        UUID uuid, 
        Date dataVenda, 
        String horaVenda, 
        float valorDesconto, 
        float valorAcrescimo, 
        float valorTotal, 
        char status, 
        Cliente cliente, 
        Colaborador colaborador
    ) {
        this.uuid = uuid;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorTotal = valorTotal;
        this.status = status;
        this.cliente = cliente;
        this.colaborador = colaborador;
        this.itensCupom = new ArrayList();
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public ArrayList<ItensCupomFiscal> getItensCupom() {
        return itensCupom;
    }
}
