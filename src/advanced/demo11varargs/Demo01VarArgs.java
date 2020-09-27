package advanced.demo11varargs;

/*
 * 可变参数：JDK 1.5之后出现的新特性
 * 使用前提：
 *     当方法的参数列表的数据类型已经确定，但是参数个数不确定，就可以使用可变参数
 * 使用格式：定义方法时使用
 *     修饰符 返回值类型 方法名(数据类型... 变量名) {} // 没错，就是...不是省略号
 * 可变参数的原理：
 *     可变参数的底层就是一个数组，根据传递参数个数不同，他会创建不同长度的数组，来存储这些参数
 *     传递的参数个数，可以是0个（不传递）或多个
 *     
 * 注意事项：
 * 1. 一个方法的参数列表，只能有一个可变参数
 * 2. 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
 */
public class Demo01VarArgs {

	public static void main(String[] args) {
		int i = add(); // [I@2d363fb3
		System.out.println(i); // 0
		i = add(10);
		System.out.println(i); // 10
		i = add(10, 20);
		System.out.println(i); // 30
		i = add(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		System.out.println(i); // 550
	}
	
	/*
	 * 定义计算（0-n）整数和的方法
	 * 已知：计算整数的和，数据类型已经确定了int类型
	 * 但是参数个数不确定，不知道要计算几个整数的和，就可以使用可变参数
	 * 调用add()，就会创建一个长度为0的数组，new int[0]
	 * 调用add(10)，就会创建一个长度为1的数组，存储传递过来的参数，new int[]{10}
	 * 调用add(20)，就会创建一个长度为2的数组，存储传递过来的参数，new int[]{10, 20}
	 */
	public static int add (int...num) {
		System.out.println(num); // 底层是一个数组
		System.out.println(num.length);
		int sum = 0;
		// 通过增强for循环
		for (int i : num) {
			sum += i;
		}
		return sum;
	}
	
	// 定义一个方法，计算两个int类型整数的和
//	public static int add (int a, int b, int c) {
//		return a + b + c;
//	}
	
	// 定义一个方法，计算两个int类型整数的和
//	public static int add (int a, int b) {
//		return a + b;
//	}
	
	/*
	 * 注意事项：
	 * 1. 一个方法的参数列表，只能有一个可变参数
	 * 2. 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
	 */
//	public static void method(int...a, String...b) {}; // The variable argument type int of the method method must be the last parameter
//	public static void method(int...a, String b, double c) {}; //
	public static void method(String b, double c, int...a) {};
	
	// 可变参数的特殊（终极）写法：
	public static void function(Object...obj) {}; // 可以接收任意数据
}
