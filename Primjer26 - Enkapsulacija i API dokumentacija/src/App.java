class Plant {
     
    // Obicno samo static final promjenjive stavljamo kao public
    public static final int ID = 7;
     
    // Sve druge varijable idu na private
    private String name;
     
    // Metode su public ako se koriste eksterno
    public String getData() {
        String data = "some stuff" + calculateGrowthForecast();
         
        return data;
    }
     
    // Metode za interne proracune su private
    private int calculateGrowthForecast() {
        return 9;
    }
     
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
     
     
}
 
 
public class App {
 
    public static void main(String[] args) {
         
    }
 
}