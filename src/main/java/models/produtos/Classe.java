
package models.produtos;

import java.util.ArrayList;


public class Classe {
    private int id;
    private String descricao;
    private ArrayList<Produto> produtos;

    public Classe(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.produtos = new ArrayList();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
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
}
