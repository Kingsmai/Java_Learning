package tut.d1object.object;

import java.util.ArrayList;

import tut.d2api.frequent.Person;

/*
 * java.lang.Object类
 * Object 是类层次结构的根类（最顶层）。每个类都使用Object作为超类（父类）。
 * 所有对象（包括数组）都实现这个类的方法
 */
public class Demo02ObjectEquals {

	public static void main(String[] args) {
		/*
		 * Person类默认继承了Object类，所以可以使用Object类中的equals方法
		 * boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”
		 * 
		 * equals方法源码：
		 * public boolean equals(Object obj) {
		 *     return (this == obj);
		 * }
		 * 解释：
		 * Object obj 可以传递任何对象
		 * == 比较运算符，返回的是一个布尔值
		 * 基本数据类型：比较的是值
		 * 引用数据类型：比较的是两个对象的地址值
		 * this：哪个对象调用的方法，方法中的this就是那个对象
		 * person1调用equals方法，this就是person1
		 * obj：传递过来的参数
		 */
		Person person1 = new Person("张三", 18);
		Person person2 = new Person("李四", 19);
		System.out.println("person1: " + Integer.toHexString(person1.hashCode())); // 打印该对象地址值
		System.out.println("person2: " + Integer.toHexString(person2.hashCode())); // 打印该对象地址值
		boolean bool = person1.equals(person2); // equals默认是比较地址值：this == obj
		// 这个相等于：
		boolean boolHash = (Integer.toHexString(person1.hashCode())) == (Integer.toHexString(person1.hashCode()));
		System.out.println("person1.equals(person2): " + bool); // false（地址值不一样）
		System.out.println("地址值比较：" + boolHash);
		System.out.println("=============");
		
		person1 = person2; // 把person2的地址值赋值给person1
		System.out.println("把person2的地址值赋值给person1");
		System.out.println("person1: " + Integer.toHexString(person1.hashCode())); // 打印该对象地址值
		System.out.println("person2: " + Integer.toHexString(person2.hashCode())); // 打印该对象地址值
		bool = person1.equals(person2);
		System.out.println("person1.equals(person2): " + bool); // true
		System.out.println("=============");
		
		// 重写equals方法之后，就不再是比较地址值了
		Person person3 = new Person("王五", 20);
		Person person4 = new Person("赵六", 20);
		person4.setName("王五");
		System.out.println("person3: " + Integer.toHexString(person3.hashCode())); // 打印该对象地址值
		System.out.println("person4: " + Integer.toHexString(person4.hashCode())); // 打印该对象地址值
		bool = person3.equals(person4); // 这时候（equals方法重写后）是比较对象的属性
		System.out.println("person3.equals(person4): " + bool); // true
		
		// 比较非Person类处理：
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(person4.equals(list)); // false，不是Person类
	}
}
