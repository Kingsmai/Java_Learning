package advanced2.demo01exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.Throwable类是Java语言中所有错误或异常的超类
 *     Exception：编译期异常，进行编译（写代码）Java程序出现的问题
 *         RuntimeException：运行期异常，Java程序运行过程中出现的问题
 *         异常就相当于程序得了一个小毛病（感冒，发烧），把异常处理掉（吃药），程序可以继续执行
 *     Error：错误
 *         错误就相当于程序得了一个无法治愈的毛病（非典，艾滋），必须修改源代码，程序才能继续执行
 */
public class Demo01Exception {

	@SuppressWarnings("unused")
	public static void main(String[] args) /* throws ParseException */ {
		// Exception：编译期异常，进行编译（写代码）Java程序出现的问题
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		try {
			date = sdf.parse("2020-0918");
		} catch (ParseException e) {
			e.printStackTrace(); // 这句是输出异常
			System.out.println("发生了异常");
		}
		System.out.println(date);
		System.out.println("后续代码");

		// RuntimeException：运行期异常，Java程序运行过程中出现的问题
		int[] arr = new int[] { 1, 2, 3 };
		System.out.println(arr[0]);
		try {
			// 可能会出现异常的代码
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException 索引越界异常
		} catch (Exception e) {
			// 异常的处理逻辑
//			e.printStackTrace();
			System.out.println(e);
		}

		// Error：错误
		// 例：内存溢出错误（创建的数组太大了，超出了给JVM分配的内存）
//		int[] mem = new int[1024 * 1024 * 1024]; // java.lang.OutOfMemoryError: Java heap space
		// 必须修改代码，让创建的数组小一点
		int[] mem = new int[1024 * 1024];
	}
}
