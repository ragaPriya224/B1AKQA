package java8.day3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectOptionsDemo {

	public static void main(String[] args) {
		
		Stream<Integer> streamCollect = Stream.of(1,2,3,4,5);
		List<Integer> intList = streamCollect.collect(Collectors.toList());
		Set<Integer> intSet = streamCollect.collect(Collectors.toSet());
		Long count = streamCollect.collect(Collectors.counting());
		System.out.println(count);

	}

}
