package basic.demo16extends;

/*
 * 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
 * 
 * 直接通过子类对象访问成员变量：
 * 等号左边是谁，则优先用谁，没有就向上找
 * 间接通过成员方法访问成员变量：
 * 该方法属于谁，就优先用谁，没有则向上找
 * 
 * 局部变量：直接写
 * 本类的成员变量：this.成员变量
 * 父类的成员变量：super.成员变量
 * 
 * 在父子类的继承关系中，创建子类对象，访问成员方法的规则：
 * 创建的对象是谁，就优先用谁，如果没有就向上找
 * 
 * 注意事项：
 * 无论是成员方法还是成员变量，如果没有都是向上找，绝对不会向下找子类的
 */
public class Demo02ExtendsField {
	public static void main(String[] args) {
		Father father = new Father(); // 创建父类对象
		System.out.println(father.numFather); // 只能使用父类的东西，没有任何子类内容
		System.out.println("=============");
		
		Son son = new Son(); // 创建子类对象
		System.out.println(son.numFather); // 10
		System.out.println(son.numSon); // 20
		System.out.println("=============");
		
		// 等号左边是谁，就优先用谁
		System.out.println(son.num); // 优先子类，200
//		System.out.println(son.abc); // 到处都没有，编译报错
		System.out.println("=============");
		
		// 这个方法是子类的，优先用子类的，没有再向上找
		son.methodSon(); // 200
		// 这个方法是在父类当中定义了
		son.methodFather(); // 100
		System.out.println("=============");
		
		son.method(); // 子类重名方法执行
	}
}
