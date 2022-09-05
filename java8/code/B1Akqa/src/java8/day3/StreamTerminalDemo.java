package java8.day3;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalDemo {

	public static void main(String[] args) {

		List<String> cityList = Arrays.asList("barcelona","","Gurgaon","bangkok","bangalore", "Noida","NewDelhi" , 
				"Mumbai","tokyo","berlin","barcelona","bombay");
		
		System.out.println("original list" );
		System.out.println(cityList);

		//to get COUNT of cities starting with N
		long outputCount = cityList.stream().filter(name -> name.startsWith("N")).count();
		System.out.println(outputCount);
		
		//to get count of cities that are non empty 
		 long nonEmptyData = cityList.stream().filter(name-> !name.isEmpty()).count();
		 
		 List<Integer> markList = Arrays.asList(4,5,1,2);
		 
		//FOR EACH OPERATION
		  markList.stream().forEach(x-> System.out.println(x));
		
	}

}
