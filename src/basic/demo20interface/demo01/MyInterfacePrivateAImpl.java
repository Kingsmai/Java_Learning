package basic.demo20interface.demo01;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA{

	public void methodAnother() {
		// 直接访问到了接口中的默认方法，这样做是错误的
		// methodCommon不允许独立存在
//		methodCommon();
	}
}
