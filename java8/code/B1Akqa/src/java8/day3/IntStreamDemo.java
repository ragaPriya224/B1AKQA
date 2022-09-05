package java8.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

	public static void main(String[] args) throws IOException {
		// to print numbers from 1 to 10 
		//		IntStream
		//		   .range(1, 11)   //10 not included 
		//		       .forEach(x-> System.out.println(x));
		//		
		//		//terminal operation -> sum , adding numbers 1 to 4 
		//		System.out.println(IntStream
		//		   .range(1, 5).sum());

		IntStream.range(1, 10).skip(5).forEach(x-> System.out.println(x)); // till 5, it skipped

		String[] name = {"adithi","sourav","shubham","riya","gourav"};
		//4. stream from array, sort, filter , print the data 
		Arrays.stream(name).filter(s-> s.startsWith("s")).sorted().
		forEach(names->System.out.println(names));

		//5. streams rows from text file , sort
		Stream<String> colour = Files.lines(Paths.get("colour.txt"));
		//Files.lines will give a string of stream
//		colour.filter(x -> x.length()> 5).forEach(x -> System.out.println(x));
//		colour.close();

		//6. streams rows from text file , sort
		Stream<String> ishStream = Files.lines(Paths.get("colour.txt"));
		//Files.lines will give a string of stream
		ishStream.filter(x -> x.contains("ish")).forEach(x -> System.out.println(x));
		ishStream.close();
		
		
		//6. streams rows from text file , sort
				Stream<String> dataStream = Files.lines(Paths.get("colour.txt"));
				//Files.lines will give a string of stream
				List<String> dataList = dataStream.filter(x -> x.contains("bl")).collect(Collectors.toList());
			dataList.forEach(x->System.out.println(x));
				dataStream.close();
		
		
	}

}
