package tut.demo02.d3random;

import java.util.Random;

/*
 * 根据int变量n的值，来获取随机数字，范围是 [1,n]
 * 
 * 思路：
 * 1. 定义一个int变量n，随机赋值
 * 2. 要使用Random，三个步骤：导包、创建、使用
 * 3. 如果写10，那么就是 0~9，然而想要的是 1~10，可以发现：整体 +1 即可
 * 4. 打印随机数字 
 */
public class Practise01Random1toN {
	public static void main(String[] args) {
		int n = 5;
		Random r = new Random();
		int result = r.nextInt(n) + 1; // 本来范围是 [0,n), 整体 +1 之后变成 [1,n+1),也就是[1,n]
		System.out.println(result);
	}
}
