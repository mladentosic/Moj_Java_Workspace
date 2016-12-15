public class Machine implements Info {
 /*
  * Implementiran interfejs info i dodate njegove obje funkcije    
  */
    private int id = 7;
     
    public void start() {
        System.out.println("Masina pokrenuta.");
    }
 
    public void showInfo() {
        System.out.println("ID masine je: " + id);
    }
}