public class Semaforo {

    private int risorseDisponibili;

    public Semaforo(int risorseLibere){
        this.risorseDisponibili = risorseLibere;
    }

    // chiamiamo la Wait() del semaforo "attendi()"" perchè wait è una parola chiave Java
    public synchronized void attendi() throws InterruptedException{

        while (risorseDisponibili == 0)
            wait();
        risorseDisponibili--;
    
    }

    public synchronized void segnala(){

        notify();
        risorseDisponibili++;
    }
}
