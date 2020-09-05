package tut.d2api.frequent;

/*
 * StringBuilder的append方法
 * public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class Demo14StringBuilderAppend {

	public static void main(String[] args) {
		// 创建StringBuilder对象
		StringBuilder str1 = new StringBuilder();
		// 使用append方法往StringBuilder中添加数据
		// append方法返回的是this -> 调用方法的对象
		StringBuilder str2 = str1.append("Hello, World!"); // 把str1的地址赋值给str2
		System.out.println(str1); // Hello, World!
		System.out.println(str2); // Hello, World!
		System.out.println(str1 == str2); // true（地址值相同）
		
		// 使用append方法无需接收返回值
		StringBuilder str3 = new StringBuilder();
		// 可以插入任意数据
		str3.append("Hello");
		str3.append('J');
		str3.append(true);
		str3.append(12);
		str3.append('字');
		str3.append(3.1415);
		System.out.println(str3); // HelloJtrue12字3.1415
		
		// 链式编程：方法返回值是一个对象，可以继续调用方法
		System.out.println("abc".toUpperCase().toLowerCase()); // 可以继续toUpperCase...
		StringBuilder str4 = new StringBuilder();
		str4.append("abc").append(123).append('z').append(Math.PI).append(false);
		System.out.println(str4); // abc123z3.141592653589793false
	}
}
