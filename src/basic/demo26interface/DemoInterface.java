package basic.demo26interface;

import java.util.ArrayList;
import java.util.List;

/*
 * java.util.list正是ArrayList所实现的接口
 * 
 * 接口作为方法的参数或返回值
 */
public class DemoInterface {

	public static void main(String[] args) {
		// 左边是接口名称，右边是实现类名称，多态写法
		List<String> list = new ArrayList<>();
		
		List<String> result = addnames(list);
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	public static List<String> addnames(List<String> list) {
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		return list;
	}
}
