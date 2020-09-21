package tut.day05.d1exception;

/*
 * 子父类的异常：
 *     - 如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常只能捕获处理，不能声明抛出
 *     - 父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常，只能捕获处理，不能声明抛出
 * 注意：
 *     父类异常是什么样，子类异常就什么样
 */
public class Demo10Father {

	public void show01() throws NullPointerException, ClassCastException {}
	
	public void show02() throws IndexOutOfBoundsException {}
	
	public void show03() throws IndexOutOfBoundsException {}
	
	public void show04() {}
}

class Son extends Demo10Father {
	// 子类重写父类方法时，抛出和父类相同的异常
	@Override
	public void show01() throws NullPointerException, ClassCastException {}
	
	// 子类重写父类方法时，抛出父类异常的子类，
	@Override
	public void show02() throws ArrayIndexOutOfBoundsException {}
	
	// 子类重写父类方法时，不抛出异常
	@Override
	public void show03() {}
	
	// 父类没有抛出异常，子类重写父类方法时，也不能抛出异常
	@Override
	public void show04() {
		// 子类产生异常，只能处理不能抛出
		try {
			throw new Exception("编译期异常");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
