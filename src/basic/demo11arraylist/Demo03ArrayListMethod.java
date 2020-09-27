package basic.demo11arraylist;

import java.util.ArrayList;

/*
 * ArrayList当中的常用方法：
 * 
 * public boolean add(E e); // 向集合当中添加元素，参数的类型和泛型一致，返回值代表添加是否成功
 * 备注：对于ArrayList集合来说，add添加元素一定是成功的，所以返回值可用可不用
 * 但是对于其他集合（过后学习），add添加动作不一定成功
 * public E get(int index); // 从集合当中获取元素，参数是索引编号，返回值是对应位置的元素
 * public E remove(int index); // 从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素
 * public int size(); // 获取集合的尺寸长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list); // []
		
		// 向集合中添加元素：add
		boolean success = list.add("张三");
		System.out.println("添加的动作是否成功：" + success); // 添加的动作是否成功：true
		System.out.println(list); // [张三]
		
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		System.out.println(list); // [张三, 李四, 王五, 赵六]
		
		String name = list.get(2);
		System.out.println("第2号索引位置：" + name); // 第2号索引位置：王五
		System.out.println(list); // [张三, 李四, 王五, 赵六]，get不会删除集合内容
		
		String whoRemoved = list.remove(1); // 删除李四
		System.out.println("被删除的人是：" + whoRemoved); // 被删除的人是：李四
		System.out.println(list); // [张三, 王五, 赵六]
		
		int size = list.size();
		System.out.println("集合长度为：" + size); // 集合长度为：3
		
		
		
		// 有了上面的方法，我们就可以遍历输出集合
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
