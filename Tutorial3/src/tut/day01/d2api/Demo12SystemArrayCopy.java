package tut.day01.d2api;

import java.util.Arrays;

public class Demo12SystemArrayCopy {

	public static void main(String[] args) {
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
