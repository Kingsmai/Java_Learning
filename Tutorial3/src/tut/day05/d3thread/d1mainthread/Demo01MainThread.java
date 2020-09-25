package tut.day05.d3thread.d1mainthread;

/*
 * 主线程：执行主（main）方法的线程
 * 
 * 单线程程序：Java程序中只有一个线程
 * 执行从main方法开始，从上到下依次执行
 * 
 * JVM执行main方法，main方法会进入到栈内存
 * JVM会找操作系统开辟一条main方法通向CPU的执行路径
 * CPU就可以通过这个路径来执行main方法
 * 而这个路径有个名字，叫main（主）线程
 */
public class Demo01MainThread {

	public static void main(String[] args) {
		Person p1 = new Person("张三");
		p1.run();
		
		// 注意看，异常发生在主线程里面
		System.out.println(0 / 0); // Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		Person p2 = new Person("李四");
		p2.run();
	}
}
