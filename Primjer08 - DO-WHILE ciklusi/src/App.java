import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
	        
	        int value = 0;
	        do {
	            System.out.println("Unesite broj: ");
	            value = scanner.nextInt();
	        }
	        while(value != 5);
	        
	        System.out.println("Uneseno je 5!");
	        
	        scanner.close();
		
	}
	
	
	/*
	 * Zadatak:
	 * 
	 * 1 - Napisati program koji trazi da se unese godina rodjenja
	 *   - Godina rodjenja mora biti u intervalu 1900 i 2016
	 *   
	 * 2 - Napisati program koji trazi da se unese godina rodjenja
	 *   - Program se zavrsava tek onda kada unos napravi punoljetan korisnik
	 */

}