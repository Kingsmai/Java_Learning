package tut.demo04.d2abstract;

/*
 * 抽象注意事项：
 * 1. 抽象类不能创建对象，只能创建其子类对象
 * 2. 抽象类中可以构造方法，提供子类创建对象时，初始化父类成员使用的
 * 3. 一个抽象类不一定含有抽象方法，但是抽象方法一定在抽象类里
 * 没有抽象方法的抽象类，也不能直接创建对象，在一些特殊场景下有用途
 * 4. 抽象类的子类，必须重写抽象父类中所有的抽象方法，除非子类也是抽象类
 */
public class DemoMain {

	public static void main(String[] args) {
//		Animal animal = new Animal(); // 错误写法，不能直接创建抽象类对象
		Cat cat = new Cat();
		cat.eat(); // 猫吃鱼
		
		Son son = new Son(); // 先执行父类抽象构造方法，然后执行子类构造方法
		son.eat(); // 吃饭饭
	}
}
