/**
 * 用来选择
 * 简单的运算可以用三目运算符进行代替
 */
public class Demo03IfElse {
    public static void main(String[] args) {
        System.out.println("看到一家网吧，准备进去打一把游戏");
        int age = 16; // 我的年龄
        if (age >= 18) {
            // 如果年满18岁，可以进入
            System.out.println("进入王八，开始打游戏");
            System.out.println("遇到猪队友，开始骂人");
            System.out.println("感觉不爽，结账，出门");
        } else {
            // 如果不超过18岁
            System.out.println("年龄太小了，被老板轰出去");
        }
        System.out.println("回家吃饭");

        System.out.println("=========================");
        
        // 判断奇偶数
        int a = 13;
        if (a % 2 == 0) {
            // 如果除以2，余数为零
            System.out.println("a: " + a + "是偶数");
        } else {
            // 如果除以2，余数不为零
            System.out.println("a: " + a + "是基数");
        }
    }
}