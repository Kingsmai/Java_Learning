package tut.d1api.frequent;

import java.util.Calendar;

public class Demo08CalendarSet {

	public static void main(String[] args) {
		// 使用getInstance获取Calander对象
		Calendar calendar = Calendar.getInstance();
		
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
	}
}
