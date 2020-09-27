package basic.demo21polymorphism.demo02;

public class Father /*extends Object*/ {

	int num = 10;
	
	public void showNum() {
		System.out.println(num);
	}
	
	public void method() {
		System.out.println("父类方法");
	}
	
	public void methodFather() {
		System.out.println("父类特有方法");
	}
}
