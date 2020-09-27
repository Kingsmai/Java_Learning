package basic.demo27usbdemo;

public class DemoMain {

	public static void main(String[] args) {
		// 创建一个笔记本电脑
		Computer computer = new Computer();
		computer.powerOn();
		
		// 准备一个鼠标，供电脑使用
//		Mouse mouse = new Mouse();
		// 进行向上转型
//		USB usbMouse = mouse;
		USB usbMouse = new Mouse(); // 多态写法
		// 参数是USB类型，传递进去的就是USB鼠标
		computer.useDevice(usbMouse);
		
		// 创建一个USB键盘
		Keyboard keyboard = new Keyboard(); // 没有使用多态写法
		computer.useDevice(keyboard); // 正确写法
		
		// 使用子类对象， 匿名对象
//		computer.useDevice(new Keyboard()); // 正确写法
		
		computer.powerOff();
		System.out.println("==============");
		
		method(10.0); // 正确写法 double -> double
		method(20); // 正确写法 int -> double
		int a = 30;
		method(a); // 正确写法 int -> double
	}
	
	private static void method(double num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
}
