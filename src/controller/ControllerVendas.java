package controller;

import model.ModelEstoque;

import java.util.ArrayList;
import java.util.Scanner;

public class ControllerVendas {
    Scanner in = new Scanner(System.in);

    private ModelEstoque quantidadeDisponivelVenda = new ModelEstoque();
    private ModelEstoque nomeProdutoDisponivelVenda = new ModelEstoque();
    private ModelEstoque precoProdutoVenda = new ModelEstoque();
    private ArrayList<Integer> quantidadeVendida;
    private double precoTotalCompra = 0.00;

    public void vendeProdutoCliente() {
        this.quantidadeVendida = new ArrayList();

        System.out.println("Insira quantidade de cada produto a ser comprada: ");
        System.out.println(this.nomeProdutoDisponivelVenda.getNomeProdutoDisponivelEstoque());

        for (int posicaoProduto = 0; posicaoProduto <= 2; posicaoProduto++) {
            int auxQuantidadeVendida = in.nextInt();
            int quantidadeDisponivelPosicao = this.quantidadeDisponivelVenda.getQuantidadeProdutoDisponivelEstoque().get(posicaoProduto);

            if (quantidadeDisponivelPosicao < auxQuantidadeVendida) {
                System.out.println("Nao possuimos os itens em estoque, estamos providencianto a compra com o fornecedor!");
                this.quantidadeDisponivelVenda.getQuantidadeProdutoDisponivelEstoque().set(posicaoProduto, quantidadeDisponivelPosicao + auxQuantidadeVendida);
                System.out.println("Reabastecemos os estoques!");
            }
            this.quantidadeVendida.add(auxQuantidadeVendida);
        }
        for (int posicaoProdutoDecrementado = 0; posicaoProdutoDecrementado <= 2; posicaoProdutoDecrementado++) {
            int quantidadeAnteriorEstoque = this.quantidadeDisponivelVenda.getQuantidadeProdutoDisponivelEstoque().get(posicaoProdutoDecrementado);
            int quantidadeNovaEstoque = this.quantidadeVendida.get(posicaoProdutoDecrementado);
            this.quantidadeDisponivelVenda.getQuantidadeProdutoDisponivelEstoque().set(posicaoProdutoDecrementado,quantidadeAnteriorEstoque - quantidadeNovaEstoque);
        }

        System.out.println("Os produtos comprados sao: ");
        System.out.println(this.nomeProdutoDisponivelVenda.getNomeProdutoDisponivelEstoque());

        for (int posicaoCompra = 0; posicaoCompra <= 2; posicaoCompra++){
            double precoProdutoEstoque = this.precoProdutoVenda.getPrecoProdutoVenda().get(posicaoCompra);
            int quantidadeVenda = this.quantidadeVendida.get(posicaoCompra);

            this.precoTotalCompra += (quantidadeVenda * precoProdutoEstoque);
        }

        System.out.println("O valor total da compra e: R$" + this.precoTotalCompra);
        System.out.println("Compra realizada com sucesso!");
    }

    public double getPrecoTotalCompra() {
        return precoTotalCompra;
    }
}
