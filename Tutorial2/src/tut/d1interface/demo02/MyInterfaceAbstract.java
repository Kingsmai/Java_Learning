package tut.d1interface.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB {
	
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodSame() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void methodDefault() {
		// TODO Auto-generated method stub
		System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
	}

}
