package tut.demo02.d4arraylist;
/*
 * 定义一个数组，用来存储三个Person对象
 * 
 * 数组有个缺点：
 * 一旦创建，程序运行期间长度不可发生改变
 */
public class Demo01Array {
	public static void main(String[] args) {
		// 首先创建一个长度为3的数组，里面用来存放Person类型的对象
		Person[] array = new Person[3];
		
		Person one = new Person("张三", 18);
		Person two = new Person("李四", 28);
		Person three = new Person("王五", 38);
		
		// 将one当中的地址值赋值到数组的0号援助位置
		array[0] = one;
		array[1] = two;
		array[2] = three;
		
		System.out.println(array[0]); // 地址
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		Person person = array[1];
		System.out.println(person.getName()); // 李四
		System.out.println(array[1].getName()); // 李四
	}
}
