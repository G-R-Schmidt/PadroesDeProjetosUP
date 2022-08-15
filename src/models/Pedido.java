package models;

import java.util.List;

public class Pedido {

    private Long id;
    private List<Item> itens;
    private Double total;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


    public static Pedido criarPedido(List<Item> lista, Cliente cliente) {
        Double total = 0.0;

        for (Item item : lista) {
            total += item.getPreco();
        }

        Pedido pedido = new Pedido();
        pedido.setId(1L);
        pedido.setCliente(cliente);
        pedido.setItens(lista);
        pedido.setTotal(total);

        return pedido;
    }

    public static void mostrarItensDoPedido(Pedido pedido) {
        for (Item item : pedido.getItens()) {
            System.out.println(" " + item.getNome() + ": " + item.getPreco() + " reais");
        }
    }
}
