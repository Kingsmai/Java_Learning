package tut.d1interface.demo01;

/*
 * 1. 接口的默认方法，可以通过接口的实现类对象直接调用
 * 2. 接口的默认方法， 也可以被接口实现类进行覆盖重写
 */
public class Demo02Interface {

	public static void main(String[] args) {
		MyInterfaceDefaultA a = new MyInterfaceDefaultA();
		
		// 调用抽象方法，实际运行的是右侧实现类
		a.methodAbs();
		// 调用默认方法，如果实现类当中没有，会向上找接口的
		a.methodDefault();
		System.out.println("==============");
		
		MyInterfaceDefaultB b = new MyInterfaceDefaultB();
		b.methodAbs();
		b.methodDefault();
	}
}
