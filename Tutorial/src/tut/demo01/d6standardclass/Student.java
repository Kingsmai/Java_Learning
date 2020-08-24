package tut.demo01.d6standardclass;
/*
 * 一个标准的类通常要拥有四个组成部分：
 * 1. 所有成员变量都要使用private关键字修饰
 * 2. 为每一个成员变量编写一对Getter/Setter方法
 * 3. 编写一个无参数方法
 * 4. 编写一个全参数方法
 * 
 * 这样标准的类也叫做 Java Bean
 * 
 * eclipse快速创建方法：
 * 1. 创建Getter / Setter
 * 1.1. 上方Source菜单，找到Generate Getter / Setter
 * 1.2. 选择所有成员变量，然后OK
 * 2. 创建无参构造方法
 * 2.1. 上方Source菜单，找到Generate Constructor Using Field
 * 2.2 取消勾选所有的成员变量，然后OK
 * 3. 创建有参构造方法
 * 3.1. 上方Source菜单，找到Generate Constructor Using Field
 * 2.2 选择所有成员变量，然后OK
 * 
 * 方法顺序无所谓
 * 
 */
public class Student {
	private String name; // 姓名
	private int age; // 年龄
	
	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
