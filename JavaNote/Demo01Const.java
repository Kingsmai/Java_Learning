/**
 * 编译的时候 javac -encoding utf8 JavaConst.java
 * 就可以编译UTF-8编码的文当
 */
/**
 * Java常量
 * 字符串常量：双引号引起来的
 * 字符常量：单引号引起来的
 * 整数常量：数字，没有小数点
 * 浮点数常量：数字，有小数点
 * 布尔常量：true false
 * 空常量：null
 */
public class Demo01Const {
    public static void main(String[] args) {
        // 字符串常量
        System.out.println("这是UTF-8编码的文档");
        System.out.println("ABC");
        System.out.println("");
        System.out.println("Xyz");
        System.out.println("123Abc");

        // 字符常量
        System.out.println('A');
        System.out.println('z');
        System.out.println('1');
        // System.out.println(''); // 字符常量不能为空
        // System.out.println('Az'); // 字符常量不能有两个字符

        // 整数常量
        System.out.println(1024);
        System.out.println(-2048);

        // 浮点数常量
        System.out.println(3.1415);
        System.out.println(-5.16);

        // 布尔常量
        System.out.println(true);
        System.out.println(false);

        // 空常量（不能直接用来打印输出）
        // System.out.println(null);
    }
}