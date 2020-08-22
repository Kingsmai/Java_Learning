package tut.demo.d2array;
/*
 * 获取最值：
 * 思路：
 * 1. 定义变量，保存数组0索引上的元素
 * 2. 遍历数组，获取出数组中的每个元素（可用for循环，或foreach）
 * 3. 将遍历到的元素和保存的元素作比较
 * 4. 如果比较结果为真，那么就将当前元素赋值给保存元素
 * 5. 遍历结束，保存的元素就是比较后的元素
 */
public class Practise01ArrayMinMax {
	public static void main(String[] args) {
		int[] nums = {5, 15, -20, 30, 10000, 25};
		int max = nums[0];
		int min = nums[0];
		for (int num : nums) {
			max = num > max ? num : max;
			min = num < min ? num : min;
		}
		System.out.println("最大值是：" + max);
		System.out.println("最小值是：" + min);
	}
}
