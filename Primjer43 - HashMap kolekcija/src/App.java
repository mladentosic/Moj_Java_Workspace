import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Jedan");
		map.put(23, "Dvadeset i tri");
		map.put(5, "Pet");
		map.put(8, "Osam");
		map.put(2, "Dva");
		
		String text = map.get(8);
		System.out.println(text);
		
		/*
		 * Iteracije kroz HashMap-e
		 * HASHMAP ne zadrzava prirodni redosljed !!! 
		 */
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
			
		}
		
	}
}
