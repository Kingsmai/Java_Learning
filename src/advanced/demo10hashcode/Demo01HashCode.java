package advanced.demo10hashcode;

/*
 * 哈希值：是一个十进制的整数，由系统随机给出（就是一个对象的地址值，是一个逻辑地址，是模拟出来的地址，不是数据实际存储的物理地址）
 * 在Object类有一个方法，可以获取对象的哈希值
 *     int hashCode() 返回对象的哈希码值。  
 * hashCode方法的源码：
 *     public native int hashCode();
 *     native：代表该方法调用的是本地操作系统的方法
 */
public class Demo01HashCode {

	public static void main(String[] args) {
		// Person类继承了Object类，所以可以使用Object类的hashCode方法
		Person p1 = new Person();
		int h1 = p1.hashCode();
		System.out.println(h1); // 2104457164 | 1
		
		Person p2 = new Person();
		int h2 = p2.hashCode();
		System.out.println(h2); // 1521118594 | 1
		
		/*
		 * toString方法的源码：
		 *     public String toString() {
		 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
		 *     }
		 * 直接输出对象名就是返回该对象哈希值的十六进制形式
		 */
		System.out.println(p1); // tut.day03.d3hashcode.Person@7d6f77cc
		System.out.println(p2); // tut.day03.d3hashcode.Person@5aaa6d82
		System.out.println(p1==p2); // 重写hashCode方法之后依然是false
		
		/*
		 * String类的哈希值
		 * String类重写了Object类的hashCode方法
		 *     public int hashCode() {
		 *         int h = hash;
		 *         if (h == 0 && value.length > 0) {
		 *             hash = h = isLatin1() ? StringLatin1.hashCode(value) : StringUTF16.hashCode(value);
		 *         }
		 *         return h;
		 *     }
		 */
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.hashCode()); // 96354
		System.out.println(s2.hashCode()); // 96354
		
		// 以下两个纯属巧合，字符串不一样，哈希值是一样的
		System.out.println("重地".hashCode()); // 1179395
		System.out.println("通话".hashCode()); // 1179395
	}
}
