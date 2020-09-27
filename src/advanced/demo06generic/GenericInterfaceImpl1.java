package advanced.demo06generic;

/*
 * 含有泛型的接口，第一种使用方式：定义接口的实现类，实现接口，并且指定接口的泛型
 * public interface Iterator<E> {
 * 	   E next();
 * }
 * Scanner 类实现了Iterator接口，并指定接口的泛型为字符串，所以重写的next方法泛型默认就是字符串
 * public final class Scanner implements Iterator<String> {
 * 	   public String next() {}
 * }
 */
public class GenericInterfaceImpl1 implements GenericInterface<String> {

	@Override
	public void method(String i) {
		System.out.println(i);
	}
}
