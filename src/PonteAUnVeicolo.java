public class PonteAUnVeicolo {

    public static void main(String[] args) throws Exception {

        final int NUMERO_VEICOLI = 10;
        
        SemaforoMutex semaforoPonte = new SemaforoMutex();

        for (int i = 0; i < NUMERO_VEICOLI; i++)
            new Thread(new Veicolo("veicolo"+i,semaforoPonte)).start();
        
    }
}
