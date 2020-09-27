
package basic.demo04objectoriented;

public class Demo05PhoneSame {
	public static void main(String[] args) {
		Phone one = new Phone();
		System.out.println(one.brand); // null
		System.out.println(one.price); // 0.0
		System.out.println(one.color); // null
		System.out.println("==========");
		
		one.brand = "华为";
		one.price = 4299.0;
		one.color = "黑色";
		System.out.println(one.brand); // 华为
		System.out.println(one.price); // 4299.0
		System.out.println(one.color); // 黑色
		
		one.call("任正非");
		one.sendMessage();
		System.out.println("==========");
		
		// 将one当中保存的地址值赋值给two
		Phone two = one;
		System.out.println(two.brand); // 华为
		System.out.println(two.price); // 4299.0
		System.out.println(two.color); // 黑色
		System.out.println("==========");
		
		two.brand = "苹果";
		two.price = 6899.0;
		two.color = "金色";
		System.out.println(two.brand); // 苹果
		System.out.println(two.price); // 6899.0
		System.out.println(two.color); // 金色
				
		two.call("乔布斯");
		two.sendMessage();
		System.out.println("==========");
	}
}
