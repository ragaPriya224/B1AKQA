package java8.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = Arrays.asList("barcelona","Gurgaon","bangkok","bangalore", "NewDelhi" , 
				"Mumbai","tokyo","berlin","barcelona","bombay");
		System.out.println("original list" );
		System.out.println(cityList);
		
		//to get distinct list 
		List<String> outputList = cityList.stream().filter(name -> name.startsWith("b")).distinct().collect(Collectors.toList());
		System.out.println(outputList);

		//to get limited  list 
		List<String> limitedList = cityList.stream().filter(name -> name.startsWith("b")).limit(3).collect(Collectors.toList());
		System.out.println(limitedList);

		//to skip  list 
		List<String> skippedList = cityList.stream().filter(name -> name.startsWith("b")).skip(4).collect(Collectors.toList());
		System.out.println(skippedList);


	}

}
