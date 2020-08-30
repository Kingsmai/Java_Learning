package tut.d1interface.demo03;

public interface MyInterfaceB {

	public abstract void methodB();
	
	public abstract void methodCommon();
	
	public default void methodDefault() {
		System.out.println("Default A");
	}
}
