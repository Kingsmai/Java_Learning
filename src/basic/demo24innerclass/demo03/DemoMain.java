package basic.demo24innerclass.demo03;

/*
 * 如果接口的实现类（或者父类的子类）只需要使用唯一的一次。
 * 那么这种情况下，就可以省略掉该类的定义，而改为使用匿名内部类
 * 
 * 匿名内部类的定义格式：
 * 接口名称 对象名 = new 接口名称() {
 * 	// 覆盖重写接口中所有抽象方法
 * }
 * 
 * 对格式”new 接口名称() {...}“进行解析:
 * 1. new 代表创建对象的动作
 * 2. 接口名称就是匿名内部类所需要实现的哪个接口
 * 3. {...}这才是匿名内部类的内容
 * 
 * 另外还要注意几点问题：
 * 1. 匿名内部类在【创建对象】的时候只能使用唯一一次，
 * 如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了
 * 2. 匿名对象，在【调用方法】的时候，只能调用唯一一次，
 * 如果希望同一个对象调用多次方法，那么必须给对象取个名字
 * 3. 匿名内部类是省略了【内部类 / 子类】，但是匿名对象是省略了【对象名称】
 * 强调：匿名内部类和匿名对象不是一回事
 */
public class DemoMain {

	public static void main(String[] args) {
//		MyInterface impl = new MyInterfaceImpl(); // 多态
//		impl.methodAbs();
		
//		MyInterface some = new MyInterface(); // 错误写法
		
		// 使用匿名内部类，但不是匿名对象，对象名称就是objA
		MyInterface objA = new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法，1-A");
				System.out.println("这就不用创建MyInterfaceImpl实现类了");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法，2-A");
			}
		};
		objA.methodAbs();
		objA.methodTwo();
		
		MyInterface objB = new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("又得在重写一边（创建对象只能使用唯一一次），1-B");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法，2-B");
			}
		};
		objB.methodAbs();
		objB.methodTwo();
		System.out.println("==============");
		
		// 使用了匿名内部类，而且省略了对象名称，也是匿名对象
		new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("我要嘛调用这个，methodAbs - 1");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("要嘛就调用这个，methodTwo - 1");
			}
		}.methodAbs();
		// 因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
		new MyInterface() {
			
			@Override
			public void methodAbs() {
				// TODO Auto-generated method stub
				System.out.println("我要嘛调用这个，methodAbs - 2");
			}

			@Override
			public void methodTwo() {
				// TODO Auto-generated method stub
				System.out.println("要嘛就调用这个，methodTwo - 2");
			}
		}.methodTwo();
	}
}
