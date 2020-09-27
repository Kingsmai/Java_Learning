package advanced2.demo03thread.d4setname;

/*
 * 设置线程的名称：（了解）
 *     1. 使用Thread类中的方法setName(名字)
 *         void setName(String name) 将此线程的名称更改为等于参数 name 。
 *     2. 创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程起一个名字
 *         Thread(String name) 分配新的 Thread对象。  
 */
public class MyThread extends Thread {
	
	public MyThread() {}
	
	public MyThread(String name) {
		super(name); // 把线程名称传递给父类，让父类（Thread）给子线程起一个名字
	}

	@Override
	public void run() {
		// 获取线程名称
		System.out.println(Thread.currentThread().getName());
	}
}
