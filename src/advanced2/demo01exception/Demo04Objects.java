package advanced2.demo01exception;

import java.util.Objects;

/*
 * Objects类中的静态方法
 * static <T> T requireNonNull?(T obj) 检查指定的对象引用是否不是 null 。
 * 源码：
 *     public static <T> T requireNonNull(T obj) {
 *         if (obj == null)
 *             throw new NullPointerException();
 *         return obj;
 *     }
 */
public class Demo04Objects {

	public static void main(String[] args) {
		method(null);
	}
	
	public static void method(Object obj) {
		// 对传递过来的参数做合法判断，判断是否为null
//		if (obj == null) {
//			new NullPointerException("传递的对象的值是空");
//		}
		
//		Objects.requireNonNull(obj);
		
		Objects.requireNonNull(obj, "传递的对象的值是空");
	}
}
