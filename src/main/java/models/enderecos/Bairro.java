
package models.enderecos;

import java.util.ArrayList;

public class Bairro {
    private int id;
    private String descricao;
    private ArrayList<Endereco> enderecos;

    public Bairro(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.enderecos = new ArrayList();
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

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }
    
}
