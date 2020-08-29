package tut.demo04.d2practise;

import java.util.ArrayList;

public interface MainRedPacket {

	public static void main(String[] args) {
		Manager manager = new Manager("群主", 100);
		
		Member one = new Member("成员A", 0);
		Member two = new Member("成员B", 0);
		Member three = new Member("成员C", 0);
		
		manager.show();
		one.show();
		two.show();
		three.show();
		System.out.println("==========================");
		
		// 群主总共发20块钱，分成三个红包
		ArrayList<Integer> list = manager.send(20, 3);
		
		// 三个普通成员收红包
		one.receive(list);
		two.receive(list);
		three.receive(list);
		
		manager.show(); // 100 - 20 = 80
		// 6、6、8随机分配
		one.show();
		two.show();
		three.show();
	}
}
