package tut.demo04.d1extends;

/*
 * 在继承关系中，“子类就是一个父类”。也就是说，子类可以被当作父类看待
 * 例如：父类是员工，子类是个讲师，那么“讲师就是一个员工”。关系：is-a
 * 
 * 定义父类的格式：
 * public class 父类名称 {
 * 	// ...
 * }
 * 
 * 定义子类的格式：
 * public class 子类名称 extends 父类名称 {
 * 	// ...
 * }
 */
public class Demo01Extends {
	public static void main(String[] args) {
		// 创建一个子类对象
		Teacher teacher = new Teacher();
		// 运行父类里的函数
		// Teacher当中什么都没写，但是会继承来自父类method方法
		teacher.method();
		
		Assistance assistance = new Assistance();
		assistance.method();
	}
}
