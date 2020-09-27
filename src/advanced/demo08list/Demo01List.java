package advanced.demo08list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * java.util.List接口 extends Collection接口
 * 
 * List接口的特点：
 * 1. 有序的集合，存储元素和取出元素的顺序是一致的（存储123，取出123）
 * 2. 有索引，包含了一些带索引的方法
 * 3. 允许存储重复的元素
 * 
 * List接口中带索引的方法（特有方法）
 * 1. void add (int index, E element) 将指定元素插入此列表中的指定位置（可选操作）。
 * 2. E get (int index) 返回此列表中指定位置的元素。
 * 3. E remove (int index) 删除此列表中指定位置的元素（可选操作）。
 * 4. E set (int index, E element) 用指定的元素替换此列表中指定位置的元素（可选操作）。
 * 
 * 注意：
 * 操作索引的时候，一定要防止索引越界异常（不要超出索引适用范围）
 * java.lang.IndexOutOfBoundsException：索引越界异常，集合的报错
 * java.lang.ArrayIndexOutOfBoundsException：数组的报错
 */
public class Demo01List {

	public static void main(String[] args) {
		// 创建一个List集合对象
		List<String> list = new ArrayList<>();
		// 试用add方法往集合中添加元素
		list.add("a"); // 0
		list.add("b"); // 1
		list.add("c"); // 2
		list.add("d"); // 3
		list.add("a"); // 4
		System.out.println(list); // [a, b, c, d, a] 不是地址：重写了toString方法
		
		// void add (int index, E element) 将指定元素插入此列表中的指定位置（可选操作）。
		// 在c和d之间添加一个Xiaomai
		list.add(3, "Xiaomai");
		System.out.println(list); // [a, b, c, Xiaomai, d, a]
		
		// E remove (int index) 删除此列表中指定位置的元素（可选操作）。
		// 删除c元素
		String rm = list.remove(2);
		System.out.println("被移除的元素：" + rm); // c
		System.out.println(list); // [a, b, Xiaomai, d, a]
		
		// E set (int index, E element) 用指定的元素替换此列表中指定位置的元素（可选操作）。
		// 把Xiaomai替换为Programmer
		String change = list.set(2, "Programmer");
		System.out.println("被替换的元素：" + change); // Xiaomai
		System.out.println(list); // [a, b, Programmer, d, a]
		
		// List集合遍历有三种方式：
		// 使用普通的for循环
		for (int i = 0; i < list.size(); i++) {
			// E get (int index) 返回此列表中指定位置的元素。
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.println("===============");
		
		// 使用迭代器
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("===============");
		
		// 使用增强for
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("===============");
		
		// 一定要防止索引越界异常
//		String str = list.get(5); // Index 5 out of bounds for length 5
	}
}
