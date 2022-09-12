package interfaceDemo;

public class InterfaceExample implements MyInterface{
	
	public void display() {
		System.out.println("This is the implementation of the display method");
	}
	public void show() {
		System.out.println("This is the implementation of the show method");
	}
	public static void main(String args[]) {
		MyInterface obj = new InterfaceExample();
		obj.display();
		obj.show();
	}
}

//In the main method we are assigning the object of the class to
//	the reference variable of the interface and trying to invoke both the method.

//But, using this you can access the methods of the interface only, 
//	if you try to access the methods of the class a compile time error is generated.


//Therefore, you need to cast an object reference to an interface reference. 
//    Whenever you need to call the methods of the interface only.
