import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Cobranca criarObjetos(){

        Item item = new Item();
        item.setId(1L);
        item.setNome("KRL");
        item.setPreco(15.05);

        Item item2 = new Item();
        item2.setId(2L);
        item2.setNome("BCT");
        item2.setPreco(31.13);



        List<Item> itensList = new ArrayList<>();
        itensList.add(item);
        itensList.add(item2);

        List<Pagamento> pagamentoList =  new ArrayList<>();
        Pagamento pagamento = new Pagamento();
        pagamento.setId(1L);
        pagamento.setTipoPgto("CuPix");


        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Luiza mel");
        pagamento.setCliente(cliente);
        pagamentoList.add(pagamento);
        cliente.setPagamentos(pagamentoList);




        Pedido pedido = Pedido.criarPedido(itensList, cliente);
        Cobranca cobranca =  Cobranca.cobrar(pedido, pagamento);

        return cobranca;
    }

    public static void main(String[] args) {
        Cobranca cobranca = criarObjetos();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("\n Cliente: " + cobranca.getPedido().getCliente().getNome());
        System.out.println(" Tipo de pagamento: " + cobranca.getPagamento().getTipoPgto());
        System.out.println("\n Itens: ");
        Pedido.mostrarItensDoPedido(cobranca.getPedido());
        System.out.println("\n Total: " + cobranca.getPedido().getTotal() + " reais");
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("\t\t" + Pagamento.validar(cobranca.getPagamento()));
        System.out.println("--------------------------------------------------------------------");
    }



}