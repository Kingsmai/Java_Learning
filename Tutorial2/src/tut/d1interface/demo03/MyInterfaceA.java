package tut.d1interface.demo03;

public interface MyInterfaceA {

	public abstract void methodA();

	public abstract void methodCommon();
	
	public default void methodDefault() {
		System.out.println("Default A");
	}
}
