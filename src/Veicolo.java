import java.util.concurrent.TimeUnit;

public class Veicolo implements Runnable {

    private Targa targa;

    private Ponte ponte;

    public Veicolo(Targa targa, Ponte ponte) {
        this.targa = targa;
        this.ponte = ponte;
    }

    @Override
    public void run() {

        try {
            System.out.println(targa + " sta arrivando al ponte");
            ponte.entra();
            
            TimeUnit.SECONDS.sleep(1);
            ponte.transita();
            System.out.println(targa + " sta passando il ponte");

            TimeUnit.SECONDS.sleep(2);
            ponte.esci();
            System.out.println(targa + " ha attraversato il ponte");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
