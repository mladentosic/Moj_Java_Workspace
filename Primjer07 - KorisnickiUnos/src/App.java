import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// Kreiranje skener objekta
		Scanner input = new Scanner(System.in);
		
		// Output prompt
		System.out.println("Unesite ime i prezime: ");
		// System.out.println("Unesite integer: ");
		
		// Izvrsavanje skenera i arhiviranje rezultata
		String imePrezime = input.nextLine();
		// int value = input.nextInt();
		// int value = input.nextDouble();
		System.out.println("Unesite datum rodjenja: ");
		String datumRodjenja = input.nextLine();
		System.out.println("Unesite pol: ");
		String pol = input.nextLine();
		
		// Ispis arhiviranog rezultata
		System.out.println("Vase ime i prezime je: " + imePrezime);
		System.out.println("Rodjeni ste: " + datumRodjenja);
		System.out.println("Vas pol: " + pol);
		
		// Svaki skener i citac treba zatvoriti nakon upotrebe (dobra praksa)
		input.close();
			
		/*
		 * Zadatak:
		 * 1 - Napisati program koji omogucava korisniku da unese svoje Ime, Prezime, Godinu rodjenja i pol.
		 *   - Nakon sto korisnik unese trazene podatke ispisati jednu recenicu kojom se ponavlja korisnicki unos.
		 */
	}

}