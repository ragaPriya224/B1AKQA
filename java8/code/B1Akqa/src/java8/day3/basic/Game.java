package java8.day3.basic;

public class Game implements InterfaceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Game game = new Game();
//		game.test();
		
//		InterfaceDemo demo = new Game();
//		demo.test(); //dynamic binding 
		
		
		InterfaceDemo demo =  ()-> {System.out.println("game test called ");};
		demo.test(); //dynamic binding 
	}

	@Override
	public void test() {
		
		System.out.println("game method called ");
	}

}
