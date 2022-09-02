package java8.day2;

import java.util.List;
import java.util.function.BiConsumer;

import java8.day2.data.Person;
import java8.day2.data.PersonRepository;

public class BiConsumerPersonDemo {

	static List<Person> personList = PersonRepository.getAllPersons();
	static BiConsumer<String, Double> income = (name,salary) ->
	System.out.println("name is: "+name + "   salary is "+ salary);	

	public static void main(String[] args) {
		fetchSalary();
	}
	
	//name and salary 
	private static void fetchSalary() {
		personList.forEach(per->{
			income.accept(per.getName(),per.getSalary());
		});
	}

}