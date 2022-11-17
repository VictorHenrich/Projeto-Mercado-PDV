
package models.produtos;

import java.util.ArrayList;

public class Marca {
    private int id;
    private String descricao;
    private ArrayList<Produto> produtos;

    public Marca(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.produtos = new ArrayList();
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

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    
}
