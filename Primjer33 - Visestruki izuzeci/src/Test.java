import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
 
/*
 * Pravimo klasu koja ce simulirati Test koji vraca gresku
 */
public class Test {
    public void run() throws IOException, ParseException {
         
         
        //throw new IOException();
         
        throw new ParseException("Greska u izvrsavanju komande.", 2);
         
         
    }
     
    public void input() throws IOException, FileNotFoundException {
         
    }
}