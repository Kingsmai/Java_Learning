package advanced.demo04collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * java.util.Collection接口
 * 	所有单列集合的最顶层接口，里边定义了所有单列集合共性的方法
 * 	任意的单列集合都可以使用Collection接口中的方法。
 * 
 * 共性的方法：
 * public boolean add(E e)`：  把给定的对象添加到当前集合中 。
 * public void clear()` :清空集合中所有的元素。
 * public boolean remove(E e)`: 把给定的对象在当前集合中删除。
 * public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
 * public boolean isEmpty()`: 判断当前集合是否为空。
 * public int size()`: 返回集合中元素的个数。
 * public Object[] toArray()`: 把集合中的元素，存储到数组中。
 */
public class Demo01Collection {

	public static void main(String[] args) {
		// 创建集合对象，可以使用多态
		Collection<String> collection = new ArrayList<>();
		System.out.println(collection); // [], toString方法被重写了
		
		/*
		 * public boolean add(E e)：  把给定的对象添加到当前集合中
		 * 返回值是布尔值，一般都返回true，所以可以不用接收
		 */
		boolean b1 = collection.add("刘一");
		System.out.println("b1: " + b1); // b1: true
		System.out.println(collection); // [张三]
		collection.add("陈二");
		collection.add("张三");
		collection.add("李四");
		collection.add("王五");
		collection.add("赵六");
		collection.add("孙七");
		collection.add("周八");
		collection.add("吴九");
		collection.add("郑十");
		System.out.println(collection); // [刘一, 陈二, 张三, 李四, 王五, 赵六, 孙七, 周八, 吴九, 郑十]
		System.out.println("==================");
		
		/*
		 * public boolean remove(E e): 把给定的对象在当前集合中删除
		 * 返回值是一个Boolean值，
		 * 	集合中存在元素，删除元素，返回true；
		 * 	集合中不存在元素，删除失败，返回false
		 */
		boolean b2 = collection.remove("赵六");
		System.out.println("b2: " + b2); // b2: true
		System.out.println(collection); // [刘一, 陈二, 张三, 李四, 王五, 孙七, 周八, 吴九, 郑十]
		
		boolean b3 = collection.remove("赵四"); // 没有此元素
		System.out.println("b3: " + b3); // b3: false
		System.out.println(collection); // [刘一, 陈二, 张三, 李四, 王五, 孙七, 周八, 吴九, 郑十]
		System.out.println("==================");
		
		/*
		 * public boolean contains(E e): 判断当前集合中是否包含给定的对象
		 * 	包含返回true
		 * 	不包含返回false
		 */
		boolean b4 = collection.contains("李四");
		System.out.println("b4: " + b4); // b4: true
		boolean b5 = collection.contains("李六");
		System.out.println("b5: " + b5); // b5: false
		System.out.println("==================");
		
		/*
		 * public boolean isEmpty(): 判断当前集合是否为空
		 * 	空：返回true
		 * 	非空：返回false
		 */
		boolean b6 = collection.isEmpty();
		System.out.println("b6: " + b6); // b6: false
		System.out.println("==================");
		
		/*
		 * public int size(): 返回集合中元素的个数
		 */
		int size = collection.size();
		System.out.println("size: " + size); // 9
		System.out.println("==================");
		
		/*
		 * public Object[] toArray()`: 把集合中的元素，存储到数组中
		 */
		Object[] arr = collection.toArray();
		System.out.println(arr); // [Ljava.lang.Object;@2d363fb3
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		/*
		 * public void clear()：清空集合中所有的元素，但是不删除集合
		 */
		collection.clear();
		System.out.println(collection); // []
		System.out.println(collection.size()); // 0
		System.out.println(collection.isEmpty()); // true
	}
}
