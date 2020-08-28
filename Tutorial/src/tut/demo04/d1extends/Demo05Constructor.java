package tut.demo04.d1extends;

/*
 * 继承关系中，父子类构造方法的访问特点：
 * 
 * 1. 子类构造方法当中，有一个隐含的”super()“调用，所以一定是先调用的父类构造，后执行子类构造
 * 2. 子类构造可以通过super关键字来调用父类重载构造
 * 3. super的父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造
 * 
 * 注意事项：
 * 1. 子类必须调用父类构造方法，不写则赠送super(); 写了则用指定的super调用
 * 2. super只能有一个，还必须是第一个语句位置
 */
public class Demo05Constructor {
	public static void main(String[] args) {
		Son son = new Son();
		// 先打印父类构造方法，然后再打印子类构造方法
	}
}
