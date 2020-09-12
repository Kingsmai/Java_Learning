package tut.day02.d3generic;

/*
 * 测试含有泛型的方法
 */
public class Demo03GenericMethod {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 创建GenericMethod对象
		GenericMethod gm = new GenericMethod();
		
		/*
		 * 调用含有泛型的方法method01
		 * 传递什么类型，泛型就是什么类型
		 */
		gm.method01(10); // 10
		gm.method01("abc"); // abc
		gm.method01(8.8); // abc
		gm.method01(true); // abc
		
		gm.method02("静态方法不建议创建对象使用");
		
		// 静态方法，通过类名.方法名(参数)可以直接使用
		GenericMethod.method02("通过类名.方法名(参数)可以直接使用");
		GenericMethod.method02(123); // 123
	}
}
