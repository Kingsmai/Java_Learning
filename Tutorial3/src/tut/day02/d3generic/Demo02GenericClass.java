package tut.day02.d3generic;

public class Demo02GenericClass {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// 不写泛型默认为Object类型
		GenericClass gc = new GenericClass();
		gc.setName("（如果定义类的时候数据类型写了String）那么只能是字符串");
//		String str = gc.getName(); // 取出也只能是字符串
		Object obj = gc.getName();
		System.out.println(obj);
		
		// 创建GenericClass对象，泛型是Integer类型
		GenericClass<Integer> gcInt = new GenericClass<>();
		gcInt.setName(123);
		Integer name = gcInt.getName();
		System.out.println(name); // 123
		int nameInt = gcInt.getName(); // 自动拆箱 Integer -> int
		System.out.println(nameInt); // 123
		
		// 创建GenericClass对象，泛型是String类型
		GenericClass<String> gcStr = new GenericClass<>();
		gcStr.setName("小明");
		String nameStr = gcStr.getName();
		System.out.println(nameStr); // 小明
	}
}
