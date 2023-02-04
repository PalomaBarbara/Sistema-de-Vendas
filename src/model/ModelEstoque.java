package model;

import java.util.ArrayList;

public class ModelEstoque {

    private ArrayList<String> nomeProdutoDisponivelEstoque;
    public ArrayList<Integer> quantidadeProdutoDisponivelEstoque;
    private ArrayList<Double> precoProdutoVenda ;

    public ArrayList<String> getNomeProdutoDisponivelEstoque() {
        this.nomeProdutoDisponivelEstoque = new ArrayList();
        this.nomeProdutoDisponivelEstoque.add("arrozEstoque");
        this.nomeProdutoDisponivelEstoque.add("feijaoEstoque");
        this.nomeProdutoDisponivelEstoque.add("fubaEstoque");
        return nomeProdutoDisponivelEstoque;
    }

    public ArrayList<Integer> getQuantidadeProdutoDisponivelEstoque() {
        this.quantidadeProdutoDisponivelEstoque = new ArrayList();
        this.quantidadeProdutoDisponivelEstoque.add(30);
        this.quantidadeProdutoDisponivelEstoque.add(40);
        this.quantidadeProdutoDisponivelEstoque.add(50);
        return quantidadeProdutoDisponivelEstoque;
    }

    public ArrayList<Double> getPrecoProdutoVenda() {
        this.precoProdutoVenda = new ArrayList();
        this.precoProdutoVenda.add(15.0);
        this.precoProdutoVenda.add(10.0);
        this.precoProdutoVenda.add(5.0);
        return precoProdutoVenda;
    }

    public void setNomeProdutoDisponivelEstoque(ArrayList<String> nomeProdutoDisponivelEstoque) {
        this.nomeProdutoDisponivelEstoque = nomeProdutoDisponivelEstoque;
    }

    public void setQuantidadeProdutoDisponivelEstoque(ArrayList<Integer> quantidadeProdutoDisponivelEstoque) {
        this.quantidadeProdutoDisponivelEstoque = quantidadeProdutoDisponivelEstoque;
    }

    public void setPrecoProdutoVenda(ArrayList<Double> precoProdutoVenda) {
        this.precoProdutoVenda = precoProdutoVenda;
    }

}
