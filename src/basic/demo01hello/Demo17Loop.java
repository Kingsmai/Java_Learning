package basic.demo01hello;

/**
 * 循环结构四部分：
 * 1. 初始化语句：在循环开始最初执行，只做唯一一次
 * 2. 条件判断：如果成立，循环继续；反之，循环终止
 * 3. 循环体：重复要做的事情
 * 4. 步进语句：每次循环之后，需要进行的扫尾工作（每循环都要做一次）
 */
public class Demo17Loop {
    public static void main(String[] args) {
        // for (①初始化语句；②布尔表达式；④步进表达式) {
        //     ③循环体
        // }
        for (int i = 0; i < 10; i++) {
            System.out.println("For操作第 " + i + " 次");
        }
        System.out.println("For循环结束");

        // 初始化语句
        // while (布尔表达式) {
        //     循环体
        //     步进表达式
        // }
        int j = 0;
        while (j < 10) {
            System.out.println("While操作第 " + j + " 次");
            j++;
        }
        System.out.println("While循环结束");

        // 初始化语句
        // do {
        //     循环体
        //     步进表达式
        // } while (布尔表达式);
        int k = 0;
        do {
            System.out.println("doWhile操作第 " + k + " 次");
        } while (k < 10);
        System.out.println("doWhile循环结束");
    }
}