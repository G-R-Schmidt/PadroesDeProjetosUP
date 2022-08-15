package models;

public class Cobranca {

    private Long id;
    private Pedido pedido;
    private Pagamento pagamento;

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    public static Cobranca cobrar(Pedido pedido, Pagamento pagamento){

       Cobranca cobranca =  new Cobranca();
       cobranca.setId(1L);
       cobranca.setPagamento(pagamento);
       cobranca.setPedido(pedido);

       return cobranca;
    }


}
