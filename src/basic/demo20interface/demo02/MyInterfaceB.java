package basic.demo20interface.demo02;

public interface MyInterfaceB {

	public abstract void methodB();

	public abstract void methodSame();

	public default void methodDefault() {
		System.out.println("接口B的默认方法");
	}
}
