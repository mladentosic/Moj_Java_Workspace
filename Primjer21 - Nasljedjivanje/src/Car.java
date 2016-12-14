public class Car extends Machine {
     
     
    @Override
/*
    * Prethodno yna;i da je preslikano od nekud drugo
*/
    public void start() {
        System.out.println("Auto ukljuceno.");
    }
 /*
  * Ako iskomentarisemo prethodnu funkciju, uzece start iz masina jer je car prosirenje masina a tamo ima start
  */
    public void wipeWindShield() {
        System.out.println("Brisaci ukljuceni.");
    }
     
    public void showInfo() {
        System.out.println("Naziv auta: " + name);
    }
}