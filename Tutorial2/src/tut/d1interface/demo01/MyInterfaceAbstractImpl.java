package tut.d1interface.demo01;

/*
 * Impl 是 implement 的缩写，软性建议：想实现哪个接口就抄写该接口名字后面加上 Impl
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {

	@Override
	public void methodAbs1() {
		// TODO Auto-generated method stub
		System.out.println("这是第一个方法");
	}

	@Override
	public void methodAbs2() {
		// TODO Auto-generated method stub
		System.out.println("这是第二个方法");
	}

	@Override
	public void methodAbs3() {
		// TODO Auto-generated method stub
		System.out.println("这是第三个方法");
	}

	@Override
	public void methodAbs4() {
		// TODO Auto-generated method stub
		System.out.println("这是第四个方法");		
	}

	
}
