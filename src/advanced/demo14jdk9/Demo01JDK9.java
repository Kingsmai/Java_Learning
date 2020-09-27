package advanced.demo14jdk9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * JDK9新特性：
 *     List接口，Set接口，Map接口：里边增加了一个静态方法of，可以给集合一次性添加多个元素
 *     static <E> Set<E> of(E... elements) 返回包含任意数量元素的不可修改集。
 *     使用前提：
 *         当集合中存储的元素个数已经确定了、不再改变时使用
 * 注意：
 *     1. of方法只适用于List接口，Set接口，Map接口，不适用于接口的实现类
 *     2. of方法返回值是一个不能改变的集合，集合不能再使用add、put方法添加元素，会抛出异常
 *     3. Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
 *     
 * 作用：1. 返回一个静态集合，可以用作某些初始化，提高安全性
 */
public class Demo01JDK9 {

	public static void main(String[] args) {
		List<String> list = List.of("a", "b", "a", "c", "d");
		System.out.println(list); // [a, b, a, c, d, a]
//		list.add("w"); // java.lang.UnsupportedOperationException：不支持操作异常
		
//		Set<String> set = Set.of("a", "b", "a", "c", "d"); // java.lang.IllegalArgumentException：非法参数异常，有重复的元素
		Set<String> set = Set.of("a", "b", "c", "d");
		System.out.println(set); // [d, c, b, a]
//		set.add("w"); // java.lang.UnsupportedOperationException：不支持操作异常
		
//		Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20, "张三", 21); // java.lang.IllegalArgumentException: duplicate key: 张三
		Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20);
		System.out.println(map); // {李四=19, 王五=20, 张三=18}
//		map.put("赵六", 21); // java.lang.UnsupportedOperationException：不支持操作异常
	}
}
