package basic.demo02method;

public class Practice01Method {
	public static void main(String[] args) {
		System.out.println(isSame(10, 20)); // false
		System.out.println(isSame(20, 20)); // true
		System.out.println(getSum()); // 5050
		printCount(5);
	}

	// 判断两个值是否一样
	private static boolean isSame(int a, int b) {
		// TODO Auto-generated method stub

//		boolean same;
//		if (a == b) {
//			same = true;
//		} else {
//			same = false;
//		}

//		boolean same = a == b ? true : false;

//		boolean same = a == b;

//		return same;

		return a == b;
	}

	// 计算1到100的和
	private static int getSum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// 打印指定次数
	private static void printCount(int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.println("Hello World" + (i + 1));
//		}
		int i = 0;
		while (i < count) {
			System.out.println("Hello World" + ++i);
		}
	}
}