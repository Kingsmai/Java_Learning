package basic.demo10random;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏
 * 
 * 思路：
 * 1. 首选需要产生一个随机数字，一旦产生，不再变化，用Random的nextInt方法
 * 2. 需要键盘输入，所以用到了Scanner
 * 3. 获取键盘输入的数字，用Scanner当中的nextInt方法
 * 4. 已经得到两个数字，判断（if）
 * 4.1. 如果太大了，提示太大，并且重试
 * 4.2. 如果太小了，提示太小，并且重试
 * 4.3. 如果猜中了，游戏结束
 * 5. 重试就是再来一次，循环次数不确定，用while(true)
 */
public class Practise02RandomGame {
	public static void main(String[] args) {
		Random r = new Random();
		int answer = r.nextInt(100) + 1; // 生成一个随机数 [1, 100]
		System.out.println("请输入一个数字：");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int input = sc.nextInt();
			if (input > answer) {
				System.out.println("太大了，再试一次：");
			} else if (input < answer) {
				System.out.println("太小了，再试一次：");
			} else {
				System.out.println("猜中了：" + answer + "，游戏结束");
				break;
			}
		}
		sc.close();
	}
}
