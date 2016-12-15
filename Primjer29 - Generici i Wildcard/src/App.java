/*
 * Dodatni materijal
 */

import java.util.ArrayList;
 
class Machine {
 
    @Override
    public String toString() {
        return "Ovo je masina.";
    }
     
    public void start() {
        System.out.println("Masina je pokrenuta.");
    }
 
}
 
class Camera extends Machine {
    @Override
    public String toString() {
        return "Ovo je kamera.";
    }
     
    public void snap() {
        System.out.println("Slikanje kamerom.");
    }
}
 
public class App {
 
    public static void main(String[] args) {
 
        ArrayList<Machine> list1 = new ArrayList<Machine>();
 
        list1.add(new Machine());
        list1.add(new Machine());
 
        ArrayList<Camera> list2 = new ArrayList<Camera>();
 
        list2.add(new Camera());
        list2.add(new Camera());
 
        showList(list2);
        showList2(list1);
        showList3(list1);
    }
 
    /* 
     * generik ? extends Machine, govori da svaka klasa koja nasledjuje Machine moze da bude parametar
     */
    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine value : list) {
            System.out.println(value);
            value.start();
        }
 
    }
    
    /*
     * Generik ? super Camera govori da roditeljska klasa klase Camera takodje moze da bude argument
     */
    public static void showList2(ArrayList<? super Camera> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
    
    public static void showList3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
 
 
}