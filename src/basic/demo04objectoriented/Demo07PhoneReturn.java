package basic.demo04objectoriented;

public class Demo07PhoneReturn {
	public static void main(String[] args) {
		Phone two = getPhone();
		System.out.println(two.brand); // 小米
		System.out.println(two.price); // 1299.0
		System.out.println(two.color); // 橙色
	}
	
	public static Phone getPhone() {
		Phone one = new Phone();
		one.brand = "小米";
		one.price = 1299.0;
		one.color = "橙色";
		return one;
	}
}
