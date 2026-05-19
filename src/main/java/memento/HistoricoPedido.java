package memento;

import java.util.ArrayList;
import java.util.List;

public class HistoricoPedido {

    private List<PedidoMemento> historico =
            new ArrayList<>();

    public void adicionarMemento(
            PedidoMemento memento
    ) {
        historico.add(memento);
    }

    public PedidoMemento getMemento(int indice) {
        return historico.get(indice);
    }
}
