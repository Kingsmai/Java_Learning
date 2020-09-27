package advanced.demo13map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
 * java.util.LinkedHashMap<K, V> extends HashMap<K, V>
 * Map接口的哈希表和链表实现，具有可预测的迭代顺序。
 * 底层原理：
 *     哈希表 + 链表（记录元素的顺序）
 */
public class Demo05LinkedHashMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("a", "a");
		map.put("c", "c");
		map.put("b", "b");
		map.put("a", "d");
		System.out.println(map); // {a=d, b=b, c=c}，key不允许重复，无序的
		
		LinkedHashMap<String, String> linked = new LinkedHashMap<>();
		linked.put("a", "a");
		linked.put("c", "c");
		linked.put("b", "b");
		linked.put("a", "d");
		System.out.println(linked); // {a=d, c=c, b=b}，key不允许重复，有序的
	}
}
