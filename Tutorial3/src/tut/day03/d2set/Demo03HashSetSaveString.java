package tut.day03.d2set;

import java.util.HashSet;

/*
 * HashSet存储自定义类型元素
 * 
 * Set集合保证元素唯一：
 *     存储的元素（String, Integer, ..., Student, Person, ...）必须重写hashCode方法和equals方法
 *     
 * 要求：同名且同年龄的人，视为同一个人，只能存储一次
 */
public class Demo03HashSetSaveString {

	public static void main(String[] args) {
		// 创建HashSet集合存储Person
		HashSet<Person> set = new HashSet<>();
		Person p1 = new Person("扬尘", 21);
		Person p2 = new Person("木灵韵", 19);
		Person p3 = new Person("扬尘", 21);
		// 还没重写hashCode之前，哈希值不同
		System.out.println(p1.hashCode()); // 2104457164 | 806264
		System.out.println(p2.hashCode()); // 1521118594 | 26310998
		System.out.println(p3.hashCode()); // 1940030785 | 806264
		// 还没重写equals方法之前，同名同年龄返回false（比较的是地址值）
		System.out.println(p1==p2); // false | false
		System.out.println(p1==p3); // false | false
		System.out.println(p1.equals(p2)); // false | false
		System.out.println(p1.equals(p3)); // false | true
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println(set); // [Person [name=扬尘, age=21], Person [name=木灵韵, age=19]]
	}
}
