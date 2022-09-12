package collectionsDemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet alphaSet = new TreeSet();
		alphaSet.add("a");
		alphaSet.add("z");
//		alphaSet.add(22); no 
//		alphaSet.add(null);
		alphaSet.add("c");
		
		System.out.println(alphaSet);

	}

}
