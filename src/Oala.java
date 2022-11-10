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
        if(capacitate == 0) {
            umple();
        }
        capacitate = capacitate - 1;
    }

    public void umple() {
        System.out.println("Bucatarul a umplut oala");
        capacitate = capacitateMaxima;
    }
}
