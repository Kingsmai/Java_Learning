package basic.demo03array;

/*
 * 数组：存储多个相同变量名的数据
 * 数组的特点：
 * 1. 数组是一种引用数据类型
 * 2. 数组当中的的多个数据，类型必须统一
 * 3. 数组的长度在程序运行期间不可改变
 * 
 * 数组的初始化：在内存当中创建数组，并向其中赋予一些默认值
 * 1. 动态初始化（指定长度）：在创建数组的时候，直接指定数组当中的元素个数
 * 2. 静态初始化（指定内容）：不直接指定数据个数，而是将具体数据内容进行指定
 * 
 * 动态初始化格式：
 * 数据类型[] 数组名称 = new 数据类型[数组长度];
 * 解析：
 * 1. 左侧数据类型：也就是数组当中保存的数据，全都是统一的什么类型
 * 2. 左侧的中括号：说明我是一个数组
 * 3. 左侧数组名称：给数组取个名称
 * 4. 右侧new：代表创建数组的动作
 * 5. 右侧数据类型：必须和左边数据类型保持一致
 * 6. 右侧中括号内的数字：表示数组长度（能够保存多少个数据）（是int型）
 * 
 * 静态初始化格式：
 * 数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2, ...};
 * 虽然没有直接告诉长度，但根据大括号里面的内容，可以自动推算出长度
 * 
 * 静态初始化格式（省略）：
 * 数组类型[] 数组名称 = {元素1, 元素2, ...};
 */
public class Demo01Array {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 没有数组的情况下（存储多个数据很麻烦）：
		int score1 = 100;
		int score2 = 98;
		int score3 = 99;
		System.out.println(score3);
		score2 = 92;
		System.out.println(score2);
		
		// 有数组
		// 动态初始化：
		int[] arrayA = new int[10]; // 创建一个int类型数组，可以存放10个数据
		double[] arrayB = new double[20]; // 创建一个double类型数组，可存放20个数据
		String[] arrayC = new String[5]; // 创建一个String类型数组，可存放5个数据
		
		// 静态初始化：
		int[] arrayD = new int[] {5, 10, 15}; // 创建一个int类型数组，里面存放3个数据
		String[] arrayE = new String[] {"Hello", "World", "Java"}; // 创建一个String类型数组，可存放3个数据
		
		// 静态初始化（省略）：
		int[] arrayF = {16, 32, 64};
		
		// 静态初始化的标准格式可以分为两个步骤：
		int[] arrayG;
		arrayG = new int[] {128, 256, 512};
		
		// 静态初始化使用省略格式，就不能分为两个步骤
		int[] arrayH;
//		arrayH = {1024, 2048, 4096}; // 报错
		
		// 动态初始化也可以拆分为两个步骤
		int[] arrayI;
		arrayI = new int[5];
	}
}
