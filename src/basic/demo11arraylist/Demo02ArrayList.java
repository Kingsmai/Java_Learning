package basic.demo11arraylist;

import java.util.ArrayList;

/*
 * 数组的长度不可发生改变
 * 但是ArrayList集合的长度是可以随意变化的
 * 
 * 对于ArrayList来说，有一个尖括号<E>代表泛型
 * 泛型：装在集合当中的所有元素，全都是统一什么类型
 * 泛型只能是引用类型，不能是基本类型
 * 
 * 注意事项：
 * 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
 * 如果内容是空，得到的是一个空的中括号[]
 */
public class Demo02ArrayList {
	public static void main(String[] args) {
		// 创建一个ArrayList集合，集合的名称是list，里面全是String字符串类型的数据
		// 备注：从JDK1.7 开始，右侧的尖括号内部可以不写内容，但是<>不可省略
		ArrayList<String> list = new ArrayList<>();
		System.out.println(list); // []
		
		// 向集合当中添加一些数据，需要用到add方法
		list.add("张三");
		System.out.println(list); // [张三]
		
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		System.out.println(list); // [张三, 李四, 王五, 赵六]
		
//		list.add(100); // 错误写法，因为创建的时候<>已经定义是String，所以添加进去的元素必须是字符串
	}
}
