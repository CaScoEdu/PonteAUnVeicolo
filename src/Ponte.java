public class Ponte {

    private int maxVeicoliSulPonte = 1;

    private int veicoliSulPonte = 0;

    public Ponte(int maxVeicoliSulPonte) {
        this.maxVeicoliSulPonte = maxVeicoliSulPonte;
    }


    public synchronized void entra(Targa targa) throws InterruptedException {

        while (veicoliSulPonte >= maxVeicoliSulPonte) {
            System.out.println(targa + " deve attendere");
            System.out.println(toString());
            wait();
        }
        veicoliSulPonte++;
        System.out.println(targa + " è entrato sul ponte");
        System.out.println(toString());
    }

    public void transita() {
    }

    public synchronized void esci(Targa targa) {
        veicoliSulPonte--;
        System.out.println(targa + " è uscito dal ponte");
        System.out.println(toString());
        notifyAll();
    }

    @Override
    public String toString() {
        return "Ponte [veicoliSulPonte=" + veicoliSulPonte + "]";
    }

}
