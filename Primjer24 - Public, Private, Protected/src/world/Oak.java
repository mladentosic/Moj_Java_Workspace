package world;
 
public class Oak extends Plant {
     
    public Oak() {
                 
        // Ovo ce raditi, posto je Oak podklasa od Plant
        this.size = "large";
         
        // Ovo radi zato sto su Oak i Plant u istom paketu
        this.height = 10;
    }
 
}