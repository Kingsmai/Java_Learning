package tut.demo04.d1extends;

// 定义一个新手机，使用老手机作为父类
public class NewPhone extends Phone {
	@Override
	public void show() {
//		System.out.println("显示号码"); // 重复的
		super.show(); // 把父类的show方法拿过来用
		// 自己的子类添加更多内容
		System.out.println("显示姓名");
		System.out.println("显示头像");
	}
}
