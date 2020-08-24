package tut.demo01.d4objectoriented;
/*
 * 面向对象三大特征：封装、继承、多态
 * 
 * 封装性在Java中的体现：
 * 1. 方法就是一种封装
 * 2. 关键字也是一种封装
 * 
 * 封装就是将一些细节信息隐藏起来，对于外界不可见
 */
public class Demo02OOFeatures {
	public static void main(String[] args) {
		int[] array = {5, 15, 25, 100, 20};
		int max = getMax(array);
		System.out.println("最大值：" + max);
	}
	
	// 给我一个数组，还你一个最大值
	// 方法就是一种封装
	public static int getMax(int[] array) {
		int max = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if (max < array[i]) {
//				max = array[i];
//			}
//		}
		
		// 简单一点的写法
		for (int i : array) {
			max = max < i ? i : max;
		}
		
		return max;
	}
}
