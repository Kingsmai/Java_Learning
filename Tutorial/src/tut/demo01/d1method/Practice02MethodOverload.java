package tut.demo01.d1method;
/*
 * 方法重载练习
 */
public class Practice02MethodOverload {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		System.out.println(isSame(a, b));
		System.out.println(isSame((short)10, (short)10));
		System.out.println(isSame(11, 12));
		System.out.println(isSame(20L, 20L));
	}
	
	/*
	 * 比较两个数据是否相等
	 * 数据类型分别为：byte, short, int, long
	 * 加强：用不同的方法写函数内部程序逻辑
	 */
	public static boolean isSame(byte a, byte b) {
		System.out.println("比较两个byte的方法执行！");
		boolean same;
		if (a == b) {
			same = true;
		} else {
			same = false;
		}
		return same;
	}
	public static boolean isSame(short a, short b) {
		System.out.println("比较两个short的方法执行！");
		boolean same = a == b ? true : false;
		return same;
	}
	public static boolean isSame(int a, int b) {
		System.out.println("比较两个int的方法执行！");
		return a == b;
	}
	public static boolean isSame(long a, long b) {
		System.out.println("比较两个long的方法执行！");
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}
}
