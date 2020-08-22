package tut.demo.d2array;
/*
 * 访问数组元素的格式：
 * 数组名称[索引值]
 * 索引值：int数值，代表数组当中元素的编号
 * 从 0 开始，一直到数组长度的 -1 为止
 * 
 * 使用动态初始化数组的时候，其中元素将自动拥有一个默认值，
 * 默认值规则如下：
 * byte short int long: 0;
 * double float: 0.0;
 * char: '\u0000'; // Unicode
 * boolean: false;
 *.引用类型： null;
 *
 *静态初始化也有默认值，但是自动马上被大括号内的内容覆盖了
 *（过程是不会少的，现有默认值，再有大括号的内容）
 */
public class Demo02ArrayUse {
	public static void main(String[] args) {
		// 静态初始化一个数组（省略版）
		int[] ArrayA = {2, 4, 8};
		// 直接打印数组，得到的是数组对应的“内存地址哈希值”
		System.out.println(ArrayA); // [I@15db9742 内存地址哈希值
		// [ 代表他是数组
		// I 代表这是整数型 Interger
		// 15db9742 是十六进制（内存地址值）
		
		// 访问数组的元素
		System.out.println(ArrayA[0]); // 2 打印0号（第一个）元素
		System.out.println(ArrayA[1]); // 4 打印1号（第二个）元素
		System.out.println(ArrayA[2]); // 8 打印2号（第三个）元素
		
		// 使用
		int num = ArrayA[1];
		System.out.println(num); // 4
		
		
		
		// 动态初始化一个数组
		int[] ArrayB = new int[3];
		System.out.println(ArrayB); // [I@6d06d69c
		System.out.println(ArrayB[0]); // 0
		System.out.println(ArrayB[1]); // 0
		System.out.println(ArrayB[2]); // 0
//		System.out.println(ArrayB[3]); // 报错，数组长度为3，下标最大值应为2
		
		System.out.println("===============");
		ArrayB[1] = 256;
		System.out.println(ArrayB[0]); // 0
		System.out.println(ArrayB[1]); // 256
		System.out.println(ArrayB[2]); // 0
	}
}
