package java8.day2;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> greaterThanPredicate = (mark1,mark2)-> mark2>mark1;
		System.out.println(greaterThanPredicate.test(30,40));
		
		
		
		

	}

}
