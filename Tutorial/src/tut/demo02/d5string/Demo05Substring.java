package tut.demo02.d5string;
/*
 * 字符串的截取方法：
 * 
 * public String substring(int index); // 从参数位置，一直到字符串末尾，返回字符串
 * public String substring(int begin, int end); // 从begin开始，一直到end结束，中间的字符串
 * 注意事项：
 * 1. [begin, end) 包含左边，不包含右边
 * 2. substring是小写的，这是完整的一个单词，子字符串
 */
public class Demo05Substring {
	public static void main(String[] args) {
		String str1 = "HelloWorld";
		String str2 = str1.substring(5);
		System.out.println("str1: " + str1); // HelloWorld，原封不动
		System.out.println("str2: " + str2); // World，新字符串
		System.out.println("==========");
		
		String str3 = str1.substring(4, 7);
		System.out.println("str3: " + str3); // oWo
		System.out.println("==========");
		
		/*
		 * 下面这种写法，字符串的内容仍然是没有改变
		 * 下面有两个字符串， "Hello", "Java"
		 * strA当中保存的是地址值
		 * 本来地址值是 Hello 的 0x666
		 * 后来地址值变成了 Java 的 0x999 
		 */
		String strA = "Hello";
		System.out.println(strA); // Hello
		strA = "Java";
		System.out.println(strA); // Java
	}
}
