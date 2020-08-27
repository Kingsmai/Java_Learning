package tut.demo02.d5string;
/*
 * java.lang.String类代表字符串
 * API 文档：All string literals in Java programs, such as "abc", are implemented as instances of this class.
 * 翻译：Java 程序中的所有字符串字面值，如"abc"，都作为此类的示例实现
 * 其实就是程序当中所有双引号的字符串，都是String类的对象。（就算没有new，照样是String类的对象）
 * 
 * String的特点：
 * 1. 字符串的内容永不可变【重点】
 * 2. 正是因为字符串不可改变，所以字符串是可以共享使用的
 * 3. 字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组
 * 
 * 创建字符串的常见 3+1 种方式
 * 三种构造方法
 * public String (); // 创建一个空白字符串，不含有任何内容
 * public String (char[] array); // 根据字符数组的内容，来创建对应的字符串
 * public String (byte[] array); // 根据字节数组的内容，来创建对应的字符串
 * 一种直接创建
 * String str = "World"; // 右边直接用双引号
 * 
 * 注意：直接写上双引号，就是字符串对象
 */
public class Demo01String {
	public static void main(String[] args) {
		// 使用空参构造
		String str1 = new String(); // 小括号留空，说明字符串什么内容都没有
		System.out.println("第一个字符串：" + str1); // 第一个字符串：
		
		// 根据字符数组创建字符串
		char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		String str2 = new String(charArray);
		System.out.println("第二个字符串：" + str2); // 第二个字符串：Hello
		
		// 根据字节数组创建字符串
		byte[] byteArray = {74, 97, 118, 97}; // 字符的ASCII码
		String str3 = new String(byteArray);
		System.out.println("第三个字符串：" + str3); // 第三个字符串：Java
		
		// 直接创建
		String str4 = "World";
		System.out.println("第四个字符串：" + str4); // 第四个字符串：World
	}
}
