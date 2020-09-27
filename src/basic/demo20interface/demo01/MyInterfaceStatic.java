package basic.demo20interface.demo01;

/*
 * 从Java8开始，接口当中允许定义静态方法
 * 格式：
 * public static void 方法名称(参数列表) {
 *     // 方法体
 * }
 * 提示：就是将abstract活着default换成static即可，带上方法体
 */
public interface MyInterfaceStatic {

	public static void methodStatic() {
		System.out.println("这是接口的静态方法");
	}
	
	static void methodStatic2() {
		System.out.println("public 修饰符可以被省略");
	}
}
