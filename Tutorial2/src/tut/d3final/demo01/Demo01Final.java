package tut.d3final.demo01;

/*
 * final 关键字代表最终、不可改变的
 * 
 * 常见四种方法：
 * 1. 可以用来修饰一个类
 * 2. 可以用来修饰一个方法
 * 3. 可以用来修饰一个局部变量
 * 4. 可以用来修饰一个成员变量
 * 
 * 
 * 注意事项：
 * 对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
 */
public class Demo01Final {

	public static void main(String[] args) {
		int num1 = 30;
		System.out.println(num1); // 30
		num1 = 20;
		System.out.println(num1); // 20
		
		// 一旦使用final用来修饰局部变量，那么这个变量就不能进行更改
		final int num2 = 200;
		System.out.println(num2); // 200
//		num2 = 250; // 错误写法，不能改变
//		num2 = 200; // 错误写法
		
		final int num3;
		num3 = 30; // 正确写法，保证有唯一一次赋值即可
		System.out.println("====================");
		
		// 对于基本类型来说，不可变说的是变量当中的数据不可改变
		// 对于引用类型来说，不可变说的是变量当中的地址值
		Student stu1 = new Student("张三");
		System.out.println(stu1);
		System.out.println(stu1.getName()); // 张三
		stu1 = new Student("李四");
		System.out.println(stu1);
		System.out.println(stu1.getName()); // 李四
		System.out.println("====================");
		
		final Student stu2 = new Student("王五");
		System.out.println(stu2);
		System.out.println(stu2.getName());
		// 错误写法，final的引用类型变量，其中的地址不可改变
//		stu2 = new Student("赵六");
		stu2.setName("赵六");
		System.out.println(stu2.getName());
	}
}
