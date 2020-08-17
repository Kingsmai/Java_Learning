/**
 * Demo06Switch
 * 
 * 注意事项：
 * 1. case后面的数值（标签）不能重复
 * 2. switch后的小括号数据类型：
 * 2.1 基本数据类型：byte / short / char / int
 * 2.2 引用数据类型：String / enum
 * 3. switch语句格式可以很灵活，前后顺序可以颠倒，而且break可以省略（穿透）
 */
public class Demo05Switch {
    public static void main(String[] args) {
        int weekday = 1;
        switch (weekday) {
            // 找到weekday（表达式）的值
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("数据错误");
                break;
        }

        // switch穿透
        // 匹配哪一个case，就从该case开始往下运行，直到遇到break或者整体结束
        String action = "Wake Up";
        switch (action) {
            case "Wake Up":
                System.out.println("Wake up");
                System.out.println("Tidy up bed");
            case "Brush Teeth":
                System.out.println("Brush Your Teeth");
            default:
                System.out.println("Go to work");
        }
    }
}