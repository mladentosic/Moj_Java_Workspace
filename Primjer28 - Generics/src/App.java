/*
 * Generici se smatraju naprednom tematikom
 * NIJE OBAVEZNO ZA OVAJ KURS
 *  
 * 
 * Ukratko, generici definisu tip varijable koja se ocekuje u nekoj obradi
 */
import java.util.ArrayList;
import java.util.HashMap;
 
class Animal {
     
}
 
@SuppressWarnings("unchecked")
public class App {
    
    @SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
         
        /*
         *  Prije Java 5 
         */
        ArrayList list = new ArrayList();
         
       
        list.add("jabuka");
        list.add("banana");
        list.add("narandza");
         
        String fruit = (String)list.get(1);
         
        System.out.println(fruit);
         
        /*
         * Moderni nacin pisanja, Java 5+
         * Uglaste zagrade oznacavaju generike.
         */
         
        // Primjetimo <String> koji jasno opisuje tip ArrayList-e
        ArrayList<String> strings = new ArrayList<String>();
         
        strings.add("macka");
        strings.add("pas");
        strings.add("zirafa");
         
        String animal = strings.get(1);
         
        System.out.println(animal);
         
         
        /*
         * Generici mogu imati i vise od jednog atributa, kao u slucaju HashMap-e
         */
         
        HashMap<Integer, String> map = new HashMap<Integer, String>();
         
         
        /*
         *  Java 7 style - drugi dio generika nije potreban <> , automatsko prepoznavanje
         */
         
        ArrayList<Animal> someList = new ArrayList<>();
    }
 
}