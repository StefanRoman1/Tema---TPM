public class Salbatic extends Thread{
    public Oala oala;

    public Salbatic(Oala oala) {
        this.oala = oala;
    }

    public void run() {
        while(true) {
            oala.lock.lock();
            try{
                if(oala.capacitate > 0) {
                    oala.mananca();
                    System.out.println("Salbaticul a mancat");
                    break;
                }
            } finally {
                oala.lock.unlock();

            }
        }
    }
}
