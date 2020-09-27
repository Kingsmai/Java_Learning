package basic.demo15static;

/*
 * 如果一个成员变脸使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一份数据
 */
public class Demo01StaticField {
	@SuppressWarnings("static-access") // 无视“访问静态”的警告
	public static void main(String[] args) {
		Student one = new Student("郭靖", 19);
		one.classroom = "101教室";
		Student.classroom = "101教室"; // eclipse编译器建议写成这个格式，输出也一样，但是我没改
		System.out.println("学号：" + one.getId() + "，姓名：" + one.getName() + "，年龄：" + one.getAge() + "，教室：" + one.classroom);
		Student two = new Student("黄蓉", 16);
		System.out.println("学号：" + two.getId() + "，姓名：" + two.getName() + "，年龄：" + two.getAge() + "，教室：" + two.classroom);		
	}
}
