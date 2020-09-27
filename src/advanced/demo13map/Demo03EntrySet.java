package advanced.demo13map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map集合的第一种遍历方式：使用Entry对象遍历
 * Map集合中的方法：
 *     Set<Map.Entry<K, V>> entrySet() 返回此映射中包含的映射的Set视图。
 * 实现步骤：
 *     1. 使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
 *     2. 遍历Set集合，获取每一个Entry对象
 *     3. 使用Entry对象中的方法getKey()和getValue()获取键与值
 */
public class Demo03EntrySet {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 21);
		map.put("李四", 19);
		map.put("王五", 25);
		
		// 1. 使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存储到一个Set集合中
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		// 2. 遍历Set集合，获取每一个Entry对象
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			// 3. 使用Entry对象中的方法getKey()和getValue()获取键与值
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println("==============");
		
		// 使用增强for循环
		for (Map.Entry<String, Integer> entry : set) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
		System.out.println("==============");
		
		// 简化：步骤1，2，3直接通过增强for循环完成
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "=" + value);
		}
	}
}
