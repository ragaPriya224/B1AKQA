package java8;

public class Duck extends Animal{

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sound();
	}

	@Override
	public void sound() {
		System.out.println("quack quack");
	}
}
