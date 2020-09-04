package tut.d1api.frequent;

import java.util.Calendar;

public class Demo07CalendarGet {

	public static void main(String[] args) {
		// 使用getInstance获取Calander对象
		Calendar calendar = Calendar.getInstance();
		
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
	}
}
