import java.util.Iterator;
import java.util.LinkedList;

public class App {
	
	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("macka");
		animals.add("pas");
		animals.add("patka");
		animals.add("mis");
		
		Iterator<String> it = animals.iterator();
		
		/*
		 * Upotreba iteratora na starijim verzijama jave, pomocu hasNext() metode
		 */
		while(it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}
		
		System.out.println("------------------------");
		
		/*
		 * Upotreba Iteratora na novijim verzijama Jave, Java 5+
		 */
		for(String animal : animals) {
			System.out.println(animal);
		}
	}

}
