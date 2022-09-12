package java8.myPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java8.day2.data.Person;
import java8.day2.data.PersonRepository;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = Arrays.asList("Gurgaon" ,  "NewDelhi" , "Mumbai","tokyo","berlin","barcelona","bombay");
		
//		cityList.stream().filter(x-> x.startsWith("b")).findFirst()
		 List<Person> personList = PersonRepository.getAllPersons();
		
		personList.stream().anyMatch(x->x.getName().startsWith("a")).
	}

}
