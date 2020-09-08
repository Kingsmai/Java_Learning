package tut.demo01.d5classes;

public class Demo02Student {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Student stu1 = new Student(); // 其实就是调用Student的构造函数
		System.out.println("=============");
		Student stu2 = new Student("小麦", 19);
		System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
		// 如果需要改变对象当中成员变量数据内容，仍然需要使用setXxx()方法
		stu2.setAge(20); // 改变年龄
		System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
	}
}
