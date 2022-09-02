package java8.day2;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		//		 type of the first argument to the operation,
		//		type of the second argument to the operation
		
		BiConsumer<Integer, Integer> biConsumer = (x,y) -> System.out.println(x+y);	
		//		biConsumer.accept(10, 20);

		BiConsumer<Integer, Integer> biConsumerDemo = (x,y) -> System.out.println(x-y);
		//		biConsumerDemo.accept(20, 10);

		biConsumer.andThen(biConsumerDemo).accept(20, 20);

	}

}
