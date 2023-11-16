package list;

import linked.ListaLigada;

public class FilaClara implements Fila{

    private ListaLigada l;

    @Override
    public void enqueue(int item) { // entra na fila
        l.insereFim(item);
    }

    @Override
    public int dequeue() { // sair da fila
        int num = l.buscaIndice(0);
        l.removeInicio();
        return num;
    }

    @Override
    public boolean isEmpty() {
        if (l == null) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return l.getIndice() + 1;
    }
    
}
