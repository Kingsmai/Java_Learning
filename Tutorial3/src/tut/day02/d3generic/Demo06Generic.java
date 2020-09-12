package tut.day02.d3generic;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型的上线限定：? extends E  代表使用的泛型只能是 E 类型的子类 / 本身
 * 泛型的下线限定：? super E    代表使用的泛型只能是 E 类型的父类 / 本身
 */
public class Demo06Generic {

	public static void main(String[] args) {
		Collection<Integer> list1 = new ArrayList<Integer>();// 儿子,是Number的儿子
	    Collection<String> list2 = new ArrayList<String>(); // 兄弟
	    Collection<Number> list3 = new ArrayList<Number>(); // 兄弟
	    Collection<Object> list4 = new ArrayList<Object>(); // 爹
	    
	    getElement(list1);
//	    getElement(list2); // 报错
	    getElement(list3);
//	    getElement(list4); // 报错
	  
//	    getElement2(list1); // 报错
//	    getElement2(list2); // 报错
	    getElement2(list3);
	    getElement2(list4);
	    
	    /*
	     * 类与类之间的继承关系
	     * Integer extends Number extends Object
	     * String extends Object
	     */
	}
	// 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
	// ? extends Number,代表的是Number类及其子类,上限
	public static void getElement(Collection<? extends Number> coll){}
	// 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
	// ? super Number,代表的是Number类及其父类,下限
	public static void getElement2(Collection<? super Number> coll){}
}

