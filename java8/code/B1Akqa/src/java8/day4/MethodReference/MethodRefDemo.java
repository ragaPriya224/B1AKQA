package java8.day4.MethodReference;

import java.util.function.Function;

public class MethodRefDemo {
	public void display(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {

		MethodRefDemo demo = new MethodRefDemo();
		// method ref to an instance method 
		// lambda expression 
		Printable printableLambda = (msg) -> demo.display(msg);
		printableLambda.print("hello");
		
		Printable printable =  demo::display;
		printable.print("hello");
		
		// function example 
		//USING LAMBDA EXPRESSION 
		Function<String , String> lowerCaseFunction  = (input )-> input.toLowerCase();
		System.out.println(lowerCaseFunction.apply("TEAM"));
		
		//USING METHOD REFERENCES 
		Function<String , String> lowerCaseRef = String::toLowerCase;
		System.out.println(lowerCaseRef.apply("CODING"));
		
		
		
	}

}
