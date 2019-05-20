package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {
	/*
	 * Maps are data collections that function like lookup tables; basically you can store objects 
	 * via "keys" (names, IDs, or even complex objects) and quickly retrieve them without having to 
	 * look through an entire list. 
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(9, "Nine");
		map.put(10, "Ten");
		//You can not have duplicate keys in map, the later one will override the previous one
		
		String text = map.get(6);
		System.out.println(text);

		// Using Map interface, which has entrySet method.
		// HashMap does not maintain order.
		for (Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
            String value = entry.getValue();           
            System.out.println(key + ": " + value);
		}
	}
}
