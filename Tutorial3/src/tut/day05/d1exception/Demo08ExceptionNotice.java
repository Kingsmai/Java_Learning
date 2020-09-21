package tut.day05.d1exception;

import java.util.List;

/*
 * 异常的注意事项
 */
public class Demo08ExceptionNotice {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*
		 * 多个异常捕获的三种处理方式：
		 * 1. 多个异常分别处理
		 * 2. 多个异常一次捕获，多次处理
		 * 3. 多个异常一次捕获，一次处理
		 */
		
		// 1. 多个异常分别处理
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		try {
			List<Integer> list = List.of(1, 2, 3);
			System.out.println(list.get(4)); // java.lang.ArrayIndexOutOfBoundsException			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("后续代码");
		
		// 2. 多个异常一次捕获，多次处理
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
			String str = null;
			System.out.println(str.charAt(5));
		} catch (ArrayIndexOutOfBoundsException e) { // 如果数组越界了，就用这个处理
			System.out.println(e);
		} catch (NullPointerException e) { // 如果集合越界了，就用这个处理
			System.out.println(e);
		}
		
		/*
		 * 一个try多个catch注意事项：
		 *     catch里边定义的异常变脸，如果有子父类关系，那么子类的异常变脸必须写在上面，否则就会报错
		 *         ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
		 */
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
			List<Integer> list = List.of(1, 2, 3);
			System.out.println(list.get(4));
		} catch (IndexOutOfBoundsException e) { // 父类（多态）
			System.out.println(e);
//		} catch (ArrayIndexOutOfBoundsException e) { // 子类写在下边（没有用），编译期报错
//			System.out.println(e);
		}
		
		// 3. 多个异常一次捕获，一次处理
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
			List<Integer> list = List.of(1, 2, 3);
			System.out.println(list.get(4));
		} catch (Exception e) { // 父类（多态）
			System.out.println(e);
		}
		
		// 运行时异常被抛出可以不处理，即不捕获也不声明抛出
		// 默认给虚拟机处理，终止程序，什么时候不抛出异常了，再来继续执行程序
	}
}
