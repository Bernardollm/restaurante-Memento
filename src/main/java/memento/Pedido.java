package memento;

public class Pedido {

    private String estado;

    public Pedido() {
        estado = "Pedido recebido";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public PedidoMemento salvar() {
        return new PedidoMemento(estado);
    }

    public void restaurar(PedidoMemento memento) {
        estado = memento.getEstado();
    }
}
