package java8.day3.basic;

public class DynamicBindingExample  implements CarInterface{

	public static void main(String[] args) {
		
		CarInterface obj = new DynamicBindingExample();
		obj.display();
//		obj.show();
	}

	@Override
	public void display() {
		System.out.println("display method is called ");

	}
	
	public void show() {
		System.out.println("show ");
	}

}