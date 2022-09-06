package java8.day4.optionals;

import java.util.Optional;

public class OptionalsDemo {

	public static void main(String[] args) {
		//initializing an array of size 10 
		String[] words = new String[10];
		
		Optional<String> checkNull = Optional.ofNullable(words[2]);
		
		//if a value is present or not 
		if(checkNull.isPresent()) {
			System.out.println(words[2].toLowerCase());
		}else {
			System.out.println(" word is null ");
		}

	}

}




