package tut.day04.d1map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HashMap存储自定义类型键值
 * Map集合保证key是唯一的
 *     作为key的元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo04HashMapSavePerson {

	public static void main(String[] args) {
		/*
		 * HashMap存储自定义类型键值
		 * key：String类型
		 *     String类型，已经重写hashCode方法和equals方法，可以保证key唯一
		 * value：Person类型
		 *     value可以重复（同名同年龄的人视为同一个人）
		 */
		// 创建HashMap集合
		HashMap<String, Person> map = new HashMap<>();
		// 往集合中添加元素
		map.put("北京", new Person("张三", 18));
		map.put("上海", new Person("李四", 19));
		map.put("广州", new Person("王五", 20));
		map.put("北京", new Person("赵六", 18));
		// 使用keySet加增强for遍历map集合
		Set<String> set = map.keySet();
		for (String key : set) {
			Person value = map.get(key);
			System.out.println(key + "->" + value);
		}
		System.out.println("================");
		
		/*
		 * HashMap存储自定义类型键值
		 * key：Person类型
		 *     Person类就必须重写hashCode方法和equals方法，以保证key唯一
		 * value：String类型
		 *     value可以重复
		 */
		// 创建HashMap集合
		HashMap<Person, String> map2 = new HashMap<>();
		// 往集合中添加元素
		map2.put(new Person("刘邦", 18), "秦朝");
		map2.put(new Person("项羽", 18), "秦朝");
		map2.put(new Person("嬴政", 18), "秦朝");
		map2.put(new Person("刘邦", 18), "汉朝");
		// 使用entrySet和增强for遍历Map集合
		Set<Map.Entry<Person, String>> set2 = map2.entrySet();
		for (Map.Entry<Person, String> entry : set2) {
			Person key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "->" + value);
		}
	}
}
