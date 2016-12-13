// Naziv klase - najbolje je posmatrati kao templejt ili sablon
class Person {
     
    // Atributi klase
    String name;
    int age;
     
    /* Klase mogu sadrzavati
     * - atribute
     * - metode
     */
}

class Student {
    
    String ime;
    String prezime;
    String brojIndeksa;
    int godinaStudija;
    boolean aktivan;
    boolean redovan;
    int age;
}

 
// Glavna public klasa se mora zvati kao fajl
public class App {
 
    public static void main(String[] args) {
         
         
        // Kreiramo objekat person1 tipa klase Person - popunjavanje objekta na osnovu klase(formulara)
        Person person1 = new Person();  
        person1.name = "Marko Javic";
        person1.age = 37;
         
        // Kreiramo jos jedan objekat tipa klase Person
        Person person2 = new Person();
        person2.name = "Goran Eclipsic";
        person2.age = 20;
         
        System.out.println(person1.name);

        Student student1 = new Student();
        student1.ime = "Marko";
        student1.prezime = "Markovic";
        student1.brojIndeksa = "235/16";
        student1.godinaStudija = 4;
        student1.aktivan = true;
        student1.redovan = true;

        Student student2 = new Student();
        student2.ime = "Janko";
        student2.prezime = "Jankovic";
        student2.brojIndeksa = "198/16";
        student2.godinaStudija = 3;
        student2.aktivan = true;
        student2.redovan = false;

        System.out.println(student1.ime);
        System.out.println(student2.ime);
        
        
        
    }
 
}