package controller;

import model.ModelCliente;
import java.util.Scanner;

public class ControllerCliente {
    Scanner in = new Scanner(System.in);

    private ModelCliente quantidadeDisponivelCarteira = new ModelCliente();
    private ControllerVendas precoTotalCompra;

    public ControllerCliente(ControllerVendas precoTotalCompra) {
        this.precoTotalCompra = precoTotalCompra;
    }

    public boolean pagamentoProdutoCliente() {
        System.out.println("Deseja efetuar o pagamento? Sim ou Nao");
        String resposta = in.nextLine();
        if (resposta.equals("Sim")) {
            double quantidadeDisponivelCarteira = this.quantidadeDisponivelCarteira.getCarteiraCliente();
            double valorCompra = this.precoTotalCompra.getPrecoTotalCompra();
            this.quantidadeDisponivelCarteira.setCarteiraCliente(quantidadeDisponivelCarteira - valorCompra);
            System.out.println("Pagamento efetuado!");
            return true;
        }
        else {
            System.out.println("Nao vendemos fiado!");
        }
        return false;
    }

}
