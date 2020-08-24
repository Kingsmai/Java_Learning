package tut.demo01.d4objectoriented;
/*
 * private 关键词
 * 
 * 问题描述：定义person的年龄age时，无法阻止不合理的数值被设置进来
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 * 
 * 一旦使用private进行修饰，那么本类当中仍然可以随意访问，
 * 但超出本类范围之外就不能再【直接访问】了
 * 
 * 间接访问private成员变量，就是定义一对Getter/Setter方法
 */
public class Person {
	String name;
	private int age;
	
	public void show() {
		System.out.println("我叫：" + name + "，年龄：" + age);
	}
	
	/*
	 * 间接访问
	 * 这个成员方法，专门用于向age设置数据
	 * 必须有参数无返回，参数类型得和你要set的数据保存一致
	 * 名称规则 set首字母变大写
	 */
	public void setAge(int num) {
		// 判断是否为合理数值
		if (num < 100 && num > 0) { // 合理情况
			age = num;			
		} else {
			System.out.println("数据不合理");
		}
	}
	
	/*
	 * 返回值必须和age成员变量一样
	 * 这个成员方法，专门用于获取age的数据
	 * 必须没有参数有返回值， 返回类型得和你要get的数据保存一致
	 * 名称规则 get首字母变大写
	 */
	public int getAge() {
		return age;
	}
}
