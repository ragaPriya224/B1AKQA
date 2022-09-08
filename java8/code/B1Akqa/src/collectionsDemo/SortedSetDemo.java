package collectionsDemo;

import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {

		TreeSet markSet = new TreeSet();
		markSet.add(100);
		markSet.add(101);
		markSet.add(103);
		markSet.add(104);
		markSet.add(107);
		markSet.add(110);
		markSet.add(115);
		System.out.println(markSet); //[100, 101, 103, 104, 107, 110, 115]

		System.out.println(markSet.first()); //100
		System.out.println(markSet.last()); //115
		System.out.println(markSet.headSet(104));//less than, //100,101,103
		System.out.println(markSet.tailSet(104)); //grt , equal //104, 107, 110, 115]
		System.out.println(markSet.subSet(103, 110));//[103, 104, 107]
	}

}
