package tut.demo.d3objectoriented;

public class Demo03PhoneOne {
	public static void main(String[] args) {
		// 根据Phone类，创建一个名为one的对象
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
	}
}
