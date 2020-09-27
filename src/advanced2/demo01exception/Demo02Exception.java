package advanced2.demo01exception;

/*
 * 异常的产生过程分析（分析异常怎么产生的，如何处理异常）
 */
public class Demo02Exception {

	public static void main(String[] args) {
		// 创建int类型的数组并赋值
		int[] arr = {1, 2, 3};
		int e = getElement(arr, 3);
		System.out.println(e);
	}
	
	/*
	 * 定义一个方法，获取指定索引处的元素
	 * 参数：
	 *     int[] arr
	 *     int index
	 */
	public static int getElement(int[] arr, int index) {
		int elem = arr[index];
		return elem;
	}
}
