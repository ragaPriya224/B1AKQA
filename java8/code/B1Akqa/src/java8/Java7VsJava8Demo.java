package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java7VsJava8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		java7 
		int total = 0;
		for(int index = 0; index<=50;index++) {
			total +=index;
		}
		System.out.println(total);

		//java8 
		int output = IntStream.rangeClosed(0, 50).sum();
		System.out.println(output);

		//java7 
		//java8 
		List<String> nameList=Arrays.asList("shubham","ab","sourav","ab");
		List<String> uniqueList = nameList.stream().distinct().collect(Collectors.toList());	
		System.out.println(uniqueList);


	}

}