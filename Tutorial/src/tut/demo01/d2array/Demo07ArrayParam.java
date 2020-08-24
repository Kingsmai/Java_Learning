package tut.demo01.d2array;
/*
 * 数组可以作为方法的参数
 * 当调用方法时，向方法小括号进行传参，传进去的其实是数组的地址值
 */
public class Demo07ArrayParam {
	public static void main(String[] args) {
		int[] array = {10, 20, 30};
		System.out.println(array); // 地址值
		printArray(array);
		System.out.println("=====AAA=====");
		printArray(array);
		System.out.println("=====BBB=====");
		printArray(array);
	}
	
	/*
	 * 返回值类型：打印，不需要计算，没有结果，用void
	 * 方法名称：printArray
	 * 参数列表：必须给我数组，才能打印里边的元素int[] array
	 */
	public static void printArray (int[] array) {
		System.out.println("printArray方法收到的参数是：" + array); // 地址值
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
