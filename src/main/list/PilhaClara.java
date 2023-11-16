package list;

import linked.ListaLigada;

public class PilhaClara implements Pilha {
    
    private ListaLigada l;

    public boolean isEmpty(){
        if (l == null) {
            return true;
        }
        return false;
    }
     
    public void push(int item){
        l.insereInicio(item);
    }
 
    public int pop(){
        int num = l.buscaIndice(0);
        l.removeInicio();
        return num;
    }

}