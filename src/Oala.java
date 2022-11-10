import java.util.concurrent.locks.ReentrantLock;

public class Oala {
    public int capacitate;
    public int capacitateMaxima;

    ReentrantLock lock = new ReentrantLock();

    public Oala(int n) {
        capacitate = n;
        capacitateMaxima = n;
    }

    public void mananca() {
        capacitate = capacitate - 1;
    }

    public void umple() {
        capacitate = capacitateMaxima;
    }
}
