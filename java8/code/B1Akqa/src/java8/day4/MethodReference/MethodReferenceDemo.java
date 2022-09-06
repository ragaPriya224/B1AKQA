package java8.day4;

import java.util.function.Function;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		// method reference to a static method of a class 
		Function<Integer, Double> sqrt = (input )-> Math.sqrt(input);
		System.out.println(sqrt.apply(4));
		
		Function<Integer, Double> sqrtRef =  Math::sqrt;
		System.out.println(sqrtRef.apply(4));
	}



}
