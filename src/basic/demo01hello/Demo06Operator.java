package basic.demo01hello;

/**
 * 赋值运算符：
 * 基本：=
 * 复合：
 * +=   a += 1  相等于  a = a + 1
 * +=   b += 1  相等于  b = b + 2
 * +=   c += 1  相等于  c = c + 3
 * +=   d += 1  相等于  d = d + 4
 * +=   e += 1  相等于  e = e + 5
 * 
 * 注意事项：
 * 只有变量才能使用赋值运算符，常量不行
 * 复合赋值运算符其中隐含了一个强制类型转换
 */
public class Demo06Operator {
    public static void main(final String[] args) {
        int a = 10;
        a += 5; // a = a + 5
        System.out.println(a); // 15

        int x = 10;
        x %= 3; // x = 10 % 3
        System.out.println(x); // 1

        // 50 = 30; // 报错，常量不能进行赋值

        byte num = 20;
        num += 5;
        System.out.println(num); // 25 （int）
    }
}