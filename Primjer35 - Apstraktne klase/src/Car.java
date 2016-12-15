/*
 * Klasa Car nasljedjuje apstraktnu klasu Machine
 */
public class Car extends Machine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Auto se pokrece.");
		
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("Auto radi.");
		
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Auto se gasi.");
		
	}

}
