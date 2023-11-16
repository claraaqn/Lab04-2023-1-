package list;

public class FilaComPilhaClara implements FilaComPilha{

    private PilhaClara p1;
    private PilhaClara p2;

    public FilaComPilhaClara(){
        this.p1 = new PilhaClara();
        this.p2 = new PilhaClara();
    }

    @Override
    public void enqueue(int item) {
        p1.push(item);
    }

    @Override
    public int dequeue() {
        if(p2.isEmpty()){
            while (!p1.isEmpty()){
                int n = p1.pop();
                p2.push(n);
            }
        }
        return p2.pop();
    }

    @Override
    public boolean isEmpty() {
        if (p1.isEmpty() && p2.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }
    
}
