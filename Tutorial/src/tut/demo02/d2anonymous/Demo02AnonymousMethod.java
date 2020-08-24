package tut.demo02.d2anonymous;

import java.util.Scanner;

public class Demo02AnonymousMethod {
	public static void main(String[] args) {
		// 普通使用方式
		System.out.println("请输入一个数字");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		System.out.println("输入的是：" + num1);
		
		// 匿名对象方式
		System.out.println("请输入一个数字");
		int num2 = new Scanner(System.in).nextInt();
		System.out.println("输入的是：" + num2);
		
		// 使用一般写法传入参数
		System.out.println("请输入一个数字");
		Scanner sc2 = new Scanner(System.in);
		methodParam(sc2);
		
		// 使用匿名对象进行传参
		System.out.println("请输入一个数字");
		methodParam(new Scanner(System.in));
		
		// 匿名对象返回
		Scanner sc3 = methodReturn();
		System.out.println("请输入一个数字");
		int num3 = sc3.nextInt();
		System.out.println("输入的是：" + num3);
	}
	
	// 匿名对象传参
	public static void methodParam(Scanner sc) {
		int num = sc.nextInt();
		System.out.println("输入的是：" + num);
	}
	
	// 匿名对象返回
	public static Scanner methodReturn() {
		// 一般方法
//		Scanner sc = new Scanner(System.in);
//		return sc;
		
		return new Scanner(System.in);
	}
}
