package tut.demo02.d6arrays;

import java.util.Arrays;
import java.util.Random;

/*
 * 请使用`Arrays` 相关的API，将一个字符串中的所有字符升序排列，并倒序打印。
 */
public class Practise01ArraysSort {
	public static void main(String[] args) {
		Random rnd = new Random();
		// 保存所要生成的字符池 [a-z][A-Z][0-9]
		String strPool = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		// 打散字符池为独立数组
		char[] charPool = strPool.toCharArray();
		// 做个字符数组，用于保存随机字符
		char[] charArray = new char[30];
		// 随机生成字符串
		for (int i = 0; i < charArray.length; i++) {
			// 随机字符池里的字符，赋值给字符数组
			charArray[i] = charPool[rnd.nextInt(charPool.length)];
		}
		// 将随机字符数组转变为字符串（此时是乱序的）
		String str = new String(charArray);
		System.out.println("随机字符串：" + str);
		// 将随机字符串升序排列
		Arrays.sort(charArray);
		// 将已排序好的字符数组转变为字符串
		str = new String(charArray);
		System.out.println("升序字符串：" + str);	
		System.out.print("倒序字符串：");
		// 倒叙遍历随机字符数组，并输出
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
}
