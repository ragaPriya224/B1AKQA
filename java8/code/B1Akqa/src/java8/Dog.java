package java8;

public class Dog extends Animal{

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		System.out.println(Thread.currentThread().getName());
	}

	@Override
	public void sound() {
		System.out.println("bow bow ");
		
	}
}
