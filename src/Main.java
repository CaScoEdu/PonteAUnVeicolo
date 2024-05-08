public class Main {
     
    public static void main(String[] args) throws Exception {

        final int MAX_VEICOLI_SUL_PONTE =1;

        Ponte ponte = new Ponte(MAX_VEICOLI_SUL_PONTE);
        
        for (Targa targa : Targa.values())
            new Thread(new Veicolo(targa, ponte)).start();
        
    }
}
