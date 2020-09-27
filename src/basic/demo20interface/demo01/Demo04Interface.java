package basic.demo20interface.demo01;

public class Demo04Interface {

	public static void main(String[] args) {
		MyInterfacePrivateB.methodStatic1();
		MyInterfacePrivateB.methodStatic2();
		// 错误写法，不能访问private内容
//		MyInterfacePrivateB.methodStaticCommon();
	}
}
