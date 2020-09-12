package tut.day02.p1doudizhu;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 斗地主综合案例：
 * 1. 准备牌
 * 2. 洗牌
 * 3. 发牌
 * 4. 看牌
 */
public class Practise01Test {

	public static void main(String[] args) {
		/*
		 * 1. 准备牌
		 */
		// 定义一个存储54张牌的ArrayList集合，泛型使用字符串
		ArrayList<String> poker = new ArrayList<>();
		// 定义两个数组，一个数组存储分别存储牌的花色和序号
		String[] colors = {"♠", "♥", "♣", "♦"};
		String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
		// 先把大王、小王存储到poker集合中
		poker.add("大王");
		poker.add("小王");
		// 循环嵌套遍历两个数组，组装52张牌
		for (String color : colors) {
			for (String num : numbers) {
//				System.out.println(color + num);
				// 把组装好的牌存储到poker集合中
				poker.add(color + num);
			}
		}
//		System.out.println(poker);
		
		/*
		 * 2. 洗牌
		 * 使用集合工具类Collections中的方法
		 * static void shuffle​(List<?> list) 使用默认的随机源随机置换指定的列表。 
		 */
		Collections.shuffle(poker);
//		System.out.println(poker); 
		
		/*
		 * 3. 发牌
		 */
		// 定义四个集合，存储玩家的牌和底牌
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();
		ArrayList<String> deck = new ArrayList<>();
		/*
		 * 遍历poker集合，获取每一张牌
		 * 使用poker集合的索引%3给三个玩家轮流发牌
		 * 剩余3张给底牌
		 * 注意：
		 * 	    先判断底牌（i >= 51），否则牌就发没了
		 */
		// 这边不能使用foreach（foreach没有索引）
		for(int i = 0; i < poker.size(); i++) {
			// 获取每一张牌
			String card = poker.get(i);
			// 轮流发牌
			if (i >= 51) {
				// 给底牌发牌
				deck.add(card);
			} else {
				switch (i % 3) {
				case 0:
					player1.add(card);
					break;
				case 1:
					player2.add(card);
					break;
				case 2:
					player3.add(card);
					break;
				}
			}
		}
		
		/*
		 * 4. 看牌
		 */
		System.out.println("周润发：" + player1);
		System.out.println("刘德华：" + player2);
		System.out.println("周星驰：" + player3);
		System.out.println("底牌：" + deck);
	}
}
