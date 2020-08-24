package tut.demo01.d2array;
/*
 * 数组反转：
 * 要求不能使用新数组
 * 
 * 1. 数组元素反转，其实就是对称位置的元素交换
 * 
 * 2. 通常遍历数组用一个索引
 * int i = 0;
 * 2. 现在表示对称位置需要两个索引
 * int i = 0;
 * int j = array.length - 1;
 * 
 * 3. 交换两个变量的值
 * int a = 10;
 * int b = 20;
 * 3. 实现：
 * int temp = a;
 * a = b;
 * b = temp;
 * 
 * 4. 什么时候停止：当 i == j || i > j
 * 5. 什么时候交换：i < j
 */
public class Practise02ArrayReverse {
	public static void main(String[] args) {
		int[] array = {10, 20, 30, 40, 50};
		for (int num : array) {
			System.out.print(num + ", ");
		}
		System.out.println();
		/*
		 * 初始化语句：int min = 0, max = array.length - 1;
		 * 条件判断：min < max;
		 * 步进表达式：min++, max--
		 */
		for (int min = 0, max = array.length - 1; min < max; min++, max--) {
			int temp = array[min];
			array[min] = array[max];
			array[max] = temp;
		}
		for (int num : array) {
			System.out.print(num + ", ");
		}
	}
}
