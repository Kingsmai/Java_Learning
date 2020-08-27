package tut.demo02.d5string;
/*
 * String当中与获取相关的常用方法
 * 
 * public int length(); // 获取字符串当中含有的字符个数，拿到字符串长度
 * public String concat(); // 将当前字符串和参数字符串拼接成为返回值新的字符串
 * public char charAt(int index); // 获取指定索引位置的单个字符，（索引从0开始）
 * public int indexOf(String str); // 查找参数字符串在本字符串当中首次出现的索引位置，如果没有，返回-1值
 */
public class Demo04StringGet {
	public static void main(String[] args) {
		// 获取字符串的长度
		String str = "First, solve the problem. Then, write the code.";
		System.out.println("字符串的长度：" + str.length()); // 47
		
		int len = "Programs must be written for people to read, and only incidentally for machines to execute.".length();
		System.out.println("字符串的长度：" + len); // 91
		System.out.println("===============");
		
		// 拼接字符串
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1.concat(str2);
		System.out.println(str1); // Hello，原封不动
		System.out.println(str2); // World，原封不动
		System.out.println(str3); // HelloWorld，新的字符串
		String str4 = str1 + str2;
		System.out.println(str4); // HelloWorld
		System.out.println(str4 == str3); // false
		System.out.println(str4.equals(str3)); // true
		System.out.println("===============");
		
		// 获取指定位置索引的单个字符
		char ch = "Java".charAt(1);
		System.out.println("在1号索引位置的字符是：" + ch); // a
		System.out.println("===============");
		
		// 查找参数字符串在本来字符串当中出现第一次的索引位置
		// 如果根本没有，返回值 -1
		String original = "Hello World Hello World";
		int index = original.indexOf("llo");
		System.out.println("第一次索引值是：" + index); // 2
		
		System.out.println("Hello World".indexOf("Java")); // -1
	}
}
