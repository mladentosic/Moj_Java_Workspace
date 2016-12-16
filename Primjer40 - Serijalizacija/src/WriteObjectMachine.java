import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectMachine {
	
		public static void main(String[] args) {
			System.out.println("Upisujem mašine...");
			
			Machine masina1 = new Machine(111, "Automobil", 1, true);
			Machine masina2 = new Machine(111, "Kamion", 5, true);
			Machine masina3 = new Machine(111, "Motor", 1, false);
			Machine masina4 = new Machine(111, "Helikopter", 0, true);
			
			System.out.println(masina1);
			System.out.println(masina2);
			System.out.println(masina3);
			System.out.println(masina4);

			// Sve do ovog momenta nije se dogodila serilizacija
			
			try(FileOutputStream fs = new FileOutputStream("prevoz.bin")) {
			
				ObjectOutputStream os = new ObjectOutputStream(fs);
				
				os.writeObject(masina1);
				os.writeObject(masina2);
				os.writeObject(masina3);
				os.writeObject(masina4);
				
				os.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

}
