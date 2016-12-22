import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		/* 
		 * Kada razmisljamo o tipu liste? 
		 * Samo onda kada je prvi put instanciramo... new [type]List<>();
		 * 
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
		*/
		
		/*
		 * ArrayList upravlja sa nizom interno
		 * [0][1][2][3][4][5]....[n-1][n]
		 * 
		 * 
		 */
		List<Integer> arrayList = new ArrayList<Integer>();
		
		/*
		 * LinkedList se sastoji od elemenata gdje je svaki element povezan sa prethodnim i sljedecim
		 * Dakle, mozemo reci da je LinkedList ustvari dodatno referencirani ArrayList
		 * [0]->[1]->[2]->[3]->....->...[n-1]->[n]
		 *    <-   <-   
		 *    
		 * U slucaju da dodajemo ili oduzimamo element iz sredine liste, sa LinkedList to ce ici mnogo brze
		 */
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList",  linkedList);
		
	}
	
	private static void doTimings(String type, List<Integer> list) {
		
		// 1E5 znaci 100000 , to je 1 na 5-ti eksponent
		for( int i = 0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/* Primjer za dodavanje na kraj liste
		for (int i = 0; i < 2E5; i++) {
			list.add(i);
		}
		*/
		
		/*
		 * Primjer za dodavanje na drugim mjestima liste
		 */
		for(int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		 
		long end = System.currentTimeMillis();
		
		System.out.println("Potroseno vrijeme: " + (end - start) + " ms za tip " + type);
	}

}
