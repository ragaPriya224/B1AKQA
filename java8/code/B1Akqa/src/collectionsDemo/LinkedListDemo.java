package collectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList foodList = new LinkedList();
		foodList.add("pasta");
		foodList.add("pizza");
		foodList.add("burger");
		foodList.add("pasta");
		foodList.add("icecream");
		System.out.println(foodList);
		System.out.println(foodList.getFirst());
		System.out.println(foodList.getLast());
		foodList.addFirst("juice");
		foodList.addLast("channa");
		System.out.println(foodList);
		foodList.removeFirst();
		System.out.println(foodList);
		foodList.removeLast();
		System.out.println(foodList);
		

		
	}

}
