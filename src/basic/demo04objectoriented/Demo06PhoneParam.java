package basic.demo04objectoriented;

public class Demo06PhoneParam {
	public static void main(String[] args) {
		Phone one = new Phone();
		one.brand = "三星";
		one.price = 2788.0;
		one.color = "蓝色";
		
		method(one); // 传进去的其实是地址值
	}
	
	private static void method(Phone param) {
		// TODO Auto-generated method stub
		System.out.println(param.brand);
		System.out.println(param.price);
		System.out.println(param.color);
	}
}
