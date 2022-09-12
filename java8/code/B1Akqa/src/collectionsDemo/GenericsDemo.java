package collectionsDemo;

import java.util.TreeSet;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mark = new int[5];
		
		mark[1]= 55;
//		mark[2]= "hello";
		
		TreeSet<String> alphaSet = new TreeSet<String>();
		alphaSet.add("a");
		alphaSet.add("z");
		alphaSet.add(22); // :) 
		
		
	}

}
