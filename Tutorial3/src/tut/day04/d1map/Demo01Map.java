package tut.day04.d1map;

import java.util.HashMap;
import java.util.Map;

/*
 * java.util.Map<K, V>集合
 * Map集合的特点：
 * 1. Map集合是一个双列集合，一个元素包含两个值（key，value）
 * 2. Map集合中的元素，key和value数据类型可以相同，也可以不同
 * 3. Map集合中的元素，key是不允许重复的，value是可以重复的
 * 4. Map集合中的元素，key和value一一对应
 * 
 * java.util.HashMap<K, V>集合 implements Map<K, V>接口
 * HashMap集合的特点：
 * 1. HashMap集合的底层是哈希表，查询的速度特别的快
 *     JDK1.8之前：数组+单向链表
 *     JDK1.8之后：数组+单向链表/红黑树（链表长度超过8位），提高查询的速度
 * 2. HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致
 * 
 * java.util.LinkedHashMap<K, V>集合 extends HashMap<K, V>集合
 * LinkedHashMap集合的特点：
 * 1. LinkedHashMap集合的底层是哈希表+链表（保证迭代的顺序）
 * 2. LinkedHashMap集合是一个有序的集合，存储元素和取出元素的顺序一致
 */
public class Demo01Map {

	public static void main(String[] args) {
		/*
		 * V put(K key, V value) 将指定的值与此映射中的指定键相关联（可选操作）。
		 *     返回值：V
		 *         存储键值对的时候，key不重复，返回值V是null
		 *         存储键值对的时候，key重复，会使用新的value替换Map中重复的value，返回被替换的value值
		 */
		// 创建Map集合对象
		Map<String, String> map = new HashMap<>();
		
		String v1 = map.put("张三", "李四");
		System.out.println("v1: " + v1); // v1: null
		System.out.println(map); // {张三=李四}
		
		String v2= map.put("张三", "王五");
		System.out.println("v2: " + v2); // v2: 李四
		System.out.println(map); // {张三=王五}
		
		map.put("李四", "赵六");
		map.put("孙七", "周八");
		map.put("杨过", "小龙女");
		map.put("尹志平", "小龙女");
		System.out.println(map); // {李四=赵六, 孙七=周八, 张三=王五, 杨过=小龙女, 尹志平=小龙女}，无序的
		System.out.println("==================");
		
		/*
		 * V remove(Object key) 如果存在，则从该映射中移除键的映射（可选操作）。
		 *     返回值：V
		 *         key存在，V返回被删除的值
		 *         key不存在，V返回null
		 */
		// 创建Map集合对象
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("张三", 21);
		map2.put("李四", 19);
		map2.put("王五", 25);
		System.out.println(map2); // {李四=19, 张三=21, 王五=25}
		
		Integer v3 = map2.remove("王五"); // Integer -> int 自动拆箱
		System.out.println("v3: " + v3); // v3: 25
		System.out.println(map2); // {李四=19, 张三=21}
		
		Integer v4 = map2.remove("赵六");
		System.out.println("v4: " + v4); // v4: null
		System.out.println(map2); // {李四=19, 张三=21}
		// 如果用int接收，报错：java.lang.NullPointerException
		// null 可以赋值给 Integer 包装类，但是不能赋值给数据类型
//		int v5 = map2.remove("赵六"); // Integer -> int 自动拆箱
		// 所以不建议直接使用基本数据类型来进行接收
		System.out.println("==================");
		
		/*
		 * V get(Object key) 返回指定键映射到的值，如果此映射不包含键的映射，则返回 null 。
		 *     返回值：V
		 *         key存在，返回对应value值
		 *         key不存在，返回null
		 */
		System.out.println(map2); // {李四=19, 张三=21}
		Integer v6 = map2.get("张三");
		System.out.println("v6: " + v6); // v6: 21
		System.out.println(map2); // {李四=19, 张三=21}，get不会修改集合内容
		
		Integer v7 = map2.get("赵六");
		System.out.println("v7: " + v7); // v7: null
		System.out.println("==================");
		
		/*
		 * boolean containsKey(Object key) 如果此映射包含指定键的映射，则返回 true 。
		 *     返回值：boolean
		 *         包含，返回true
		 *         不包含，返回false
		 */
		System.out.println(map2); // {李四=19, 张三=21}
		boolean b1 = map2.containsKey("李四");
		System.out.println("b1: " + b1); // b1: true
		
		boolean b2 = map2.containsKey("王五");
		System.out.println("b2: " + b2); // b2: false
	}
}
