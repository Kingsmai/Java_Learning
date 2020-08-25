package tut.demo02.d4arraylist;

import java.util.ArrayList;

/*
 * 定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。
 * 格式参照 {元素@元素@元素}。
 * 
 * System.out.println(list); [10, 20, 30]
 * printArrayList(list); {10@20@30}
 */
public class Practise03ArrayListParam {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		System.out.println(list); // [张三, 李四, 王五, 赵六]
		
		printArrayList(list);
	}
	
	/*
	 * 定义方法三要素
	 * 返回值类型：只是进行打印，没有运算，没有结果；所以用void
	 * 方法名称：printArrayList
	 * 参数列表：ArrayList
	 */
	public static void printArrayList(ArrayList<String> list) {
		// {10@20@30}
		System.out.print("{");
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (i == list.size() - 1) { // 最后一个
				System.out.println(name + "}");
			} else {
				System.out.print(name + "@");				
			}
		}
	}
}
