public class Machine implements Info {
     
    private int id = 7;
     
    public void start() {
        System.out.println("Masina pokrenuta.");
    }
 
    public void showInfo() {
        System.out.println("ID masine je: " + id);
    }
}