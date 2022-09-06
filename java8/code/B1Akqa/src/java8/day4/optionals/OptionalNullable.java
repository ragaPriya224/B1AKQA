package java8.day4.optionals;

import java.util.Optional;

public class OptionalNullable {

	public static void main(String[] args) {
		String[] str = new String[5];
		str[1] = "welcome";
		str[2] = "hello";
		//value is available, so returns value 
		Optional<String> value = Optional.of(str[1]);
		System.out.println(value);

		// no value is available, so returns empty optional 
		Optional<String> value1 = Optional.ofNullable(str[2]);
		System.out.println(value1);

	}

}
