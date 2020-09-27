package basic.demo19abstractpractise;

import java.util.ArrayList;
import java.util.Random;

// 普通成员
public class Member extends User {

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String name, int money) {
		super(name, money);
		// TODO Auto-generated constructor stub
	}
	
	public void receive(ArrayList<Integer> list) {
		// 从多个红包当中，随便抽取一个，给我自己
		// 随机获取一个集合当中的索引编号
		int index = new Random().nextInt(list.size());
		// 根据索引，从集合当中删除，并且得到被删除的红包给我自己
		int delta = list.remove(index);
		// 当前成员自己本来有多少钱
		int money = super.getMoney();
		// 加法，并重新设置回去
		super.setMoney(money + delta);
	}
}
