package tut.demo04.d2abstract2;

// 子类也是一个抽象类
public abstract class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃骨头");
	}
	
	// public abstract void sleep();
}
