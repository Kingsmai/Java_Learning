package basic.demo12string;
/*
 * String 当中，与转换相关的方法：
 * 
 * public char[] toCharArray(); 将当前字符串拆分为字符数组作为返回值
 * public byte[] getBytes(); 获得字符串底层的字节数组
 * public String replace(CharSequence oldString, CharSequence newString);
 * 将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串
 * 
 * 备注：CharSequence意思就是说可以接收字符串类型
 */
public class Demo06StringConvert {
	public static void main(String[] args) {
		// 转换成为字符数组
		char[] chars = "Hello".toCharArray();
		System.out.println(chars[0]); // H
		System.out.println(chars.length); // 5
		System.out.println("==============");
		
		// 转换成为字节数组
		byte[] bytes = "World".getBytes();
		System.out.println(bytes[0]); // 87
		System.out.println(bytes.length); // 5
		System.out.println("==============");
		
		// 字符串的内容替换
		String str1 = "How do you do?";
		String str2 = str1.replace("o", "*");
		System.out.println(str1); // How do you do?
		System.out.println(str2); // H*w d* y*u d*?
		
		// 实列：游戏敏感词过滤
		String lang1 = "会不会玩啊？你大爷的！";
		String lang2 = lang1.replace("你大爷的", "****");
		System.out.println(lang2); // 会不会玩啊？****！
	}
}
