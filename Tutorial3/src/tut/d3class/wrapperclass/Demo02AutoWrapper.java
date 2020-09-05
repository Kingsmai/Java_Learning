package tut.d3class.wrapperclass;

import java.util.ArrayList;

/*
 * 自动装箱与自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
 * JDK 1.5之后出现的新特性
 */
public class Demo02AutoWrapper {

	public static void main(String[] args) {
		/*
		 * 自动装箱：直接把int类型的整数赋值给包装类
		 */
		Integer in = 1; // 相当于 Integer in = new Integer(1);
		
		/*
		 * 自动拆箱：in是包装类，无法直接参与运算，可以自动转换为基本数据类型，在进行计算
		 */
		in = in + 2; // 相当于 in = in.intValue() + 2;
		// 执行完之后，又自动装箱为Integer
		System.out.println(in instanceof Integer); // true
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		/*
		 * ArrayList集合无法直接存储整数，可以存储Integer包装类
		 */
		list.add(1); // 隐含了自动装箱：list.add(new Integer(1));
		int a = list.get(0); // 隐含了自动拆箱：int a = list.get(0).intValue();
		System.out.println(a); // 1
	}
}
