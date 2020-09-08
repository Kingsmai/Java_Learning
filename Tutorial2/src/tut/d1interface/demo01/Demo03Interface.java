package tut.d1interface.demo01;

/*
 * 注意事项：不能通过接口实现类的对象来调用接口当中的静态方法
 * 正确方法：通过接口名称，直接调用其中的接口方法
 * 格式：
 * 接口名称.静态方法名(参数);
 */
public class Demo03Interface {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 创建了实现类对象
		MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
		
//		impl.methodStatic(); // 错误写法
		
		// 直接通过接口名称调用静态方法，不用new一个实列
		MyInterfaceStatic.methodStatic();
	}
}
