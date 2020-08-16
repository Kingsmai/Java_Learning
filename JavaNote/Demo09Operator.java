/**
 * 一元运算符：需要一个数据才能进行操作：取反!，自增++，自减--
 * 二元运算符：需要两个数据才能进行操作：加+，赋值=，比较
 * 三元运算符：需要三个数据才能进行操作：? :
 * 
 * 三目运算符语法：变量名称 = 条件判断 ? 表达式A : 表达式B;
 * 若条件判断为真，执行表达式A，反之则表达式B
 * 
 * 注意事项：
 * 1. 需保证 表达式A 和 表达式B 的数据类型满足赋值运算符左侧的数据类型
 * 2. 三目运算符的结果必须被使用
 */
public class Demo09Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        // 判断 a > b 是否成立，如果成立，则 a 赋值给 max
        System.out.println("最大值" + max); // 20

        // int result = 3 > 4 ? 2.5 : 10; // 错误写法（2.5和result数据类型不一样）
        System.out.println(3 > 4 ? 2.5 : 10); // 这样可以，2.5会被短路忽略（前面直接判断常量）

        System.out.println(a > b ? a : b); // 20
        // a > b ? a : b; //错误写法（没使用）
    }
}