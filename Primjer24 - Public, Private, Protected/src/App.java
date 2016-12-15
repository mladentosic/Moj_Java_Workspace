import world.Plant;
 
/*
 * private --- samo unutar iste klase
 * public --- slobodan pristup
 * protected -- ista klasa, podklasa i paket
 * no modifier -- samo unutar paketa
 */
 
public class App {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        Plant plant = new Plant();
         
        System.out.println(plant.name);
        
        // accesing as a static field
        System.out.println(Plant.ID);
         
        //Nece raditi - private tip
        //System.out.println(plant.type);
         
        // Nece raditi - nije isti paket, a protected je
        // System.out.println(plant.size);
         
        // Nece raditi - App i Plant su u drugim paketima, a height je dostupno na nivou paketa
        //System.out.println(plant.height);
 
    }
 
}