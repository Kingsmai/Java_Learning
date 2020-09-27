package basic.demo10random;

import java.util.Random; // 1. 导包

/*
 * Random类用来生成随机数字，使用起来也是三个步骤
 * 
 * 1. 导包
 * import java.util.Random;
 * 
 * 2. 创建
 * Random r = new Random();
 * 
 * 3. 使用
 */
public class Demo01Random {
	public static void main(String[] args) {
		// 2. 创建
		Random r = new Random();
		// 3. 生成一个随机整数（范围是int所有范围，有正负）：nextInt()
		int num1 = r.nextInt();
		System.out.println("生成的数字是：" + num1);
		
		// 3. 生成一个随机整数（参数代表了范围，左闭右开区间）：nextInt(3);
		// 实际上代表的是[0, 3), 也就是0 ~ 2
		int num2 = r.nextInt(3);
		System.out.println("生成的数字是：" + num2);
		
		// 3. 随机生成100个数（使用匿名对象）：
		for (int i = 0; i < 100; i++) {
			System.out.println(r.nextInt(10)); // 范围：0 ~ 9
		}
	}
}
