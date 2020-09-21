package tut.day05.d1exception;

/*
 * 如果finally有return语句，永远返回finally结果，避免该情况
 */
public class Demo09ExceptionNotice {

	public static void main(String[] args) {
		int a = getA();
		System.out.println(a); // 100
	}
	
	/*
	 * 定义一个方法，返回变量a的值
	 */
	@SuppressWarnings("finally")
	public static int getA() {
		int a = 10;
		try {
			return a;
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// 一定会执行的代码
			// 最好不要在finally里写return
			a = 100;
			return a;
		}
	}
}
