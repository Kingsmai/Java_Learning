package basic.demo20interface.demo02;

public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("覆盖重写了A方法");
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("覆盖重写了B方法");
		
	}

	@Override
	public void methodSame() {
		// TODO Auto-generated method stub
		System.out.println("覆盖重写了Same方法，只需重写一次");
		
	}
	
	@Override
	public void methodDefault() {
		// TODO Auto-generated method stub
		System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
	}

}
