package tut.day04.d3debug;

/*
 * Debug调试程序：
 *     可以让代码逐行执行，查看代码执行的过程，调试程序中出现的bug
 * 使用方式：
 *     （eclipse）
 *     在行号的右边双击两次鼠标左键，添加断点
 *     位置：
 *         初学者：加在每个方法的第一行
 *         老鸟：哪里出Bug加在哪里
 *     右键，找到Debug As，Java Application、或者上方找到虫型图标
 *     程序就会停留在添加的第一个断点处
 * 执行程序：
 *     （eclipse）
 *     Resume (F8): 跳到下一个断点，如果没有下一个断点，就结束程序
 *     Suspend: 暂停程序
 *     Terminate (Ctrl + F2): 退出Debug模式，停止程序运行
 *     Step Into (F5): 进入到方法中
 *     Step Over (F6): 逐行执行程序
 *     Step Return (F7): 跳出方法
 * Eclipse笔记：右上角有个模式切换，可以切换成Debug视图或者Java开发视图
 */
public class Demo01Debug {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println(sum);
	}
}
