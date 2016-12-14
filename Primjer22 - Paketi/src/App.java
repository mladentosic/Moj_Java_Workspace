import roles.Admin;
import roles.User;

public class App {
	
	public static void main(String[] args) {
		User korisnik1 = new User();
		korisnik1.setId(1);
		korisnik1.setName("Milan");
		korisnik1.setUsername("milan");
		korisnik1.setPassword("pass123");
		
		
		Admin admin1 = new Admin();
		admin1.setId(2);
		admin1.setName("Goran");
		admin1.setUsername("goran");
		admin1.setPassword("pass123!");
		
		korisnik1.login();
		admin1.login();
		
		korisnik1.logout();
		admin1.logout();
	}

}
