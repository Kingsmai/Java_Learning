package tut.day03.d5collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下：
 * static <T> boolean addAll?(Collection<? super T> c, T... elements) 将所有指定的元素添加到指定的集合中。
 * static void shuffle?(List<?> list) 使用默认的随机源随机置换指定的列表。
 * static void shuffle?(List<?> list, Random rnd) 使用指定的随机源随机置换指定的列表。
 * static <T extends Comparable<? super T>> void sort?(List<T> list) 根据其元素的natural ordering ，将指定列表按升序排序。
 * static <T> void sort?(List<T> list, Comparator<? super T> c) 根据指定比较器引发的顺序对指定列表进行排序。
 */
public class Demo01Collections {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		// 往集合中添加多个元素
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		list.add("e");
		
		// * static <T> boolean addAll?(Collection<? super T> c, T... elements) 将所有指定的元素添加到指定的集合中。
		Collections.addAll(list, "a", "b", "c", "d", "e");
		System.out.println(list); // [a, b, c, d, e]
		
		Collections.shuffle(list);
		System.out.println(list); // [b, d, a, e, c]（每次顺序都不一样）
	}
}
