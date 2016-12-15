public class App {
 
    @SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
         
        // Null pointer izuzetak .... 
        String text = null;
         
        System.out.println(text.length());
         
        // Aritmeticki izuzetak (djeljivost sa nula)
        int value = 7/0;
 
        String[] texts = { "jedan", "dva", "tri" };
 
        try {
        	// izuzetak, pristupa se elementu niza koji ne postoji
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}