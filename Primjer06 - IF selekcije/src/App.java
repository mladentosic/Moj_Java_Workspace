public class App {
	
	public static void main(String[] args) {
		
			// Poredjenje jednakosti sa ==
	        System.out.println(5 == 7);
	        
	        // Poredjenje nejednakosti sa !=
	        System.out.println(10 != 11);
	        
	        // Poredjenje "je manji" sa <
	        System.out.println(3 < 6);
	        
	        // Poredjenje "je veci" sa >
	        System.out.println(10 > 100);
	        
	        // Upotreba petlji sa provjerim i "break" iskazom: 
	        int loop = 0;
	        
	        while(true) {
	            System.out.println("Trenutni ciklus petlje: " + loop);
	            
	            if(loop == 3) {
	                break;
	            }
	            
	            loop++;
	        
	            System.out.println("Izvrsava se");
	        }
	        
	        
	        /*
	         * Pitanja za diskusiju:
	         * 1 - Sta se dogadja u slucaju kada break zamjenimo sa continue
	         * 2 - Sta se dogadja kada izbacimo loop++ , da li petlja staje?
	         * 3 - Kako da napravimo da petlja preskoci iteraciju 19 a da stane na iteraciji 100 
	         */
	    }
	
}