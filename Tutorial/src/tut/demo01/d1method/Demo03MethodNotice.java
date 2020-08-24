package tut.demo01.d1method;

/*
 * 使用方法的注意事项：
 * 1. 方法应定义在类当中，但是不能在方法当中再定义方法
 * 2. 方法定义的前后顺序无所谓
 * 3. 方法定义后不会自动执行，需要调用：
 * 3.1. 单独调用
 * 3.2. 打印调用
 * 3.3. 赋值调用
 * 4. 如果方法有返回值，必须写上“return 返回值;”，不能没有
 * 5. return 后的返回值数据，必须和定义方法时的返回值类型对应。
 * 6. void 返回类型，return 不能带有数据，只能return;
 * 7. void 返回类型最后一行的return可以省略
 * 8. 一个方法当中可以有多个return语句，但是同时只能有一个能被执行到
 */
public class Demo03MethodNotice {
	public static void main(String[] args) {
		method();
		method2();
	}
	private static void method() {
//		return 10; // 错误的写法（函数返回值为）
		System.out.println("Hello World");
		return; // 没有返回值，执行方法而已
	}
	
	private static void method2() {
		System.out.println("函数无返回值，省略return");
//		return; // 最后一行return可以省略
	}
	
	public static int getMax(int a, int b) {
//		int max;
//		if (a > b) {
//			max = a;
//		} else {
//			max = b;
//		}
		// 二者选其一
		if (a > b) {
			return a; // 只有一个return会被执行到
		} else {
			return b;
		}
	}
}
