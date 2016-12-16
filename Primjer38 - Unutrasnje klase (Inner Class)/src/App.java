/*
 * Mr. Robot primjer
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot(7);
		robot.start();
		
		/* Robot.Brain se ne moze instancirati posto je private
		 * 
		Robot.Brain brain = robot.new Brain();
		brain.think();
		*/
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();

		Robot.Eye oko1 = new Robot.Eye();
		Robot.Eye oko2= new Robot.Eye();
		oko1.watch("lijevim okom");
		oko2.watch("desnim okom");
	}

}
/*
 * Zadatak
 * Kreirati unutrasnju klasu klase Robot
 * 1. Eye (oko) - klasa ima javnu metod watch() koja ispisuje "Posmatranje..." na konzolu
 * 2. Konstruktor - klase Robot treba inicijalizovati dva oka i pokrenuti metodu 
 * za posmatranje "pogledati"
 */
