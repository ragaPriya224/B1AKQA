package java8.day4.optionals;

import java.util.Optional;

public class OptionalOf {

	public static void main(String[] args) {
		String[] str = new String[5];
		str[1] = "welcome";
		Optional<String> optional = Optional.of(str[1]);
		System.out.println(optional);
		if(optional.isPresent()) {
			System.out.println("yes present");
		}
	}

}
