package basic.demo01hello;

/**
 * 运算符：进行特定操作的符号
 * 表达式：用运算符连接起来的式子叫做表达式
 * 
 * 四则运算：+ - * /
 * 取模：%
 * 
 * 加号 + 用法：
 * 1. 对于数值，加法
 * 2. char类型，会提升为int，然后再计算
 * char类型字符和int字符之间的关系：ASCII 和 Unicode
 * 3. 字符串String（首字母大写，并不是关键字）字符串相加是链接操作
 * 任何数据类型和字符串链接，都会转为字符串
 * 
 * 自增：++ 让一个变量 +1
 * 自减：-- 让一个变量 -1
 * 使用格式：可写在变量名之前或之后
 * 使用方式：
 * 1. 单独使用：不和其它操作混合，自己独立成为一个步骤
 *  。单独使用时，自增自减符在变量名的前后位置，效果是一样的
 * 2. 混合使用：和其它操作混合，赋值、打印等
 *  。前++，先运算，再使用
 *  。后++，先使用，再运算
 * 注意事项：只有变量才能用自增、自减运算符，常量不可发生改变，所以不能用
 */
public class Demo05Operator {
    public static void main(String[] args) {
        System.out.println(256 + 512); // 768

        int a = 16;
        int b = 32;
        System.out.println(a - b); // -16
        System.out.println(b * 2); // 64

        int x = 10;
        int y = 3;
        int result1 = x / y;
        System.out.println(result1); // 3
        int result2 = x % y;
        System.out.println(result2); // 1

        double result3 = x + 2.5;
        System.out.println(result3); // 12.5

        /**
         * 加号 + 用法：
         */
        String str1 = "Hello";
        System.out.println(str1); // Hello
        System.out.println(str1 + "World"); // HelloWorld，字符串链接

        String str2 = "Java";
        System.out.println(str2 + 20); // String + int -> Java20，20转换为字符串

        // 优先级问题
        System.out.println(str2 + 20 + 80); // Java2080，从左到右进行运算
        System.out.println(str2 + (20 + 80)); // Java100，（）优先级比较高

        /**
         * 自增、自减
         */
        int num1 = 10;
        System.out.println(num1); // 10
        num1++; // 前++
        System.out.println(num1); // 11
        ++num1; // 后++
        System.out.println(num1); // 12

        System.out.println(""); // 12

        int num2 = 20;
        System.out.println(++num2); // 21
        System.out.println(num2); // 21
        int num3 = 40;
        System.out.println(num3++); // 40
        System.out.println(num3); // 41

        System.out.println(""); // 12

        int p = 80;
        int q = 160;
        int result4 = ++p + q--; // 81 + 160
        System.out.println(result4); // 241
        System.out.println(p); // 81
        System.out.println(q); // 159

        // 30++; // 报错，常量不能自增自减
        // "Hello"++; // 报错
    }
}