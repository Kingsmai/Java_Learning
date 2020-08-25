package tut.demo02.d4arraylist;

import java.util.ArrayList;

/*
 * 自定义4个学生对象,添加到集合,并遍历
 * 
 * 思路：
 * 1. 自定义Student类，四个部分
 * 1.1. private修饰词，无参构造方法，全参构造方法，getter/setter
 * 2. 创建一个集合，用于存储学生对象，泛型<Student>
 * 3. 根据类，创建4个学生对象
 * 4. 将4个学生对象添加到集合中，add
 * 5. 遍历集合for, size, get
 */
public class Practise02ArrayListStudent {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Student one = new Student("张三", 18);
		Student two = new Student("李四", 28);
		Student three = new Student("王五", 38);
		Student four = new Student("赵六", 48);
		
		students.add(one);
		students.add(two);
		students.add(three);
		students.add(four);
		
//		System.out.println(students); // 地址集合
		for (int i = 0; i < students.size(); i++) {
//			System.out.println(students.get(i)); // 地址值
			Student std = students.get(i);
			System.out.println("姓名：" + std.getName() + "，年龄：" + std.getAge());
		}
	}
}
