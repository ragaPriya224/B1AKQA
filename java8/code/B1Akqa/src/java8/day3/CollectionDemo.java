package java8.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> markList = new ArrayList<>();
		markList.add(3);
		markList.add(5);
		markList.add(6);
		markList.add(7);

		Iterator<Integer> iterator = markList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		Iterator<Integer> iterator2 = markList.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}
	// collections are for storing data . u can iterate multiple times . 
}
