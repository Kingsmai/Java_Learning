package advanced.demo06generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {

	@SuppressWarnings({ "unchecked", "rawtypes" }) // 忽略警告
	public static void main(String[] args) {
		/*
		 * 创建对象集合，不使用泛型
		 * 好处：集合不使用泛型，默认类型就是Object类型，可以存储任意类型的数据
		 * 弊端：不安全，会引发异常
		 */
		ArrayList list = new ArrayList();
		list.add("abc");
		list.add(123);
		
		// 使用迭代器遍历list集合
		// 获取迭代器
		Iterator it = list.iterator();
		// 使用迭代器中的方法 next, hasNext
		while(it.hasNext()) {
			// 因为默认是Object类型，所以取出来也是Object类型
			Object obj = it.next();
			System.out.println(obj);
			
			// 想要使用String类特有的方法，length获取字符串的长度；不能使用（多态 Object = "abc"）
			// 多态不能使用子类特有的方法
			// 需要向下转型
			// 会抛出ClassCastException类型转换异常，不能把Integer类型转换为String类型
//			String s = (String)obj;
//			System.out.println(s.length());
			/*
			 * 解决：这样可以解决，但是会很麻烦
			 */
			if (obj instanceof String) {
				String s = (String)obj;
				System.out.println("s.length(): " + s.length());
			}
		}
		
		/*
		 * 创建对象集合，使用泛型
		 * 好处：
		 * 1. 避免了类型转换的麻烦，存储的是什么类型，取出的就是就是什么类型
		 * 2. 把运行期异常（代码运行了之后才会报的异常）提升到了编译期（在编程过程中就会报错）
		 * 弊端：
		 * 1. 泛型是什么类型，只能存储什么类型的数据
		 */
		ArrayList<String> strs = new ArrayList<>();
		strs.add("def");
//		strs.add(1); // 编译器会报错
		
		// 使用迭代器遍历strs集合
		Iterator<String> strsit = strs.iterator();
		while (strsit.hasNext()) {
			String str = strsit.next();
			System.out.println(str + " -> " + str.length());
		}
	}
}
