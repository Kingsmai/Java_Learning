package tut.demo04.d1extends;

public class Father {
	int numFather = 10;
	
	int num = 100;
	
	public Father() {
		System.out.println("父类无参构造");
	}
	
	public Father(int num) {
		System.out.println("父类有参构造");
	}
	
	public void methodFather() {
		System.out.println("父类方法执行");
		// 使用的是本类当中的，不会向下找子类的
		System.out.println(num);
	}
	
	public Object method() {
		System.out.println("父类重名方法执行");
		return null;
	}
}
