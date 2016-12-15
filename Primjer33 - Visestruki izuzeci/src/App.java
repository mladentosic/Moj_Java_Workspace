import java.io.IOException;
import java.text.ParseException;
 
public class App {
 
    public static void main(String[] args)  {
        Test test = new Test();
        int brojac = 5;
        // visestruki try-catch blok
        try {
            test.run();
        } catch (IOException e) {
            System.out.println("Nije pronadjen fajl");
            System.out.println("Greska se ponovila "+ brojac + " puta");
            System.out.println("Detaljan pregled:");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Nije moguce parsirati fajl.");
            System.out.println("Greska se ponovila "+ brojac + " puta");
            System.out.println("Detaljan pregled:");
            e.printStackTrace();
        }
         
        // Try MULTI CATCH , JAVA 7+ verzije
        try {
            test.run();
        } catch (IOException | ParseException e) {
            System.out.println("Detaljan pregled greske koja se ponovila " + brojac + " puta:");
            e.printStackTrace();
        }
     
    }
 
}