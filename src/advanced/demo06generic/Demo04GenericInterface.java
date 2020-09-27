package advanced.demo06generic;

/*
 * 测试含有泛型的接口
 */
public class Demo04GenericInterface {

	public static void main(String[] args) {
		// 创建GenericInterfaceImpl1对象
		GenericInterface<String> impl1 = new GenericInterfaceImpl1(); // 多态（左侧泛型必须与右侧实现类一致）
		impl1.method("abc");
		GenericInterfaceImpl1 impl2 = new GenericInterfaceImpl1();
		impl2.method("def");

		// 创建GenericInterfaceImpl2对象
		GenericInterfaceImpl2<Integer> impl3 = new GenericInterfaceImpl2<>();
		impl3.method(10);
		GenericInterfaceImpl2<Double> impl4 = new GenericInterfaceImpl2<>();
		impl4.method(8.8);
	}
}
