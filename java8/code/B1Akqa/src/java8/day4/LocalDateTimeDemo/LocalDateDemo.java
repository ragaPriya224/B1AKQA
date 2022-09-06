package java8.day4.LocalDateTimeDemo;

import java.util.HashMap;
import java.util.Map;

public class LocalDateDemo {



	public static void main(String[] args) {
		HashMap foodMap = new HashMap();
		foodMap.put("pizza", 50);
		System.out.println(foodMap);
		foodMap.putIfAbsent("pizza", 100);//java8 
		System.out.println(foodMap);
		//		System.out.println(foodMap.get(3));
		System.out.println(foodMap.getOrDefault(3, "Nah!")); //java8 


		HashMap<String,String> dataMap = new HashMap();
		dataMap.put("C", "c");
		dataMap.put("B", "b");
		dataMap.merge("B", "NEW", (v1,v2) -> v1+v2 ); //java8 
		System.out.println(dataMap);



		Map<String, String> data = new HashMap<>();
		data.put("C", "c");
		data.put("B", "b");
		data.replaceAll((k, v) -> "x"); // values is "x" for all keys.  
		System.out.println(data);
		
//		other enhancements such as forEach, 
//		split iterator,
//		removeIf,
	}
}
