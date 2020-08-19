package tut.demo.d1method;
/*
 * Eclipse 的中文注释逼死强迫症！！！
 * 看看这个 * 号！！！
 * 版本是 Eclipse 2020-06
 */
public class Demo01Method {
	public static void main(String[] args) {
		Rect(); // 调用方法
	}
	
	// 输出矩形函数
	private static void Rect() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <20; j++) {
				System.out.print("*"); // 不换行输出
			}
			System.out.println(); // 换行
		}		
	}
}
