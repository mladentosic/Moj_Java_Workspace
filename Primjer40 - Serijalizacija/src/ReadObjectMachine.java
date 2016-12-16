import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectMachine {
	
	public static void main(String[] args) {
		System.out.println("Ucitavam mašine...");
		
		try(FileInputStream fi = new FileInputStream("prevoz.bin")) {
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Machine masina1 = (Machine) os.readObject();
			Machine masina2 = (Machine) os.readObject();
			Machine masina3 = (Machine) os.readObject();
			Machine masina4 = (Machine) os.readObject();
			
			os.close();
			
			// deserizalizacija zavrsava
			
			System.out.println(masina1);
			System.out.println(masina2);
			System.out.println(masina3);
			System.out.println(masina4);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
