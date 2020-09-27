package advanced2.demo03thread.d4setname;

public class Demo01SetThreadName {

	public static void main(String[] args) {
		// 开启多线程
		MyThread mt = new MyThread();
		mt.setName("张三线程");
		mt.start();
		
		// 开启多线程
		new MyThread("李四线程").start();
	}
}
