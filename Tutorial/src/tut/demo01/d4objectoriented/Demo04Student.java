package tut.demo01.d4objectoriented;

public class Demo04Student {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("Xiaomai");
		stu.setAge(20);
		stu.setMale(true);
		System.out.println("姓名：" + stu.getName());
		System.out.println("年龄：" + stu.getAge());
		System.out.println("是不是男的：" + stu.isMale());
	}
}
