package tut.p1usbdemo.demo01;

// 键盘就是一种USB设备
public class Keyboard implements USB {

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("打开键盘");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭键盘");
	}
	
	public void type() {
		System.out.println("键盘输入");
	}

}
