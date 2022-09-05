package java8.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = Arrays.asList("Gurgaon" ,  "NewDelhi" , "Mumbai","tokyo","berlin","barcelona","bombay");
		//1. filter operation 
		List<String> outputList = cityList.stream().filter(name -> name.startsWith("b")).collect(Collectors.toList());
		//source -> cityList
		//stream
		//intermediate operation  -> filter 
		//terminal operation  -> collect
	
		System.out.println(outputList);
		//manipulation -> map (intermediate operation )
		
		//2. filter,map  operation 
		List<String> alteredList = cityList.stream().filter(name -> name.startsWith("b"))
			.map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(alteredList);
		//3. sort  operation 
		List<String> sortedList = cityList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//4.filter,map,sort  operation 
		List<String> resultList = cityList.stream().filter(name -> name.startsWith("b"))
				.map(name -> name.concat("city")).sorted().collect(Collectors.toList());
		System.out.println(resultList);

		
		
		
//		List<Integer> dataList = Arrays.asList(4,5,2,22,1);
//		List<Integer> markList = dataList.stream().sorted().collect(Collectors.toList());
//		System.out.println(markList);
		


	}

}
