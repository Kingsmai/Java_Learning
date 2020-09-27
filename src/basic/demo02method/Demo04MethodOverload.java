package basic.demo02method;

/*
 * 对于功能类似的方法，因为参数列表不一样，需要记住太多不一样的名字，太麻烦
 * 方法的重载：Overload：
 * 方法的名称一样，但是参数列表不一样
 * 谁能对上这个参数，就用谁；谁都对不上，就报错
 * 好处：
 * 只需要记住一个方法名称，就可以实现类似的多个功能
 *
 * 方法重载与下列因素相关：
 * 1. 参数个数不同
 * 2. 参数类型不同
 * 3. 参数的多类顺序不同
 *
 * 方法重载与下列因素无关：
 * 1. 与参数名称无关
 * 2. 与方法的返回值类型无关
 */
public class Demo04MethodOverload {
	public static void main(String[] args) {
		System.out.println(sumTwo(10, 20));
		System.out.println(sumThree(10, 20, 30));
		System.out.println(sumFour(10, 20, 30, 40));

		// 重载
		System.out.println(sum(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10, 20, 30, 40));
//		System.out.println(sum(10, 20, 30, 40, 50)); // 错误，找不到这个参数（数量）的方法
	}

	/*
	 * 正常情况下：
	 */
	public static int sumTwo(int a, int b) {
		return a + b;
	}
	public static int sumThree(int a, int b, int c) {
		return a + b + c;
	}
	public static int sumFour(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	/*
	 *  方法的重载：
	 */
	public static int sum(int a, int b) {
		return a + b;
	}
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	// 参数类型对上
	public static int sum(double a, double b) {
		return (int) (a + b);
	}

	public static int sum(int a, double b) {
		return (int) (a + b);
	}

	public static int sum(double a, int b) {
		return (int) (a + b);
	}
	// 与参数名无关
//	public static int sum(int x, int y) { //上面已经定义过两个int类型的参数
//		return x + y;
//	}
	// 与返回值类型无关
//	public static double sum(int a, int b) { // 其实就跟上面一样
//		return a + b + 0.0;
//	}
}