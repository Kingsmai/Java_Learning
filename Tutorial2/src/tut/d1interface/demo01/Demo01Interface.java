package tut.d1interface.demo01;

/*
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型
 * 接口最重要的内容就是其中的，抽象方法
 * 
 * 定义一个接口的格式：
 * public interface 接口名称 {
 *     // 接口内容
 * }
 * 
 * 备注： 一般的class编译之后后缀会变成 .java -> .class
 * 换成interface之后编译生成的字节码文件仍然是 .java -> .class
 * 
 * 如果是 Java7，接口中可以包含的内容有：
 * 1. 常量
 * 2. 抽象方法
 * 如果是 Java8，还可以额外包含有：
 * 3. 默认方法
 * 4. 静态方法
 * 如果是 Java9，还可以额外包含有：
 * 5. 私有方法
 * 
 * 接口使用的步骤：
 * 1. 接口不能直接使用，必须有一个“实现类”来实现该接口
 * 格式：
 * public class 实现类名称 implements 接口名称 {
 *     // 代码
 * }
 * 2. 接口的实现类必须覆盖重写接口中所有的抽象方法
 * 实现：去掉abstract关键字，加上方法体大括号
 * 3. 创建实现类的对象
 * 
 * 注意事项：
 * 1. 如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类自己就必须是抽象类
 */
public class Demo01Interface {

	public static void main(String[] args) {
		// 错误写法，不能直接
//		MyInterfaceAbstract inter = new MyInterfaceAbstract();
		
		// 创建实现类的对象使用
		MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
		impl.methodAbs1();
		impl.methodAbs2();
		impl.methodAbs3();
		impl.methodAbs4();
	}
}
