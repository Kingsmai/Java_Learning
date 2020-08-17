/**
 * public static void 方法名称() {
 *     代码块
 * }
 * 方法名称定义用小驼峰
 * 代码块：大括号中的代码语句
 * 
 * 方法定义先后顺序无所谓
 * 方法定义不能产生嵌套包含关系
 * 定义之后，不会执行，需要调用
 */
public class Demo10Method {
    public static void main(String[] args) {
        // 调用
        farmer();
        seller();
        chef();
        me();
    }
    // 农民伯伯
    public static void farmer() {
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");
    }

    // 小商贩
    public static void seller() {
        System.out.println("运输到农贸市场");
        System.out.println("抬高价格");
        System.out.println("吆喝");
        System.out.println("卖给厨子");
    }

    // 厨子
    public static void chef() {
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }

    // 我
    public static void me() {
        System.out.println("吃");
    }
}