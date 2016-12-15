import world.Plant;
 
 
public class Grass extends Plant {
    public Grass() {
         
        // Iako Grass nasljedjuje Plant, ovo nece raditi posto nisu u istom paketu
        // System.out.println(this.height);
    }
}