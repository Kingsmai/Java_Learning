package basic.demo11arraylist;

import java.util.ArrayList;
import java.util.Random;

/*
 * 生成6个1~33之间的随机整数,添加到集合,并遍历
 * 
 * 思路：
 * 1. 需要存储6个数字，创建一个集合，<Integer>
 * 2. 产生随机数，需要Random
 * 3. 用for循环6次，来产生6个随机数
 * 4. 循环内调用rnd.nextInt(int n)，参数是33，0~32，整体+1才是1~33
 * 5. 把数字添加到集合中：add()
 * 6. 遍历集合，for循环，size(),get()
 */
public class Practise01ArrayListRandom {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		Random rnd = new Random();
		for (int i = 0; i < 6; i++) {
			nums.add(rnd.nextInt(33) + 1);
		}
		for (int i = 0; i < nums.size(); i++) {
			System.out.println(nums.get(i));
		}
	}
}
