package java8.day4.MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arrayList = Arrays.asList("Aditi","Gaurav","rohan","mohan");

		//using lambda expressions
//		arrayList.forEach(name->System.out.println(name));

		//using Method References 
		// :: double colon operator 
		arrayList.forEach(System.out::println); //better readability 
	}

}
