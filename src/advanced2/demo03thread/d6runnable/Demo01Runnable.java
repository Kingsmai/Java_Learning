package advanced2.demo03thread.d6runnable;

/*
 * 创建多线程程序的第二种方式：实现Runnable接口
 * java.lang.Runnable
 *     Runnable接口应该由那些打算通过某一线程执行其实列的类来实现。类必须定义一个称为run的无参数方法
 * java.lang.Thread类的构造方法
 *     Thread(Runnable target) 分配新的 Thread对象。
 *     Thread(Runnable target, String name) 分配新的 Thread对象。
 *     
 * 实现步骤：
 *     1. 创建一个Runnable接口的实现类
 *     2. 在实现类中重写Runnable接口的run方法，设置线程任务
 *     3. 创建一个Runnable接口的实现类对象
 *     4. 创建Thread类对象，构造方法中传递Runnable接口的实现对象
 *     5. 调用Thread类中的start方法，开启新的线程执行run方法
 */
public class Demo01Runnable {

	public static void main(String[] args) {
		// 3. 创建一个Runnable接口的实现类对象
		RunnableImpl run = new RunnableImpl();
		// 4. 创建Thread类对象，构造方法中传递Runnable接口的实现对象
		Thread t = new Thread(run);
		// 5. 调用Thread类中的start方法，开启新的线程执行run方法
		t.start();
		
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + "->" + i);
		}
	}
}
