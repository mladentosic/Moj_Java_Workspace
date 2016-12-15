package world;
 
public class Field {
    private Plant plant = new Plant();
     
    public Field() {
         
        // size je protected, ovo radi posto su Field i Plant u istom paketu
        System.out.println(plant.size);
    }
}