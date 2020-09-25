package tut.day05.d3thread.d5sleep;

/*
 * static void sleep(long millis) 导致当前正在执行的线程休眠（暂时停止执行）指定的毫秒数，具体取决于系统计时器和调度程序的精度和准确性。
 * 毫秒数结束之后，线程继续执行
 */
public class Demo01Sleep {

	public static void main(String[] args) {
		// 模拟秒表
		for(int i = 1; i <= 60; i++) {
			System.out.println(i);
			
			// 使用Thread类的sleep方法让程序睡眠1秒钟
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
