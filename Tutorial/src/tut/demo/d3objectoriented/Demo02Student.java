package tut.demo.d3objectoriented;
/*
 * 通常情况下，一个类不能直接使用，需要根据类创建一个对象， 才能使用
 * 
 * 1. 导包：指出需要使用的类，在什么位置
 * import 包名称.类名称
 * import tut.dem0.d3objectoriented.Student;
 * 1.1. 对于当前类属于同一个包的情况，可以省略导包语句不写（比如此文件）
 * 
 * 2. 创建
 * 类名称 对象名 = new 类名称();
 * Student stu = new Student();
 * 
 * 3. 使用，分为两个部分：
 * 3.1. 使用成员变量：对象名.成员变量名;
 * 3.2. 使用成员方法：对象名.成员方法名();
 * （想用谁，就用对象名.谁）
 * 
 * 注意事项：
 * 1. 如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样
 */
public class Demo02Student {
	public static void main(String[] args) {
		// 1. 导包
		// 我需要的Student类和现在的文件在同一个包下，可以省略不写
		
		// 2. 创建
		Student stu = new Student();
		System.out.println(stu); // tut.demo.d3objectoriented.Student@15db9742 地址
		
		// 3. 使用
		System.out.println(stu.name); // null 默认值
		System.out.println(stu.age); // 0 默认值
		System.out.println();
		
		// 改变对象当中的成员变量数值内容：
		stu.name = "欧阳娜娜"; // 将右侧的字符串，赋值给stu对象当中的name成员变量
		stu.age  = 20;
		System.out.println(stu.name); // 欧阳娜娜
		System.out.println(stu.age); // 20
		System.out.println();
		
		// 4. 使用对象的成员方法
		stu.eat();
		stu.sleep();
		stu.study();
	}
}
