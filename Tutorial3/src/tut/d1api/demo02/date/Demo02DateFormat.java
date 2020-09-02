package tut.d1api.demo02.date;

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
public class Demo02DateFormat {

}
