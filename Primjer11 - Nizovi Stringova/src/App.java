public class App {
 
    public static void main(String[] args) {
         
        String[] words = new String[3];
         
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";
         
        System.out.println(words[2]);
         
        // Istovremeno deklarisemo i inicijalizujemo niz
        String[] fruits = {"apple", "banana", "pear", "kiwi"};
         
        // Iteracija kroz niz
        for(String fruit: fruits) {
            System.out.println(fruit);
        }
         
        // Standardna vrijednost za String je "null"
        String text = null;
         
        System.out.println(text);
         
        // Deklarisemo niz stringova
        String[] texts = new String[2];
         
        // Ispisacemo vrijednosti
        System.out.println(texts[0]);
         
    }
 
}