package tut.demo.d5classes;
/*
 * 当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量
 * 如果需要访问本类当中的成员变量，需要使用格式：
 * this.成员变量名
 * 
 * 通过谁调用的方法，谁就是this
 * this一定要写在方法里面
 */
public class Person {
	String name; // 我自己的名字
	
	/**
	 * 打招呼
	 * @param who 对方的名字
	 */
	public void sayHello(String who) {
		System.out.println(who + "，你好。我是" + name);
	}
	
	/*
	 * 和成员变量同样名字的参数
	 */
	public void sayHi(String name) {
//		System.out.println(name + "，你好。我是" + name); // 这两个name用的都是参数
		System.out.println(name + "，你好。我是" + this.name); // 这两个name用的都是参数
	}
	
	public void printThis() {
		System.out.println(this);
	}
}
