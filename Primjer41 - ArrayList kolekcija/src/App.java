import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/*
		 * ArrayList ne prihvata primitivne tipove, vec samo neprimitivne tipove, tj. Klase
		 * Dakle, ne mozemo proslijediti int, vec moramo proslijediti Integer kao Klasu
		 */
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		// Dodavanje vrijednosti
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Povlacenje vrijednosti
		System.out.println(numbers.get(0));
		
		// Indeksiranje u petlji
		System.out.println("\n Iteracija 01: ");
		for(int i=0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		// Uklanjanje iz ArrayListe - ova akcija ce se izvrsiti BRZO (sa malom potrosnjom procesorske snage)
		numbers.remove(numbers.size() - 1);
		
		// Ako uklanjamo sa pocetka ArrayListe ova operacija ce se izvrsiti JAKO SPORO
		numbers.remove(0);
		
		// Iteracija
		System.out.println("\n Iteracija 02: ");
		for(Integer value : numbers) {
			System.out.println(value);
		}
		
		// Povezivanje sa List interfejsom
		List<String> values = new ArrayList<String>();
		System.out.println("\n" + values);
		
	}
}
