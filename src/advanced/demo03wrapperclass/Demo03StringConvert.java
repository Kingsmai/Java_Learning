package advanced.demo03wrapperclass;

/*
 * 基本类型与字符串类型之间的相互转?
 * 基本类型 -> 字符? (String)
 * 1. 基本类型的?? + ""，这是最?单的方法（工作中常用?
 * 2. 包装类的静?方法toString(param)
 * 3. String类的静?方法valueOf(param)
 *     static String valueOf?(int i) 返回 int参数的字符串表示形式?
 * 字符? (String) -> 基本类型
 * 1. 使用包装类的静?方法parseXXX("字符?");
 *     Integer类：static int parseInt(String str)
 *     Double类：static double parseDouble(String str)
 *     ...
 */
public class Demo03StringConvert {

	public static void main(String[] args) {
		/*
		 *  基本类型 -> 字符? (String)
		 */
		// 基本类型的?? + ""，这是最?单的方法（工作中常用?
		int i1 = 100;
		String s1 = i1 + "";
		System.out.println(s1 + 200); // 100200，字符串相加

		// 包装类的静?方法toString(param)
		String s2 = Integer.toString(300);
		System.out.println(s2 + 400); // 300400

		// String类的静?方法valueOf(param)
		String s3 = String.valueOf(500);
		System.out.println(s3 + 600); // 500600

		/*
		 * 字符? (String) -> 基本类型
		 */
		// 使用包装类的静?方法parseXXX("string");
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1); // true
		int i2 = Integer.parseInt(s1);
		System.out.println(i2 - 10); // 90

		// 如果转换的数据类型和包装类不同的话（如字符串用parseInt方式）就会报?
//		int i3 = Integer.parseInt("a"); // java.lang.NumberFormatException
		// 右边返回的数据类型必须和左边的一?
//		int i4 = Boolean.parseBoolean("true"); // 编译器直接报?
	}
}
