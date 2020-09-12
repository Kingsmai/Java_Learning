package tut.day01.d2api;

/*
 * java.lang.StringBuilder 字符串缓冲区，可以提高字符串的操作效�?
 * StringBuilder() 构�?�一个字符串构建器，其中不包含任何字符，初始容量�?16个字符�??
 * StringBuilder�?(String str) 构�?�一个初始化为指定字符串内容的字符串构建器�??
 */
public class Demo13StringBuilder {

	public static void main(String[] args) {
		// 无参构�?�方�?
		StringBuilder strBu1 = new StringBuilder();
		System.out.println("strBu1: " + strBu1); // 空的，strBu1: 
		
		// 有参构�?�方�?
		StringBuilder strBu2 = new StringBuilder("abc");
		System.out.println("strBu2: " + strBu2); // strBu2: abc
	}
}
