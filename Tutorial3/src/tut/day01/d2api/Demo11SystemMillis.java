package tut.day01.d2api;

public class Demo11SystemMillis {

	public static void main(String[] args) {
		/*
		 * public static long currentTimeMillis()
		 * 返回以毫秒为单位的当前时间。
		 */
		// 题目：验证for循环打印数字1-9999所需要使用的时间（毫秒）
		// 程序执行前，获取一次毫秒值
		long start = System.currentTimeMillis();
		for(int i = 0; i < 9999; i++) {
			System.out.println(i);
		}
		// 程序执行后，获取一次毫秒值
		long end = System.currentTimeMillis();
		// 计算差值
		System.out.println("程序共运行" + (end - start) + "ms");
	}
}
