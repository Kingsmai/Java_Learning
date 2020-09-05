package tut.d2api.frequent;

import java.util.Date;

/*
 * java.util.Date：表示日期和时间的类
 * Date表示特定的瞬间，精确到毫秒
 * 毫秒：千分之一秒 1000ms = 1s
 * 特定的瞬间：一个时间点，一刹那
 * 2077-11-19 09:55:33:246 瞬间
 * 
 * 毫秒值的作用：可以对时间或日期进行计算
 * 将日期或事件转换为毫秒，计算完毕，再把毫秒转换为时间
 * 
 * 将日期转换为毫秒：
 * 	时间原点 (0ms): 1970年1月1日 00:00:00 (GMT + 0)
 * 就是计算当前日期到时间原点之间一共经历了多少毫秒
 * 
 * 中国是东八区（GMT +8）:
 * 1970年1月1日 08:00:00
 * 
 * 把毫秒转换为日期：
 * 1day = 24 * 60 * 60 * 1000 = 86400000ms
 */
public class Demo04Date {

	public static void main(String[] args) {
		// 获取当前系统时间到时间原点之间的毫秒
		System.out.println(System.currentTimeMillis()); // 1599046476688
		
		Date d1 = new Date();
		System.out.println(d1); // Wed Sep 02 19:50:22 SGT 2020
		// SGT 表示：新加坡标准时间
		// CST 表示：北京时间
		
		Date d2 = new Date(0L); // 毫秒值是long类型，要有L
		Date d3 = new Date(1599046476688L);
		System.out.println(d3); // Wed Sep 02 19:34:36 SGT 2020
		System.out.println(d2); // Thu Jan 01 07:30:00 SGT 1970（时间原点）
		
		// long getTime() 把日期转换为毫秒值，相等于：System.currentTimeMillis()方法
		Date d4 = new Date();
		System.out.println(d4.getTime()); // 1599048198739
	}
	
}
