package tut.demo.d4objectoriented;

public class Demo03Person {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "小麦";
//		person.age = 19; // 直接访问private内容，错误
		person.setAge(-19);
		person.show();
	}
}
