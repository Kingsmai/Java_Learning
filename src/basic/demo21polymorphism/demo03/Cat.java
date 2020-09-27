package basic.demo21polymorphism.demo03;

public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}
	
	// 子类特有方法
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}
