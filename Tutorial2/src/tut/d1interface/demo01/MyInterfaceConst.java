package tut.d1interface.demo01;

/*
 * 接口当中也可以定义“成员变量”，但是必须使用 public static final 三个关键字进行修饰
 * 从效果上看，这其实就是接口的【常量】
 * 
 * 格式：
 * public static final 数据类型 常量名称 = 数据值;
 * 
 * 注意：
 * 一旦使用final关键字进行修饰，说明不可改变
 * 
 * 注意事项：
 * 1. 接口当中的常量，可以省略public static final，注意，不写也照样是这样
 * 2. 接口当中的常量，必须进行赋值，不能不赋值
 * 3. 软性建议：常量名改为大写，字之间用下划线分开（推荐命名规则）
 */
public class MyInterfaceConst {

	// 这其实就是一个常量，一旦赋值，是不可以修改的
	public static final int NUM_OF_MY_CLASS = 10;
	
//	public static final String text; // 错误写法，必须赋值
}
