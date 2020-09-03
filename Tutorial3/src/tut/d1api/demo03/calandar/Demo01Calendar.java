package tut.d1api.demo03.calandar;

import java.util.Calendar;
import java.util.Date;

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
public class Demo01Calendar {

	public static void main(String[] args) {
		// 使用getInstance获取Calander对象
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		/*
		 * public int get(int field) 返回给定日历字段的值
		 * 参数：
		 * 	int field: 传递指定的日历字段(YEAR, MONTH, ...)
		 * 返回值：日历字段代表具体的值
		 */
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year); // 2020
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month); // 8 (+1 九月，Java中一月 = 0)
		int date = calendar.get(Calendar.DATE);
		System.out.println(date); // 3
		int hour = calendar.get(Calendar.HOUR);
		System.out.println(hour); // 1
		int minute = calendar.get(Calendar.MINUTE);
		System.out.println(minute); // 0
		int second = calendar.get(Calendar.SECOND);
		System.out.println(second); // 47
		int ampm = calendar.get(Calendar.AM_PM);
		System.out.println(ampm); // 1 (PM)
		System.out.println("=================");
		
		/*
		 * public void set(int field, int value) 将给定的日历字段设置为给定值
		 * 参数：
		 * 	int field: 传递指定的日历字段(YEAR, MONTH, ...)
		 * 	int value: 给指定字段设置的值
		 */
		calendar.set(Calendar.YEAR, 2018);
		System.out.println(calendar.get(Calendar.YEAR)); // 2018
		calendar.set(Calendar.MONTH, 4);
		System.out.println(calendar.get(Calendar.MONTH)); // 4
		calendar.set(Calendar.DATE, 16);
		System.out.println(calendar.get(Calendar.DATE)); // 16
		System.out.println("=================");
		
		// 同时设置年月日可以使用set的重载方法
		calendar.set(2077, 10, 19);
		System.out.println(calendar.get(Calendar.YEAR)); // 2077
		System.out.println(calendar.get(Calendar.MONTH)); // 10
		System.out.println(calendar.get(Calendar.DATE)); // 19
		System.out.println("=================");
		
		// 同时设置年月日时分秒可以使用set的重载方法
		calendar.set(2019, 11, 12, 6, 33, 28);
		System.out.println(calendar.get(Calendar.YEAR)); // 2019
		System.out.println(calendar.get(Calendar.MONTH)); // 11
		System.out.println(calendar.get(Calendar.DATE)); // 12
		System.out.println(calendar.get(Calendar.HOUR)); // 6
		System.out.println(calendar.get(Calendar.MINUTE)); // 33
		System.out.println(calendar.get(Calendar.SECOND)); // 28
		System.out.println(calendar.get(Calendar.AM_PM)); // 0 早上
		System.out.println("=================");
		
		/*
		 * public abstract void add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量
		 * 把指定的字段增加、减少指定的值
		 * 参数：
		 * 	int field: 传递指定的日历字段(YEAR, MONTH, ...)
		 * 	int amount: 增加减少指定的值（分正负数）
		 */
		calendar.add(Calendar.YEAR,	2);
		System.out.println(calendar.get(Calendar.YEAR)); // 20
		calendar.add(Calendar.MONTH, -3); // 运算结果是负数的话会减去年份
		System.out.println(calendar.get(Calendar.MONTH)); // 8
		System.out.println("=================");
		
		/*
		 * public Date getTime() 返回一个Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
		 * 把日历对象转换为日期对象
		 */
		calendar = Calendar.getInstance(); // 获取当前日历戳
		Date time = calendar.getTime();
		System.out.println(time); // Thu Sep 03 13:29:37 SGT 2020
	}
}
