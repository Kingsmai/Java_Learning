package tut.day03.d1list;

import java.util.LinkedList;

/*
 * java.util.LinkedList集合 implements List接口
 * LinkedList集合的特点：
 * 1. 底层是一个链表结构：查询慢，增删快
 * 2. 里边包含了大量操作首尾元素的方法
 * 注意：使用LinkedList集合特有的方法，不能使用多态
 * 
 * void addFirst (E e) 在此列表的开头插入指定的元素。
 * void addLast (E e) 将指定的元素追加到此列表的末尾。
 * void push (E e) 将元素推送到此列表所表示的堆栈上。
 * E getFirst () 返回此列表中的第一个元素。
 * E getLast () 返回此列表中的最后一个元素。
 * E removeFirst () 从此列表中删除并返回第一个元素。
 * E removeLast () 从此列表中删除并返回最后一个元素。
 * E pop () 弹出此列表所代表的堆栈中的元素。
 * boolean isEmpty () 如果此集合不包含任何元素，则返回 true 。
 */
public class Demo02LinkedList {

	public static void main(String[] args) {
		/*
		 * void addFirst (E e) 在此列表的开头插入指定的元素。
		 * void addLast (E e) 将指定的元素追加到此列表的末尾。
		 * void push (E e) 将元素推送到此列表所表示的堆栈上。 == addFirst(E e)
		 */
		// 创建LinkedList集合对象
		LinkedList<String> linked = new LinkedList<>();
		// 使用add方法往集合中添加元素
		linked.add("a");
		linked.add("b");
		linked.add("c");
		System.out.println(linked); // [a, b, c]
		
		linked.addFirst("Start");
		System.out.println(linked); // [Start, a, b, c]
		
		linked.push("Push"); // 等效于addFirst()
		System.out.println(linked); // [Push, Start, a, b, c]
		
		linked.addLast("End"); // 等效于add()
		System.out.println(linked); // [Push, Start, a, b, c, End]
		System.out.println("===================");
		
		/*
		 * E getFirst () 返回此列表中的第一个元素。
		 * E getLast () 返回此列表中的最后一个元素
		 */
//		linked.clear(); // 情况集合中的元素
		// 获取元素的集合为空的话，会抛出java.util.NoSuchElementException
		
		// boolean isEmpty () 如果此集合不包含任何元素，则返回 true 。
		if (!linked.isEmpty()) { // 不是空的才获取
			String first = linked.getFirst();  // 等效于get(0)
			System.out.println(first); // Push
			String last = linked.getLast(); // 等效于get(linked.size())
			System.out.println(last); // End
		} else {
			System.out.println("集合为空");
		}
		System.out.println("===================");
		
		/*
		 * E removeFirst () 从此列表中删除并返回第一个元素。
		 * E removeLast () 从此列表中删除并返回最后一个元素。
		 * E pop () 弹出此列表所代表的堆栈中的元素。等效于removeFirst
		 */
		String rmFirst = linked.removeFirst();
		System.out.println(rmFirst); // Push
		System.out.println(linked); // [Start, a, b, c, End]
		String rmLast = linked.removeLast();
		System.out.println(rmLast); // End
		System.out.println(linked); // [Start, a, b, c]
		String popStr = linked.pop(); // 等效于removeFirst
		System.out.println(popStr); // Start
		System.out.println(linked); // [a, b, c]
	}
}
