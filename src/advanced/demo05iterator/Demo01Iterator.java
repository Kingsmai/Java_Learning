package advanced.demo05iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * java.util.Iterator接口：也称为迭代器（对集合进行遍历）
 * 常用方法：
 * boolean hasNext() 如果迭代具有更多元素，则返回 true
 * 	判断集合中还有没有下一个元素，有返回true，没有返回false
 * E next() 返回迭代中的下一个元素
 * 	取出集合中的下一个元素
 * 
 * Iterator迭代器是一个接口，无法直接使用，需要使用Iterator接口的实现类对象
 * 获取实现类的方式比较特殊：Collection接口中有个方法，叫iterator()，此方法返回的是迭代器的实现类对象
 * 	Iterator<E> iterator() 返回此集合中元素的迭代器
 * 
 * 迭代器使用步骤：
 * 1. 使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
 * 2. 使用Iterator接口中的方法hasNext()判断有没有下一个元素
 * 3. 使用Iterator接口中的方法next()取出集合中的下一个元素
 */
public class Demo01Iterator {

	public static void main(String[] args) {
		// 创建一个集合对象
		Collection<String> coll = new ArrayList<String>();
		// 往集合中添加元素
		coll.add("张三");
		coll.add("李四");
		coll.add("王五");
		coll.add("赵六");
		
		/*
		 * 1. 使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
		 * 注意：
		 * 	Iterator<E> 接口也是有泛型的，迭代器的泛型跟着集合走
		 */
		Iterator<String> it = coll.iterator(); // 多态
		
		// 2. 使用Iterator接口中的方法hasNext()判断有没有下一个元素
		System.out.println(it.hasNext()); // true
		
		// 3. 使用Iterator接口中的方法next()取出集合中的下一个元素
		String str = it.next();
		System.out.println(str); // 张三
		
		// 用while循环遍历输出迭代器中的元素
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 到这里，迭代器里已经没有元素了
		System.out.println(it.hasNext()); // false
//		System.out.println(it.next()); // java.util.NoSuchElementException异常
		System.out.println("============");
		
		// 用for循环遍历（不推荐）
		for(Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
	}
}
