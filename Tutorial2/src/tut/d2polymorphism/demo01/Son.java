package tut.d2polymorphism.demo01;

public class Son extends Father {

	@Override
	public void method() {
		System.out.println("子类方法");
	}
	
	public void methodSon() {
		System.out.println("子类特有方法");
	}
}
