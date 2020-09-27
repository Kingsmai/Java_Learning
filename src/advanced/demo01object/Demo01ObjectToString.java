package advanced.demo01object;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import tut.day01.d2api.Person;

/*
 * java.lang.Object类
 * Object 是类层次结构的根类（最顶层）。每个类都使用Object作为超类（父类）。
 * 所有对象（包括数组）都实现这个类的方法
 */
public class Demo01ObjectToString {

	public static void main(String[] args) {
		/*
		 * Person类默认继承了Object类，所以可以使用Object类中的toString方法
		 * String toString() 返回该对象的字符串表示
		 */
		Person person = new Person("张三", 18);
		String str = person.toString();
		System.out.println(str); // tut.d1api.demo01.object.Person@7d6f77cc
		
		// 直接打印对象的名字，其实就是调用对象的toString方法，person等于person.toString();
		System.out.println(person); // tut.d1api.demo01.object.Person@7d6f77cc
		
		/*
		 * 看一个类是否重写了toString方法，直接打印他的名字即可
		 * 如果没有重写toString方法，那么打印的就是地址值
		 * 如果重写toString方法，那么按照重写的方式打印
		 */
		Random rnd = new Random();
		System.out.println(rnd); // java.util.Random@69222c14  没有重写toString方法
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc); // java.util.Scanner[delimiters=\p{javaWhitespace}+]...  重写toString方法
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list); // [1, 2]  重写toString方法
	}
}
