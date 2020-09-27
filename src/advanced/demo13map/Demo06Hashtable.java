package advanced.demo13map;

import java.util.HashMap;
import java.util.Hashtable;

/*
 * java.util.Hashtable<K, V>集合 implements Map<K, V>集合
 * 
 * Hashtable：底层也是一个哈希表，是一个线程安全的集合，是单线程的集合，速度慢
 * HashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
 * 
 * HashMap集合（之前所学的所有集合）：可以存储null值，null键
 * Hashtable集合：不能存储null值，null键
 * 
 * Hashtable和Vector集合一样，在JDK1.2之后被更先进的集合取代了。
 * Vector -> ArrayList
 * Hashtable -> HashMap
 * Hashtable的子类Properties依然活跃在历史的舞台
 * 
 * Properties是一个唯一与IO流相结合的集合
 */
public class Demo06Hashtable {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put(null, "a");
		map.put("b", null);
		map.put(null, null); // null也算是key重复
		System.out.println(map); // {null=null, b=null}
		
		Hashtable<String, String> table = new Hashtable<>();
//		table.put(null, "a"); // java.lang.NullPointerException
//		table.put("b", null); // java.lang.NullPointerException
//		table.put(null, null); // java.lang.NullPointerException
	}
}
