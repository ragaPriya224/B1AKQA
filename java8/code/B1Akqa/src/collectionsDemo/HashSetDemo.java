package collectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet foodSet = new HashSet();
		foodSet.add("pasta");
		foodSet.add("pizza");
		foodSet.add("burger");
		foodSet.add("pasta");
		foodSet.add(123);
		foodSet.add(null);
		foodSet.add(false);
		System.out.println(foodSet);
		
	}

}
