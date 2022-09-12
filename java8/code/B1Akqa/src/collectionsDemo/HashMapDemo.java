package collectionsDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap foodMap = new HashMap();
		foodMap.put("briyani", 200);
		foodMap.put("pizza", 50);
		foodMap.put("pasta", 100);
		System.out.println(foodMap.keySet());
		System.out.println(foodMap.values());
		System.out.println(foodMap.containsKey("brownie"));
		System.out.println(foodMap.containsValue(20));
		System.out.println(foodMap);
		foodMap.put("pizza", 100);
		foodMap.replace("briyani", 50);
		System.out.println(foodMap.entrySet());
		System.out.println(foodMap.get("pizza"));
		foodMap.remove("pizza");
		System.out.println(foodMap);
		System.out.println(foodMap.size());
	}

}
