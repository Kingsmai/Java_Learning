package basic.demo12string;
/*
 * == 是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：
 * 
 * public boolean equals(Object obj); // 参数可以是任何对象，只有参数是字符串并且内容相同才会返回true，否则false
 * 注意事项：
 * 1. 任何对象都能用Object进行接收
 * 2. equals方法具有对称性，a.equals(b)和b.equals(a)效果一样
 * 3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面
 * 推荐： "abc".equals(str)	不推荐： str.equals("abc")
 * 
 * public boolean equalsIgnoreCase(String str); // 忽略大小写进行内容的比较
 */
public class Demo03StringEquals {	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(charArray);
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str2.equals(str3)); // true
		System.out.println(str3.equals("Hello")); // true
		System.out.println("Hello".equals(str1)); // true
		
		String str4 = "hello";
		System.out.println(str1.equals(str4)); // false
		System.out.println("===========");
		
		String str5 = "abc";
		System.out.println("abc".equals(str5)); // 推荐
		System.out.println(str5.equals("abc")); // 不推荐
		String str6 = null;
		System.out.println("abc".equals(str6)); // false
//		System.out.println(str6.equals("abc")); // 报错，空指针异常
		System.out.println("===========");
		
		String strA = "Java";
		String strB = "java";
		System.out.println(strA.equals(strB)); // false
		System.out.println(strA.equalsIgnoreCase(strB)); // true
		
		// 只有英文区分大小写，其他不区分大小写
		System.out.println("abc一123".equals("abc壹123")); // false
	}
}
