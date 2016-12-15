class Machine {
    public void start() {
        System.out.println("Masina se pokrece ...");
    }
}
 
interface Plant {
    public void grow();
}
 
public class App {
 
    public static void main(String[] args) {
         
    	/*
    	 * Kreiramo anonimnu klasu i mjenjamo funkcionalnost start metode
    	 * Anonimna klasa je "naslonjena" na promjenjivu machine1
    	 */
        Machine machine1 = new Machine() {
            @Override public void start() {
                System.out.println("Kamera slika ....");
            }
        };
         
        machine1.start();
        
        /*
         * Kreiramo anonimnu klasu...
         * Ovo je ekvivalentno situaciji kada implementiramo Plant interfejs
         */
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Biljka raste...");
                 
            }
        };
         
        plant1.grow();
    }
}