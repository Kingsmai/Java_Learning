package tut.d2api.frequent;

import java.util.Calendar;

public class Demo09CalendarAdd {

	public static void main(String[] args) {
		// 使用getInstance获取Calander对象
		Calendar calendar = Calendar.getInstance();

		/*
		 * public abstract void add(int field, int amount) 根据日历的规则，为给定的日历字段添加或减去指定的时间量
		 * 把指定的字段增加、减少指定的值
		 * 参数：
		 * int field: 传递指定的日历字段(YEAR, MONTH, ...) 
		 * int amount: 增加减少指定的值（分正负数）
		 */
		calendar.add(Calendar.YEAR, 2);
		System.out.println(calendar.get(Calendar.YEAR)); // 20
		calendar.add(Calendar.MONTH, -3); // 运算结果是负数的话会减去年份
		System.out.println(calendar.get(Calendar.MONTH)); // 8
	}
}
