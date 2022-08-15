package models;

public class Pagamento {
    private Long id;
    private String tipoPgto;

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

    public String getTipoPgto() {
        return tipoPgto;
    }

    public void setTipoPgto(String tipoPgto) {
        this.tipoPgto = tipoPgto;
    }


    public static String validar(Pagamento pagamento) {
        return "Metodo de pagamento " + pagamento.getTipoPgto() + " validado com sucesso";
    }

}
