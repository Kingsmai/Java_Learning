package tut.demo01.d2array;
/*
 * 获取数组长度：
 * arrayName.length
 * 将得到一个数组名字，代表数组长度
 * 数组一旦创建，程序运行期间长度不可改变
 * 
 * 遍历数组：对数组的每一个元素进行处理
 */
public class Demo06ArrayLength {
	public static void main(String[] args) {
		int[] array = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
		int len = array.length;
		System.out.println(len); // 11
		
		int[] arrayB = new int[3];
		System.out.println(arrayB.length); // 3
		arrayB = new int[5];
		// 地址改变了
		System.out.println(arrayB.length); // 5
		
		System.out.println("===========");
		
		// 遍历数组：原始方式
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		// 得一个一个敲，很麻烦

		System.out.println("===========");
		
		// 遍历数组：for方法
		for (int i = 0; i < 11; i++) {
			System.out.println(array[i]);
		}
		// 万一数组的元素更多，要改判断值

		System.out.println("===========");
		
		// 遍历数组：for方法配合length
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("===========");
		
		// 遍历数组：foreach方法
		for (int i : array) {
			System.out.println(i);
		}
	}
}
