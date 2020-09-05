package tut.d2api.frequent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.text.DateFormat 是日期、时间格式化子类的抽象类
 * 作用：
 * 	格式化（日期 -> 文本）、解析（文本 -> 日期）
 * 成员方法：
 *  String format(Date date) 按照指定的格式，把Date日期格式化为符合模式的字符串
 *  Date parse(String source) 把符合模式的字符串，解析为Date日期
 * DateFormat类是个抽象类，无法直接创建对象使用，可以用DateFormat类的子类
 * 
 * java.text.SimpleDateFormat extends DateFormat
 * 
 * 构造方法：
 * SimpleDateFormat(String pattern)
 * 	用给定的模式和默认语言环境的日期格式符号构造 SimpleDataFormat
 * 参数：
 * String pattern：传递指定的模式
 * 模式：区分大小写
 * y	年
 * M	月
 * d	日
 * H	时
 * m	分
 * s	秒
 * 写对应的模式，会把模式替换为对应的时间
 * "yyyy-MM-dd HH:mm:ss"
 * 注意：模式中的字母不可以改；连接模式的字符可以改
 */
public class Demo05DateFormat {

	public static void main(String[] args) throws ParseException {
		/*
		 * 使用DateFormat中的方法format，把日期格式化为文本
		 * 使用步骤：
		 * 1. 创建SimpleDataFormat对象，构造方法中传递指定的模式
		 * 2. 调用SimpleDataFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Date d1 = new Date(); // 创建当前时间对象
		String format1 = sdf1.format(d1); // 将Date对象转换为格式化字符串
		System.out.println(d1); // Thu Sep 03 01:31:37 SGT 2020
		System.out.println(format1); // 2020年09月03日 01时31分37秒
		
		/*
		 * 使用DateFormat中的方法parse，把文本解析为日期
		 * 使用步骤：
		 * 1. 创建SimpleDataFormat对象，构造方法中传递指定的模式
		 * 2. 调用SimpleDataFormat对象中的方法parse，把符合构造方法中的字符串，解析为日期
		 * 注意事项：
		 * 	public Date parse(String source) throws ParseException
		 * 	parse方法声明了一个异常ParseException
		 * 	如果字符串和构造方法的格式不一样，那么程序就会抛出异常
		 * 	调用一个抛出了异常的方法，就必须处理这个异常
		 * 	要么throws继续抛出这个异常，要么try catch自己处理
		 */
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Date d2 = sdf2.parse("2020年09月04日 11时08分33秒");
		System.out.println(d2); // Fri Sep 04 11:08:33 SGT 2020
		d2 = sdf2.parse("2077-11-19 09:55:33"); // 如果parse的格式和前面定义的不一样的话，报错：java.text.ParseException
	}
}
