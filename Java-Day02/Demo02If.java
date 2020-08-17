/**
 * If 判断
 */
public class Demo02If {
    public static void main(String[] args) {
        System.out.println("看到一家网吧，准备进去打一把游戏");
        int age = 16; // 我的年龄
        if (age >= 18) { // 如果年满18岁，可以进入
            System.out.println("进入王八，开始打游戏");
            System.out.println("遇到猪队友，开始骂人");
            System.out.println("感觉不爽，结账，出门");
        }
        System.out.println("回家吃饭");
    }
}