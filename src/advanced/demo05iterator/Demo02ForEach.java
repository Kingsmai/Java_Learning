package advanced.demo05iterator;

import java.util.ArrayList;

/*
 * 增强For循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
 * 是JDK1.5之后出现的新特性
 * public interface Collection<E> extends Iterable<E> 所有的单列集合都可以使用增强for循环
 * public interface Iterable<T> 实现此接口允许对象成为增强型 for语句的目标（有时称为“for-each循环”语句）。 
 * 
 * 增强for循环：用来遍历集合和数组
 * 
 * 格式：
 * for(集合 / 数组的数据类型 变量名 : 集合名 / 数组名) {
 *     sout(变量名);
 * }
 */
public class Demo02ForEach {

	public static void main(String[] args) {
		// 使用增强for循环遍历数组
		int[] arr = {1, 3, 5, 7, 9};
		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("==============");
		
		// 使用增强for循环遍历集合
		ArrayList<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		for (String str : list) {
			System.out.println(str);
		}
	}
}
