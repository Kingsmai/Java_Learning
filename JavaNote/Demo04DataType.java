/**
 * 当数据类型不一样，将会发生数据转换
 * 
 * 自动类型转换（隐式）
 * 1. 特点：代码不需要进行特殊处理，自动完成
 * 2. 规则：数据范围从小到大
 * 
 * 强制类型转换（显式）
 * 1. 特点：代码需要进行特殊处理，不能自动完成
 * 2. 格式：范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的类型
 * 3. 问题：会丢失精度（所以不推荐使用）
 * 
 * 1. byte、short、char这三种类型都可以发生数学运算
 * 2. byte、short、char这三种类型在运算的时候，会提升为int，再进行计算
 * 3. 布尔类型不能发生任何类型转换
 */
public class Demo04DataType {
    public static void main(String[] args) {
        /**
         * 自动转换
         */
        System.out.println(1024); // 整数，默认是int类型
        System.out.println(3.14); // 浮点数，默认是float类型

        long num1 = 100; // 左边是long类型，右边是int类型
        // int -> long，这行代码发生自动类型转换
        System.out.println(num1); // 100
        
        double num2 = 2.5F; // 左边是double类型，右边是float类型
        // float -> double
        System.out.println(num2); // 2.5

        float num3 = 30L;
        // long -> float
        System.out.println(num3); // 30

        /**
         * 强制转换
         */
        // int num4 = 100L; // 报错，因为右边取值大于左边整数型取值，不能自动转换
        int num5 = (int) 100L; // 强制转换为int型 100
        System.out.println(num5);
        
        int num6 = (int) 7805082439L;
        System.out.println(num6); // -784852153（数据溢出）

        int num7 = (int) 3.14;
        System.out.println(num7); // 3（这不是四舍五入，所有小数都会被舍弃掉）

        /**
         * 数学运算
         */
        char ch1 = 'A';
        System.out.println(ch1 + 1); // 66，A翻译为ASCII码 => 65 + 1

        byte num8 = 40;
        byte num9 = 50;
        // byte result1 = num8 + num9; // 报错，会提升为int，再进行计算
        int result2 = num8 + num9;
        System.out.println(result2); // 90

        short num10 = 60;
        short result3 = (short) (num8 + num10); //先提升为int，运算之后，再强制转换为short
        System.out.println(result3); // 得确保逻辑上的真实大小不超过short，否则也会数据溢出
    }
}