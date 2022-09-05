package java8.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = Arrays.asList("Gurgaon" , "NewDelhi" , "Mumbai","tokyo","berlin","bombay");

		//length>5
		List<String> resultList = cityList.stream().filter(name -> name.length()>5).collect(Collectors.toList());
		System.out.println(resultList);

		//length>5
		List<String> sortedList = cityList.stream().filter(name -> name.length()>5).sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//length>5
		List<String> particularCityList = cityList.stream().filter(name -> name.startsWith("b")).collect(Collectors.toList());
		System.out.println(particularCityList);
		
		

	}

}
