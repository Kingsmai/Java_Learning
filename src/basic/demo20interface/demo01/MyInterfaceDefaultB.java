package basic.demo20interface.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {

	@Override
	public void methodAbs() {
		// TODO Auto-generated method stub
		System.out.println("实现了抽象方法，BBB");
	}
	
	@Override
	public void methodDefault() {
		// TODO Auto-generated method stub
		System.out.println("实现类B覆盖重写了接口的默认方法");
	}
}
