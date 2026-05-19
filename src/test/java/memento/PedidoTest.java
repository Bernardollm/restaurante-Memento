package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveSalvarHistoricoPedido() {

        Pedido pedido = new Pedido();

        HistoricoPedido historico =
                new HistoricoPedido();

        historico.adicionarMemento(
                pedido.salvar()
        );

        pedido.setEstado("Pedido em preparo");

        historico.adicionarMemento(
                pedido.salvar()
        );

        pedido.setEstado("Pedido entregue");

        assertEquals(
                "Pedido entregue",
                pedido.getEstado()
        );
    }

    @Test
    void deveRestaurarEstadoAnterior() {

        Pedido pedido = new Pedido();

        HistoricoPedido historico =
                new HistoricoPedido();

        historico.adicionarMemento(
                pedido.salvar()
        );

        pedido.setEstado("Pedido em preparo");

        historico.adicionarMemento(
                pedido.salvar()
        );

        pedido.setEstado("Pedido cancelado");

        pedido.restaurar(
                historico.getMemento(1)
        );

        assertEquals(
                "Pedido em preparo",
                pedido.getEstado()
        );
    }
}
