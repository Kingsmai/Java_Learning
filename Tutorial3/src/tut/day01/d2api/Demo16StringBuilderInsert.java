package tut.day01.d2api;

/*
 * 在StringBuilder字符串之间插入数据
 * StringBuilder中的insert方法
 */
public class Demo16StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder("Hello World!");
		System.out.println(str1); // Hello World!
		str1.insert(5, " Java");
		System.out.println(str1); // Hello Java World!
	}
}
