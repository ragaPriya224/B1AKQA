package java8.day4.optionals;

public class NullExceptionDemo {

	public static void main(String[] args) {
		String[] words = new String[10];
		//try to access index, of this empty string 
		System.out.println(words[2].toLowerCase());
	}

}
//output:
//	java.lang.NullPointerException: