package day4;

import java.util.HashMap;
import java.util.Map;

public class Collections_HashMap {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		//Adding key-value pairs
		
		map.put("Apple", 1);
		map.put("Grapes", 2);
		map.put("Cherry", 3);
		System.out.println("HashMap:" +map);
		System.out.println();
		
		System.out.println("Apple count:"+ map.get("Apple")); // counts the no.of element in the map
		System.out.println();
		
		map.remove("Apple");
		System.out.println("After removing Apple:"+map);
		System.out.println();
		
		System.out.println("Interating using entrySet:");
		for (Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
		System.out.println();
	
		for (String key: map.keySet()) {
			System.out.println(key+ ":" + map.get(key));
		}
		}
	}



