public class Bucatar extends Thread{
    public Oala oala;

    public Bucatar(Oala oala) {
        this.oala = oala;
    }

    public void run() {
        while(true) {
            oala.lock.lock();
            try{
                if(oala.capacitate == 0) {
                    oala.umple();
                    System.out.println("Bucatarul a umplut oala");
                }
            } finally {
                oala.lock.unlock();
            }
            if(Trib.allFeed) {
                break;
            }
        }
    }
}
