public class Ponte {

    private int maxVeicoliSulPonte = 1;

    public Ponte(int maxVeicoliSulPonte) {
        this.maxVeicoliSulPonte = maxVeicoliSulPonte;
    }

    private Semaforo semaforo = new Semaforo(maxVeicoliSulPonte);

    public void entra() throws InterruptedException{
        semaforo.attendi();   
    }

    public void transita(){
    }

    public void esci(){
        semaforo.segnala();   
    }
 
}
