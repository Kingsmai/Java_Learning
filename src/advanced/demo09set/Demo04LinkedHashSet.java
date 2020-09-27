package advanced.demo09set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 * java.util.LinkedHashSet集合 extends HashSet集合
 * LinkedHashSet集合特点：
 *     底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 */
public class Demo04LinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("def");
		set.add("abc");
		set.add("abc");
		set.add("ghi");
		System.out.println(set); // [abc, def, ghi]，无序，不允许重复
		
		LinkedHashSet<String> linked = new LinkedHashSet<>();
		linked.add("def");
		linked.add("abc");
		linked.add("abc");
		linked.add("ghi");
		System.out.println(linked); // [def, abc, ghi]，有序，不允许重复
	}
}
