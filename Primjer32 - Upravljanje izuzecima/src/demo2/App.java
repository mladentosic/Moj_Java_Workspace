package demo2;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
 
public class App {
 
    @SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
        File file = new File("test.txt");
 
        try {
            FileReader fr = new FileReader(file);
             
            // Ova linija nece biti izvrsena ako se dogodi izuzetak
            System.out.println("Izvrsavanje ....");
        } catch (FileNotFoundException e) {
            System.out.println("Fajl nije pronadjen: " + file.toString());
        }
 
        System.out.println("Kraj programa.");
    }
 
}