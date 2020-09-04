package tut.d1api.demo04.system;

import java.util.Arrays;

/*
 * `java.lang.System`类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，在System类的API文档中，常用的方法有：
 * `public static long currentTimeMillis()`：返回以毫秒为单位的当前时间。
 * `public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)`：将数组中指定的数据拷贝到另一个数组中。
 */
public class Demo01System {

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
		
		/*
		 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 * 将数组中指定的数据拷贝到另一个数组中。
		 * 参数：
		 * src - 源数组。
		 * srcPos - 源数组中的起始位置。
		 * dest - 目标数组。
		 * destPos - 目标数据中的起始位置。
		 * length - 要复制的数组元素的数量。
		 */
		/*
		 *  题目：将src数组中前3个元素，复制到dest数组的前3个位置上
		 *  复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
		 *  复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
		 */
		int[] src = {1, 2, 3, 4, 5};
		int[] dest = {6, 7, 8, 9, 10};
		System.out.println("复制前src: " + Arrays.toString(src) + ", dest: " + Arrays.toString(dest));
		System.arraycopy(src, 0, dest, 0, 3);
		System.out.println("复制后src: " + Arrays.toString(src) + ", dest: " + Arrays.toString(dest));
	}
}
