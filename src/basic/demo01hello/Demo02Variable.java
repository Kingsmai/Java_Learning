package basic.demo01hello;

/**
 * 变量：程序运行期间，内容能够发生改变的量
 *
 * 创建一个变量并使用：
 * 数据类型 变量名称; // 创建一个变量
 * 变量名称 = 数据值; // 赋值，右边的数据值，赋值交给左边的变量
 *
 * 一步到位方法：
 * 数据类型 变量名称 = 数据值; // 创建变量的同时，立即放入指定的位置
 */
public class Demo02Variable {
    public static void main(String[] args) {
        int num1; // 创建一个变量
        num1 = 10; // 给变量存入一个值
        System.out.println(num1); // 显示变量内容，10
        num1 = 20; // 替换原本的 10，变为 20
        System.out.println(num1); // 显示变量内容，20

        // 定义变量的过程中直接赋值
        int num2 = 30; // 定义新的变量名不能重复
        System.out.println(num2); // 30
        num2 = 35;
        System.out.println(num2); // 35

        System.out.println("==========="); // 分割线

        byte num3 = 30; // 右侧数值范围不能超过左侧数据类型的取值范围
        System.out.println(num3); // 30
        // byte num4 = 600; // 报错 byte 取值范围：-128 ~ 127

        System.out.println("==========="); // 分割线

        short num5 = 50;
        System.out.println(num5); // 50

        long num6 = 3000000000L; // 使用long类型的时候，超过整数取值范围，要用字母后缀L（建议大写）
        System.out.println(num6); // 300000000

        System.out.println("==========="); // 分割线

        float num7 = 2.5F;
        System.out.println(num7); // 2.5

        double num8 = 1.2;
        System.out.println(num8); // 1.2

        System.out.println("==========="); // 分割线

        char ch1 = 'A';
        System.out.println(ch1); // A
        char ch2 = '字';
        System.out.println(ch2); // 字

        System.out.println("==========="); // 分割线

        boolean var1 = true;
        System.out.println(var1); // true
        var1 = false;
        System.out.println(var1); // false

        // 将一个变量内容赋值给另一个变量
        boolean var2 = var1;
        System.out.println(var2); // false
    }
}