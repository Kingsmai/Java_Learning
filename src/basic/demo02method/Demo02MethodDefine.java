package basic.demo02method;

/*
 * 方法是若干个功能得到集合
 *
 * 参数：传入方法的数据
 * 返回值：方法出来的值
 *
 * 定义方法格式：
 * 修饰符 返回值类型 方法名称（参数类型 参数名称，……） {
 * 	函数体
 * return;
 * }
 *
 * 修饰符：现阶段固定写法：public static
 * 返回值类型：也就是方法最终产生（return）的数据结果类型
 * 方法名称：命名规则和变量一样，小驼峰
 * 参数类型：传入方法的数据是什么类型
 * 参数名称：传入方法的的数据对应的变量名称
 * PS: 参数如果有多个，使用逗号进行分割
 * 方法体：方法需要做的事情，若干行代码
 * return：停止当前方法，将后面带着的数据还给调用处
 * 返回值必须和前面定义返回值类型的一样
 */
public class Demo02MethodDefine {
	public static void main(String[] args) {
		// 单独调用
		rect(5, 20); // 通常用于没有返回值的函数

		// 打印调用
		System.out.println(sum(5, 20)); // 25

		// 赋值调用
		int result = sum(5, 20);
		System.out.println(result); // 25
	}

	// 无返回值，生成一个矩形
	private static void rect(int x, int y) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <y; j++) {
				System.out.print("*"); // 不换行输出
			}
			System.out.println(); // 换行
		}
	}

	// 有返回值，返回两个数相加
	private static int sum(int a, int b) {
		int result = a + b;
		return result;
		// 或者：直接return a + b;
	}
}