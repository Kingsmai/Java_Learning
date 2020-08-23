package tut.demo.d5classes;

public class Demo01Person {
	public static void main(String[] args) {
		Person person = new Person();
		// 我自己的名字
		person.name = "张三";
		person.sayHello("李四");
		person.sayHi("王五");
		
		// 通过谁调用的方法，谁就是this
		System.out.println(person); // tut.demo.d5.Person@15db9742
		person.printThis(); // 同上
	}
}
