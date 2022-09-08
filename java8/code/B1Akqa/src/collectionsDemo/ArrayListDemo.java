package collectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList foodList = new ArrayList();
		foodList.add("pasta");
		foodList.add("pizza");
		foodList.add("apple");
		foodList.add("pasta");
		foodList.add("burger");
		foodList.add(325234);
		foodList.add(false);
		foodList.add(null);
		foodList.add("idli");

		System.out.println(foodList);
		System.out.println(foodList.size());
		foodList.remove("pasta");
		System.out.println(foodList);
//		foodList.clear();
		System.out.println(foodList.isEmpty());
		System.out.println(foodList.contains("burger"));
		foodList.add(2, "brownie");
		foodList.remove(4);
		foodList.set(1, "orange");
		foodList.remove(Integer.valueOf(325234));
		System.out.println(foodList.subList(1, 5));
		System.out.println(foodList);
		
		ArrayList snackList = new ArrayList();
		snackList.add("samosa");
		snackList.add("gol gappa");
		snackList.add("tea");
		
		foodList.addAll(2,snackList);
		System.out.println(foodList);
		System.out.println(foodList.get(2));
		System.out.println(foodList.get(4));
	
		

		
	}

}
