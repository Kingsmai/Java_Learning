package tut.d1interface.demo03;

/*
 * 这个子接口有4个方法：
 * methodA 来源于接口A
 * methodB 来源于接口B
 * methodCommon 同时来源于接口A和B
 * method 来源于我自己
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

	public abstract void method();

	@Override
	default void methodDefault() {
		// TODO Auto-generated method stub
		System.out.println("覆盖重写默认方法");
	}
}
