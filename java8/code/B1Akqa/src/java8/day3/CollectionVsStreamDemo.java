package java8.day3;

import java.util.stream.Stream;

public class CollectionVsStreamDemo {

	public static void main(String[] args) {
		
		
		Stream<Integer> valueStream = Stream.of(3,4,5,6,7 );
		valueStream.forEach(x-> System.out.println(x));
		valueStream.forEach(x-> System.out.println(x)); //Illegal state exception 
	}

}
// streams are for computations . u cannot iterate multiple times . if so, illegal state exception 