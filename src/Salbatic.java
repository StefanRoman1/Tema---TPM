public class Salbatic extends Thread{
    public Oala oala;

    public Salbatic(Oala oala) {
        this.oala = oala;
    }

    public void run() {
        oala.lock.lock();
        System.out.println("Un salbatic vrea sa manance iar capacitatea este " + oala.capacitate);
        oala.mananca();
        oala.lock.unlock();
        }
    }
