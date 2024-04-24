public class SemaforoMutex {

    private final int SEMAFORO_VERDE = 1;
    private final int SEMAFORO_ROSSO = 0;
    private int valore = SEMAFORO_VERDE;

    public synchronized void attendi() throws InterruptedException{
        while (valore == SEMAFORO_ROSSO)
            wait();
        valore = SEMAFORO_ROSSO;
    }

    public synchronized void segnala(){
        valore = SEMAFORO_VERDE;
        notify();
    }

}
