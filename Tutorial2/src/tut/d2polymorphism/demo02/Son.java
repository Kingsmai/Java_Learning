package tut.d2polymorphism.demo02;

public class Son extends Father {

	int num = 20;
	
	int age = 19;
	
	@Override
	public void showNum() {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
	
	@Override
	public void method() {
		System.out.println("子类方法");
	}
	
	public void methodSon() {
		System.out.println("子类特有方法");
	}
}
