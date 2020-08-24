package tut.demo02.d1scanner;

import java.util.Scanner; // 1. 导包

/*
 * Scanner类的功能：
 * 可以实现键盘输入数据，到程序当中
 * 
 * 引用类型的一般使用步骤：
 * 1. 导包
 * import 包路径.类名称;
 * 如果使用的类在同一目录下，可以省略导包语句
 * 只有java.lang下的内容（如String）不需要导包，其他的包都需要import语句
 * 
 * 2. 创建
 * 类名称 对象名 = new 类名称();
 * 
 * 3. 使用
 * 对象名.成员方法名();
 */
public class Demo01Scanner {
	 public static void main(String[] args) {
		 // 2. 创建
		 Scanner sc = new Scanner(System.in); // System.in代表从键盘进行输入
		 
		 // 3. 获取键盘输入的一个int数字
		 int num = sc.nextInt(); // 控制台输入了之后回车
		 
		 // 3. 获取键盘输入的一个字符串
		 String str = sc.next(); // 同上
		 
		 System.out.println("输入的int数字是：" + num);
		 System.out.println("输入的字符串是：" + str);
	}
}
