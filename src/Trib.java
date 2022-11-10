import java.util.ArrayList;
import java.util.List;

public class Trib {
    List<Salbatic> salbatici = new ArrayList<Salbatic>();
    Bucatar bucatar;
    public int numarSalbatici;
    public Oala oala;

    public static boolean allFeed = false;
    public static boolean oalaEmpty = false;

    public Trib(int numarSalbatici, int capacitateOala) throws InterruptedException {
        this.numarSalbatici = numarSalbatici;
        this.oala = new Oala(capacitateOala);
        for (int i = 0; i < numarSalbatici; i++) {
            this.salbatici.add(new Salbatic(oala));
        }
        this.bucatar = new Bucatar(oala);
        bucatar.start();
        for(Salbatic s : salbatici) {
            s.start();
        }
        for(Salbatic s : salbatici) {
            s.join();
        }
        System.out.println("Toti salbaticii au mancat");
        allFeed = true;
        bucatar.join();
        System.out.println("Bucatarul a mancat si el");
    }
}
