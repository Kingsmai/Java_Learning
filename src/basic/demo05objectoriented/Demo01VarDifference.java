package basic.demo05objectoriented;
/*
 * 局部变量和成员变量：
 * 
 * 1. 定义的位置不一样【重点】
 * 局部变量：在方法的内部
 * 成员变量：在方法的外部，直接写在类当中
 * 
 * 2. 作用范围不一样【重点】
 * 局部变量：在方法内部才可以使用，出了方法就不能用了
 * 成员变量：整个类都可以用
 * 
 * 3. 默认值不一样【重点】
 * 局部变量：没有默认值，如果想要使用，必须手动进行赋值
 * 成员变量：如果没有赋值，会有默认值，规则和数组一样
 * 
 * 4. 内存的位置不一样（了解）
 * 局部变量：位于栈内存
 * 成员变量：位于堆内存
 * 
 * 5. 生命周期不一样（了解）
 * 局部变量：随着方法诞生而诞生，随着方法出栈而消失
 * 成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
 */
@SuppressWarnings("unused")
public class Demo01VarDifference {
	String name; // 成员变量
	
	private void methodA() {
		int num = 16; // 局部变量
		System.out.println(num); // 16
	}
	
	private void methodB(int param) { // 方法的参数就是局部变量
		int age;
//		System.out.println(num); // 错误，num的作用域不在这里
//		System.out.println(age); // 错误，没赋值，不能用
		System.out.println(name); // null（成员变量）
		System.out.println(param); //参数在方法调用的时候，必然会被赋值
	}
}
