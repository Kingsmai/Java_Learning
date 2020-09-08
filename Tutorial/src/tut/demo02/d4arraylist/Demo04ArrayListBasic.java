package tut.demo02.d4arraylist;

import java.util.ArrayList;
/*
 * 如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的包装类
 * 
 * 基本类型	包装类（引用类型，包装类都位于java.lang包下）
 * byte		Byte
 * short	Short
 * int		Integer
 * long		Long
 * float	Float
 * double	Double
 * char		Character
 * boolean	Boolean
 * 
 * 从JDK1.5+开始，支持自动装箱、自动拆箱
 * 
 * 自动装箱：基本类型 -> 包装类型（引用类型）
 * 自动拆箱：包装类型 -> 基本类型
 */
public class Demo04ArrayListBasic {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<>();
//		ArrayList<int> listB = new ArrayList<>(); // 错误写法，泛型只能是引用类型，不能是基本类型
		
		ArrayList<Integer> listC = new ArrayList<>();
		listC.add(2);
		listC.add(4);
		listC.add(8);
		System.out.println(listC); // [2, 4, 8]
		
		int num = listC.get(1);
		System.out.println("第一号元素是：" + num); // 4
	}
}
