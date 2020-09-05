package tut.d2api.frequent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 使用日期相关的API，计算出一个人已经出生多少天
 * 分析：
 * 1. 使用Scanner类中的next方法，获取出生日期
 * 2. 使用DateFormat中的parse方法，将字符串解析为Date日期
 * 3. 把Date格式的出生日期转换为毫秒值
 * 4. 将当前日期转换为毫秒值
 * 5. 使用当前日期毫秒值 - 出生日期毫秒值
 * 6. 把毫秒值的差值转换为天(ms / 1000 / 60 / 60 / 24)
 */
public class Practise01CalcBirth {

	public static void main(String[] args) throws ParseException {
//		// 1. 使用Scanner类中的next方法，获取出生日期
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入您的出生日期，格式为：yyyy-mm-dd");
//		String birthday = sc.next();
//		// 2. 使用DateFormat中的parse方法，将字符串解析为Date日期
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//		Date birth = sdf.parse(birthday);
//		// 3. 把Date格式的出生日期转换为毫秒值
//		long birthTime = birth.getTime();
//		// 4. 将当前日期转换为毫秒值
//		Date today = new Date();
//		long currentTime = today.getTime();
//		// 5. 使用当前日期毫秒值 - 出生日期毫秒值
//		long time = currentTime - birthTime;
//		// 6. 把毫秒值的差值转换为天(ms / 1000 / 60 / 60 / 24)
//		int day = (int) (time / 1000 / 60 / 60 / 24);
//		System.out.println(day);
		
		// 优化！！
		System.out.println("请输入您的出生日期，格式为：yyyy-mm-dd");
		String birthString = new Scanner(System.in).next();
		Date birthDate = new SimpleDateFormat("yyyy-mm-dd").parse(birthString);
		long birthTime = birthDate.getTime();
		long todayTime = new Date().getTime();
		long time = todayTime - birthTime;
		int day = (int) (time / 100 / 60 / 60 / 24);
		System.out.println(day);
	}
}
