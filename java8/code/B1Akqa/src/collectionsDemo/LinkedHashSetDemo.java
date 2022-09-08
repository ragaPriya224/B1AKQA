package collectionsDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet foodSet = new LinkedHashSet();
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
