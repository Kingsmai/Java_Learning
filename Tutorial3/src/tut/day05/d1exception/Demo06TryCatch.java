package tut.day05.d1exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * try...catch：异常处理的第二种方式
 * 格式：
 *     try {
 *         可能产生异常的代码
 *     } catch(定义一个异常的变量，用来接收try抛出的异常对象) {
 *         异常的处理逻辑，产生异常对象之后，怎么处理异常对象
 *         一般在工作中，会把异常的信息记录到一个日志中
 *     }
 *     ... 可以有多个
 *     catch(异常类名 变量名) {
 *     
 *     }
 *     注意：
 *         1. try中，可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常
 *         2. 如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完catch中的处理逻辑，继续执行try...catch之后的代码
 *            如果try中没有产生异常，那么就不会执行catch中的异常的处理逻辑，执行完try中的代码，继续执行try...catch之后的代码
 */
@SuppressWarnings("unused")
public class Demo06TryCatch {

	public static void main(String[] args) {
		try {
			// 可能产生异常的代码
			readFile("d:\\a.tx");
			System.out.println("资源释放"); // 一旦报错就不会执行
		} catch (IOException e) { // try中抛出什么异常对象，catch就定义什么异常变量，用来接收这个异常对象
			// 异常的处理逻辑，产生异常对象之后，怎么处理异常对象
			// System.out.println("catch - 文件的后缀名不是.txt");
			
			/*
			 * Throwable类中定义了3个异常处理的方法：
			 *     String getMessage() 返回此throwable的详细消息字符串。
			 *     String toString() 返回此throwable的简短描述。
			 *     void printStackTrace() 将此throwable及其回溯打印到标准错误流。
			 * JVM打印异常对象， 默认调用printStackTrace，打印的异常信息是最全面的
			 */
			System.out.println(e.getMessage()); // 文件后缀名不对
			System.out.println(e.toString()); // java.io.IOException: 文件后缀名不对
			/*
			 * java.io.IOException: 文件后缀名不对
			 *     at tut.day05.d1threadandexception.Demo06TryCatch.readFile(Demo06TryCatch.java:54)
			 *     at tut.day05.d1threadandexception.Demo06TryCatch.main(Demo06TryCatch.java:29)
			 */
			e.printStackTrace(); // 打印红色的字符串，包括完整代码行列数
		}
		System.out.println("后续代码");
	}
	
	/*
	 * 如果传递的路径不是.txt结尾
	 * 那么我们就让他抛出IO异常对象，告知方法的调用者，文件的后缀名不对
	 */
	public static void readFile(String fileName) throws IOException {
		if (!fileName.endsWith(".txt")) {
			throw new IOException("文件后缀名不对");
		}
		System.out.println("路径没有问题，读取文件");
	}
}
