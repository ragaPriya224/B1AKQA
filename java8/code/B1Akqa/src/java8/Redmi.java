package java8;

public class Redmi implements MobileInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Redmi obj = new Redmi();
		obj.checkBattery();
		
		
	}

	@Override
	public void printName() {
	 System.out.println("hello");
	}
	
	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkBattery() {
		System.out.println("battery drained ");
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
	}

}
