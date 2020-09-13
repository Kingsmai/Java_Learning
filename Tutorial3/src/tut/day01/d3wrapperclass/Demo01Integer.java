package tut.day01.d3wrapperclass;

/*
 * 装箱：把基本类型的数据，包装到包装类中（基本类型数据 -> 包装类）
 * 	构造方法：
 *     Integer(Int value) 构建了一个新分配�? Integer表示指定�? int价�?��?? (JDK9 Outdated)
 *     Integer(String s) 构建了一个新分配�? Integer表示 int值表示的 String参数�? (JDK9 Outdated)
 *         传�?�的字符串必须是基本类型的字符串，否则会抛出异常�?"100"正确�?"a"错误�?
 * 	静态方法：
 *     static Integer valueOf�?(int i) 返回表示指定�? int值的 Integer实例�?  
 *     static Integer valueOf�?(String s) 返回�?�? Integer物体保持在指定的�? String�?  
 *     
 * 拆箱：在包装类中取出基本类型的数据（包装�? -> 基本类型的数据）
 * 	成员方法：
 *     int intValue() 返回此�?? Integer�? int�?  
 */
public class Demo01Integer {

	@SuppressWarnings("deprecation") // 无视“已淘汰”警�?
	public static void main(String[] args) {
		// 装箱
		// 构造方法
		Integer int1 = new Integer(1); // 因为jdk9就过时了，所以方法上有横线
		System.out.println(int1); // 1
		Integer int2 = new Integer("1");
		System.out.println(int2); // 1
//		Integer int3 = new Integer("a"); // java.lang.NumberFormatException报错，数据类型不一样
		Integer int4 = new Integer('a');
		System.out.println(int4); // 字符a转换为ASCII码97
		
		// 静态方法
		Integer int5 = Integer.valueOf(1);
		System.out.println(int5); // 1
		Integer int6 = Integer.valueOf("1");
		System.out.println(int6); // 1
		
		// 拆箱
		int i = int1.intValue();
		System.out.println(i); // 1
	}
}
