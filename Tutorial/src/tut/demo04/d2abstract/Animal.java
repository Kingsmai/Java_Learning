package tut.demo04.d2abstract;

/*
 * 抽象方法：就是加上abstract关键字，然后去掉大括号，直到分号结束
 * 抽象类：抽象方法所在的类，必须是抽象类，在class之前写上abstract
 * 
 * 如何使用抽象类和抽象方法：
 * 1. 不能直接创建new抽象类对象。
 * 2. 必须用一个子类来继承抽象类对象
 * 3. 子类必须覆盖重写抽象父类当中所有的抽象方法
 * 覆盖重写（实现）：去掉抽象方法的abstract关键字，然后补上方法体{}
 * 4. 创建子类对象进行使用
 */
public abstract class Animal {
	// 抽象方法，代表吃东西，但是具体吃什么（大括号内容），不确定
	public abstract void eat();
	
	// 这是普通的成员方法
	public void normalMethod() {
		
	}
}
