package basic.demo21polymorphism.demo02;

/*
 * 访问成员变量的两种方式：
 * 
 * 1. 直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
 * 2. 简介通过成员方法访问成员变量：看该方法属于谁则优先用谁，没有则向上找
 */
public class Demo01MultiField {

	public static void main(String[] args) {
		// 使用多态的写法，父类引用指向子类对象
		Father obj = new Son();
		System.out.println(obj.num); // 10，父类的值
//		System.out.println(obj.age); // 报错，Father里没有这个成员变量
		System.out.println("==========");
		
		// 子类没有覆盖重写，就是父：10
		// 子类如果覆盖重写，就是子：20
		obj.showNum();
	}
}
