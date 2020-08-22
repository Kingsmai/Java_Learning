package tut.demo.d2array;
/*
 * 用数组作为返回值，可以实现一个函数拥有多个返回值
 * 
 * 任何数据类型都可以作为方法参数类型和返回值类型，
 * 数组作为方法的参数，其实是传递数组的地址
 * 数组作为方法的返回，其实是返回数组的地址
 */
public class Demo08ArrayReturn {
	public static void main(String[] args) {
		int[] result = calculate(10, 20, 30);
		System.out.println("main方法接收到的数组是：" + result); // 返回值
		System.out.println("总和：" + result[0]);
		System.out.println("平均数：" + result[1]);
	}
	
	public static int[] calculate(int a, int b, int c) {
		int sum = a + b + c; // 总和
		int avg = sum / 3; // 平均数
		// 需要一个数组，可以保存多个结果
//		int[] array = new int[2];
//		array[0] = sum;
//		array[1] = avg;
		int[] array = {sum, avg};
		System.out.println("calculate方法内部的数组是：" + array); // 地址值
		return array;
	}
}
