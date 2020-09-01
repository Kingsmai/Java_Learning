package tut.d5innerclass.demo01;

/*
 * 如果出现了重名对象，那么格式是：外部类名称.this.外部类成员变量名
 */
public class Outer {

	int num = 10; // 外部类的成员变量
	
	public class Inner /* extends Object */ {
		int num = 20; // 内部类的成员变量
		
		public void methodInner() {
			int num = 30; // 内部类方法的局部变量
			System.out.println(num); // 30，局部变量，就近原则
			System.out.println(this.num); // 20，内部类的成员变量
//			System.out.println(super.num); // 错误的，内部类不是继承关系
			System.out.println(Outer.this.num); // 10，外部类的成员变量
		}
	}
}
