import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * Primjer Queue kolekcije
 * Dakle, queue izgleda ovako [pocetak]-[element]-[element]-[element]-[kraj]
 * Queue je FIFO struktura - First In First Out
 */
public class App {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(70);
		q1.add(20);
		q1.add(50);
		
		/*
		 * Simuliramo gresku gdje pokusavamo dodati element u Queue koji je vec pun
		 */
		try {
			q1.add(30);
		} catch (IllegalStateException e) {
			// TODO: handle exception
			System.out.println("GRESKA: Pokusaj dodavanja objekta nakon sto je Queue kapacitet popunjen.");
		}
		
		for(Integer value : q1) {
			System.out.println("Queue vrijednost: " + value);
		}
		
		System.out.println("Uklonjeno iz Queue kolekcije: " + q1.remove());	
		System.out.println("Uklonjeno iz Queue kolekcije: " + q1.remove());		
		System.out.println("Uklonjeno iz Queue kolekcije: " + q1.remove());	
		
		/*
		 * Simuliramo gresku gdje pokusavamo povuci objekt iz Queue koji je vec prazan
		 */
		try {
			System.out.println("Uklonjeno iz Queue kolekcije: " + q1.remove());
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("GRESKA: Pokusaj povlacenja objekta iz Queue kolekcije koja je prazna.");
		}
		
		
	}
}
