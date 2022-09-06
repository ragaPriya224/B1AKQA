package java8.day4.optionals;

import java.util.Optional;

public class OptionalEmptyDemo {

	public static void main(String[] args) {
		//Optional.empty() returns an empty instance of the optional class 
		Optional<Object> optional = Optional.empty();
		System.out.println(optional);
	}

}
//Optional.empty