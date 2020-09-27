package advanced.demo13map;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 练习：计算字符串中，每个字符出现的次数
 * 
 * 分析：
 * 1. 使用Scanner获取用户输入的字符串
 * 2. 创建一个Map集合，Key是字符串中的字符，Value是字符个数
 * 3. 遍历字符串，获取每一个字符
 * 4. 使用获取到的字符到Map集合判断key是否存在
 *     key存在：
 *         通过key获取value
 *         value++
 *         put(key, value)，把新的value存储到集合中
 *     key不存在：
 *         put(key, 1)
 * 5. 遍历Map集合，输出结果
 */
public class Practise01CountChar {

	public static void main(String[] args) {
		// 1. 使用Scanner获取用户输入的字符串
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String str = sc.next();
		
		// 2. 创建一个Map集合，Key是字符串中的字符，Value是字符个数
		HashMap<Character, Integer> map = new HashMap<>();
		
		// 3. 遍历字符串，获取每一个字符
		for (char ch : str.toCharArray()) {
			// 4. 使用获取到的字符到Map集合判断key是否存在
			if (map.containsKey(ch)) {
				// key存在
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			} else {
				// key不存在
				map.put(ch, 1);
			}
		}
		// 5. 遍历Map集合，输出结果
		for (Character key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + " -> " + value);
		}
		sc.close();
	}
}
