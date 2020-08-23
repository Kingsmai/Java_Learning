package tut.demo.d6standardclass;

public class Demo01Student {
	public static void main(String[] args) {
		Student stu1 = new Student(); // 创建新的student空对象
		System.out.println("姓名：" + stu1.getName() + "，年龄" + stu1.getAge());
		stu1.setName("张三");
		stu1.setAge(20);
		System.out.println("姓名：" + stu1.getName() + "，年龄" + stu1.getAge());
		System.out.println("=========");
		Student stu2 = new Student("李四", 21); // 创建新的student对象
		System.out.println("姓名：" + stu2.getName() + "，年龄" + stu2.getAge());
		stu2.setAge(22); // 修改年龄
		System.out.println("姓名：" + stu2.getName() + "，年龄" + stu2.getAge());
	}
}
