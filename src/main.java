import controller.ControllerCliente;
import controller.ControllerVendas;

public class main {

    public static void main(String[] args) {
        ControllerVendas vendaProduto = new ControllerVendas();

        vendaProduto.vendeProdutoCliente();

        ControllerCliente pagamento = new ControllerCliente(vendaProduto);
        pagamento.pagamentoProdutoCliente();
    }

}
