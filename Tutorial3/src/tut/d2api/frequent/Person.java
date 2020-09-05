package tut.d2api.frequent;

//import java.util.Objects;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/*
	 * 直接打印对象的地址值没有意义，需要重写Object类的toString方法
	 * 打印对象的属性
	 * eclipse通过Source -> Generate ToString快速生成
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	/*
	 * Object类的equals方法默认比较的是两个对象的地址值，没有意义
	 * 重写equals的方法，比较两个对象的属性（name, age）
	 * 问题：隐含着一个多态，无法使用子类特有的内容（属性和方法）
	 * Object obj = person2 = new Person("李四", 19);
	 * 解决：使用向下转型（强转）把obj类型转为Person
	 * 
	 * eclipse通过Source -> Generate HashCode and Equals快速生成
	 */
	@Override
	public boolean equals(Object obj) {
		// 如果传递的参数是自己(this)，直接返回true，提高程序效率
		if (this == obj)
			return true;
		// 如果传递的值是null, 直接返回false，提高程序效率
		if (obj == null)
			return false;
		// 判断，防止类型转换异常 ClassCastException
		// 以下语句相等于 obj instanceof Person
		if (getClass() != obj.getClass()) // 使用反射技术，判断obj是否是person类型
			return false;
		// 向下转型，把obj类型转为Person
		Person other = (Person) obj;
		// 比较两个对象的属性，一个对象是this，一个对象是obj
		// this可以不写
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		// intellj IDEA 的生成方法（真香！）：
//		return age == other.age && Objects.equals(name, other.name);
		return true;
	}
	


	/*
	 * 因为toString方法被重写了，这边测试用，返回对象地址值：
	 * 将Object.class的toString方法复制过来，创建新的toMem方法
	 * 也可以在主函数直接通过：Integer.toHexString(对象名.hashCode())返回地址值
	 */
	public String toMem() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
