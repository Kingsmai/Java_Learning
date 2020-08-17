/**
 * byte / short / char，如果右侧赋值没有超过范围
 * javac编译器会自动隐含补上转换(byte)(short)(char)
 * 1. 没有超过左侧范围，编译器自动不上强转
 * 2. 超过左侧范围，编译器报错。
 */
public class Demo11Notice {
    public static void main(String[] args) {
        byte num1 = /* (byte) */ 30; // 没超过byte范围
        System.out.println(num1); // 30
        // byte num2 = 128; // 报错，超过数据类型范围
        char ch1 = /* (char) */ 65;
        System.out.println(ch1); // A

        System.out.println("=============");

        short a = 5;
        short b = 16;
        // short result = a + b; // 报错，左侧需要是int类型
        // short + short -提升-> int + int
        int result1 = a + b;
        System.out.println(result1); // 21

        // 编译器的常量优化
        // 以下代码在编译过程中，直接就是：short result2 = 21
        // 在运行过程中，不占用内存进行计算 5 + 16
        // 不能有变量参与其中，否则报错
        short result2 = 5 + 16;
        System.out.println(result2); // 21
    }
}