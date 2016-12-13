//Klasa Person
class Person {
 
//Ima dva atributa	
    String name;
    int age;

    /*
    * Funkcija speak() ima paeametar void
    *void - ne vraca vrijednost
    */
    void speak() {
        for(int i=0; i<3; i++) {
            System.out.println("Moje ime je: " + name + " i ja imam " + age + " godina. ");
        }
    }
     
    void sayHello() {
        System.out.println("Pozdrav svima!");
    }
}
 
public class App {
 
    public static void main(String[] args) {
 
        Person person1 = new Person();
        person1.name = "Marko Javic";
        person1.age = 37;
        person1.speak();
        person1.sayHello();
 
        Person person2 = new Person();
        person2.name = "Goran Eclipsic";
        person2.age = 20;
        person2.speak();
        person1.sayHello();
 
        System.out.println(person1.name);
 
    }
 
}