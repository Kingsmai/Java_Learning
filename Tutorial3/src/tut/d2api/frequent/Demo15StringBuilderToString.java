package tut.d2api.frequent;

/*
 * StringBuilder和String可以相互转换：
 * String -> StringBuilder: 使用StringBuilder构造方法
 *     StringBuilder(String str) 构造一个初始化为指定字符串内容的字符串构建器。
 * StringBuilder -> String: 使用StringBuilder中的toString方法
 *     public String toString() 将当前StringBuilder对象转换为String对象。
 */
public class Demo15StringBuilderToString {

	public static void main(String[] args) {
		// String -> StringBuilder
		String str1 = "Hello";
		System.out.println("str1: " + str1); // str1: Hello
		StringBuilder str2 = new StringBuilder(str1);
		System.out.println("str2: " + str2); // str2: Hello
		
		// 往StringBuilder中添加数据
		str2.append(", World!");
		System.out.println("str2: " + str2); // str2: Hello, World!
		// StringBuilder -> String
		String str3 = str2.toString();
		System.out.println("str3: " + str3); // str3: Hello, World!
	}
}
