import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
/*
 * Primjer je poprilicno jednostavan
 * 1 - Kreiramo promjenjivu u koju smjestimu putanju do fajla
 * 2 - Koristimo Scanner klasu za citanje fajla (referencu prema fajlu)
 * 3 - pomocu nextLine() citamo liniju po liniju, a pomocu hasNextLine() provjeravamo ima li jos linija
 */
public class App {
 
    public static void main(String[] args) throws FileNotFoundException {
        //String fileName = "D:\Obuka OO_Programiranje_java";
        String fileName =  "D:/Obuka OO_Programiranje_java/example.txt";
        File textFile = new File(fileName); // fileNane je u ovakvom slucaju citava putanja
         
        Scanner in = new Scanner(textFile);
/*         
        int value = in.nextInt();
        System.out.println("Read value: " + value);
         
        in.nextLine();
*/         
        int count = 1;
        while(in.hasNextLine()) {
            String line = in.nextLine();
             
            System.out.println(count + ": " + line);
            count++;
        }
         
        in.close();
    }
 
}