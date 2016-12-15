/*
 * Apstraktna klasa se definise kljucnom rijeci abstract i od njih se ne prave objekti
 * Predvidjene su samo da se nasljedjuju.
 * Abstract je u stvari restrikcija
 */
public abstract class Machine {
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	// deklaracija apstraktnih metoda
	public abstract void start();
	public abstract void doStuff();
	public abstract void shutdown();
	
	public void run() {
		start();
		doStuff();
		shutdown();
	}

}
