package model;

import java.util.ArrayList;

public class ModelFornecedor {

    private ArrayList<String> nomeProdutoFornecedor;
    public ArrayList<Integer> quantidadeDisponivelFornecedor;
    private ArrayList<Double> precoProdutoFornecedor;

    public ArrayList<String> getNomeProdutoDisponivelFornecedor() {
        this.nomeProdutoFornecedor = new ArrayList();
        this.nomeProdutoFornecedor.add("arrozEstoque");
        this.nomeProdutoFornecedor.add("feijaoEstoque");
        this.nomeProdutoFornecedor.add("fubaEstoque");
        return nomeProdutoFornecedor;
    }

    public ArrayList<Integer> getQuantidadeProdutoDisponivelFornecedor() {
        this.quantidadeDisponivelFornecedor = new ArrayList();
        this.quantidadeDisponivelFornecedor.add(100);
        this.quantidadeDisponivelFornecedor.add(100);
        this.quantidadeDisponivelFornecedor.add(100);
        return quantidadeDisponivelFornecedor;
    }

    public ArrayList<Double> getPrecoProdutoFornecedor() {
        this.precoProdutoFornecedor = new ArrayList();
        this.precoProdutoFornecedor.add(15.0);
        this.precoProdutoFornecedor.add(10.0);
        this.precoProdutoFornecedor.add(5.0);
        return precoProdutoFornecedor;
    }

    public void setNomeProdutoFornecedor(ArrayList<String> nomeProdutoFornecedor) {
        this.nomeProdutoFornecedor = nomeProdutoFornecedor;
    }

    public void setQuantidadeDisponivelFornecedor(ArrayList<Integer> quantidadeDisponivelFornecedor) {
        this.quantidadeDisponivelFornecedor = quantidadeDisponivelFornecedor;
    }

    public void setPrecoProdutoFornecedor(ArrayList<Double> precoProdutoFornecedor) {
        this.precoProdutoFornecedor = precoProdutoFornecedor;
    }

}