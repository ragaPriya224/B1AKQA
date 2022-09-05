package java8.day3;

import java.util.stream.IntStream;

public class IntStreamDemo {

	public static void main(String[] args) {
		// to print numbers from 1 to 10 
//		IntStream
//		   .range(1, 11)   //10 not included 
//		       .forEach(x-> System.out.println(x));
//		
//		//terminal operation -> sum , adding numbers 1 to 4 
//		System.out.println(IntStream
//		   .range(1, 5).sum());
		
		IntStream.range(1, 10).skip(5).forEach(x-> System.out.println(x)); // till 5, it skipped
	}

}
