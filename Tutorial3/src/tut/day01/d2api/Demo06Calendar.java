package tut.day01.d2api;

import java.util.Calendar;

/*
 * java.util.Calandar类：日历类
 * Calandar类是抽象类，里面提供了很多日历操作的方法（YEAR, MONTH, DAY_OF_MONTH, HOUR）
 * Calandar类无法直接创建对象使用，里边有一个静态方法叫getInstance()，该方法返回了Calandar类的子类对象
 * static Calandar getInstance() 使用默认时区和语言环境获得一个日历
 * 
 * 成员方法：
 * 	public int get(int field) 返回给定日历字段的值
 * 	public void set(int field, int value) 将给定的日历字段设置为给定值
 * 	public abstract void add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量
 * 	public Date getTime() 返回一个Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
 * 成员方法参数：
 * 	int field 日历类的字段，可以使用Calendar类的静态成员变量获取
 * 		public static final int YEAR = 1; 	// 年
 * 		public static final int MONTH = 2; 	// 月
 * 		public static final int DATE = 5; 	// 日
 * 		public static final int DAY_OF_MONTH = 5;	// 日
 * 		public static final int HOUR = 10;	// 时
 * 		public static final int MINUTE = 12;	// 分
 * 		public static final int SECOND = 13;	// 秒
 * 		public static final int AM_PM = 9;	// AM或PM
 */
public class Demo06Calendar {

	public static void main(String[] args) {
		// 使用getInstance获取Calander对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
	}
}
