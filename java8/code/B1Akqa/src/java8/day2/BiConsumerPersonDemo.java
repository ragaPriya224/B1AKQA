package java8.day2;

import java.util.List;
import java.util.function.BiConsumer;

import java8.day2.data.Person;
import java8.day2.data.PersonRepository;

public class BiConsumerPersonDemo {

	static List<Person> personList = PersonRepository.getAllPersons();
	static BiConsumer<String, Double> income = (name,salary) ->
	System.out.println("name is: "+name + "   salary is "+ salary);
	
	static BiConsumer<String,List<String>> hobbyConsumer = (name,hobbies) ->
	 				System.out.println("name is:  "+name +"    hobbies are  " +hobbies);

	
	public static void main(String[] args) {
//		fetchSalary();
		fetchHobbies();
	}
	
	private static void fetchHobbies() {
		
		personList.forEach(per->{
			hobbyConsumer.accept(per.getName(),per.getHobbies());
		});
	}

	//name and salary 
	private static void fetchSalary() {
		personList.forEach(per->{
			income.accept(per.getName(),per.getSalary());
		});
	}

}