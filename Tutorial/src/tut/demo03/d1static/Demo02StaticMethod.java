package tut.demo03.d1static;

/*
 * 一旦使用static修饰成员方法，那么这就成为了静态方法
 * 静态方法不属于对象，而是属于类
 * 
 * 如果没有static关键字，那么必须首先创建对象，然后才能通过对象使用它
 * 如果有static关键字，那么不需要创建对象，直接通过类名称来使用它
 * 
 * 无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法()
 * 
 * 注意事项：
 * 1. 静态不能直接访问非静态
 * 1.1. 因为在内存当中，是【先】有静态内容，【后】有非静态内容
 * 1.2. "先人不知道后人，但是后人知道先人"
 * 2. 静态方法当中，不能使用this
 * 2.1. this代表当前对象，通过谁调用方法，谁就是当前对象
 */
public class Demo02StaticMethod {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MyClass obj = new MyClass(); // 首先创建对象
		// 然后才能使用没有static关键字的内容
		obj.method();
//		MyClass.method(); // 错误写法
		
		// 对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
		obj.methodStatic(); // 正确，不推荐，这种写法在编译之后也会通过javac翻译成为 类名称.静态方法名
		MyClass.methodStatic(); // 正确，推荐
		
		// 对于本类当中的静态方法，可以省略类名称
		myMethod();
		Demo02StaticMethod.myMethod(); // 和上一句完全等效
	}
	
	public static void myMethod() {
		System.out.println("自己的方法");
	}
}
