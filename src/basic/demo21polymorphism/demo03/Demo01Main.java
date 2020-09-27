package basic.demo21polymorphism.demo03;

/*
 * 向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端：
 * 对象一旦向上转型为父类，那么就无法调用子类原本特有的内容
 * 
 * 解决方法：用对象的向下转型【还原】
 */
public class Demo01Main {

	// 对象的向上转型就是：父类引用指向子类对象
	public static void main(String[] args) {
		Animal animal = new Cat(); // 向上转型为Animal，本来创建的时候是一只猫
		animal.eat(); // 猫吃鱼
		
//		animal.catchMouse(); // 错误写法！
		
		// 向下转型，进行“还原”动作
		Cat cat = (Cat) animal;
		cat.catchMouse(); // 猫抓老鼠
		
		// 下面是错误的向下转型
		// 本来创建的时候是一只猫，现在非要当作狗
		// 错误，但是编译器不会报错，但是运行会出现异常
		// 报错：java.lang.ClassCastException，类转换异常
//		Dog dog = (Dog) animal;
	}
}
