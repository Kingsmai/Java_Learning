package advanced.demo02apis;

import java.util.Calendar;
import java.util.Date;

public class Demo10CalendarGetTime {

	public static void main(String[] args) {
		// 使用getInstance获取Calander对象
		Calendar calendar = Calendar.getInstance();

		/*
		 * public Date getTime() 返回一个Calendar时间值（从历元到现在的毫秒偏移量）的Date对象
		 * 把日历对象转换为日期对象
		 */
		calendar = Calendar.getInstance(); // 获取当前日历戳
		Date time = calendar.getTime();
		System.out.println(time); // Thu Sep 03 13:29:37 SGT 2020
	}
}
