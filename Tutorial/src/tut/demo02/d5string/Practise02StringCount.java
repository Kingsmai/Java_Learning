package tut.demo02.d5string;

import java.util.Scanner;

/*
 * 键盘录入一个字符，统计字符串中大小写字母及数字字符个数
 * 种类：大写字母，小写字母，数字，其他符号
 * 
 * 思路：
 * 1. 既然用到键盘输入，肯定需要Scanner
 * 2. 键盘输入的是字符串，String str = sc.next();
 * 3. 定义四个变量，分别代表四种字符各自的出现次数
 * 4. 需要对字符串一个字一个字进行检擦，String -> char[]，toCharArray()
 * 5. 遍历char[]字符数组，对当前字符的种类进行判断，并且用四个变量进行++动作
 * 6. 打印输出四个变量，分别代表四种字符出现次数
 */
public class Practise02StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String input = sc.next(); // 获取键盘输入的一个字符串
		int countUpper = 0; // 大写
		int countLower = 0; // 小写
		int countNumber = 0; // 数字
		int countOther = 0; // 其他
		
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i]; // 当前单个字符
			if (ch >= 'A' && ch <= 'Z' ) {
				countUpper++;
			} else if (ch >= 'a' && ch <= 'z') {
				countLower++;
			} else if (ch >= '0' && ch <= '9') {
				countNumber++;
			} else {
				countOther++;
			}
		}
		System.out.println("大写字母有：" + countUpper);
		System.out.println("小写字母有：" + countLower);
		System.out.println("数字有：" + countNumber);
		System.out.println("其他符号有：" + countOther);
		sc.close();
	}
}
