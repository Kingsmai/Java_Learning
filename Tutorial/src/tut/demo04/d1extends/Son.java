package tut.demo04.d1extends;

/*
 * super关键字用法有三种：
 * 1. 在子类的成员方法中，访问父类的成员变量
 * 2. 在子类的成员方法中，访问父类的成员方法
 * 3. 在子类的构造方法中，访问父类的构造方法
 * 
 * super关键字用来访问父类内容，this关键字用来访问本类内容
 * 
 * this关键字用法有三种：
 * 1. 在本类的成员方法中，访问本类的成员变量
 * 2. 在本类的成员方法中，访问本类的另一个成员方法
 * 3. 在本类的构造方法中，访问本类的另一个构造方法
 * 在第三种方法当中要注意：
 * A. this(...)调用也必须是构造方法中的第一个语句，唯一一个
 * B. super和this两种构造调用不能同时使用
 */
public class Son extends Father {
	int numSon = 20;
	
	int num = 200;
	
	public Son() {
//		super(); // 调用父类无参构造方法，不写就是隐含的
		super(10); // 调用父类重载的构造方法
		// super必须得是第一行，而且只有一个
		System.out.println("子类构造方法");
	}
	
	public Son (int n) {
		this(); // 本类的有参构造，调用本类的无参构造
		//（也可以反过来，但是必须写在第一行）		
		// 还有就是不能有super();因为调用构造方法只能在第一个语句中执行
//		super(); // 再写个super();就报错了
	}
	
	public void methodSon() {
		System.out.println("子类方法执行");
		// 因为本类当中有num，所以这里用的是本类的num
		System.out.println(num);
	}
	
	// 区分三种变量重名：
	@Override // 检测是不是有效的正确覆盖重写（建议写上）
	public String method() { // 返回值范围 Object > String
//		super(); // 错误写法，只有子类构造方法才能调用父类构造方法
		super.method(); // 调用父类成员方法
		System.out.println("子类重名方法执行");
		int num = 300; // 局部变量
		System.out.println(num); // 300，局部变量
		System.out.println(this.num); // 200，本类的成员变量
		System.out.println(super.num); // 100，父类的成员变量
		return null;
	}
	
	public void methodA() {
		System.out.println("methodA执行");		
	}
	
	public void metthodB() {
		methodA();
		this.methodA(); // 强调使用本类的成员方法
		System.out.println("methodB执行");
	}
}
