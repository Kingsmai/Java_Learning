package basic.demo21polymorphism.demo03;

public class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃SHIT");
	}
	
	public void watchHouse() {
		System.out.println("狗看家");
	}
}
