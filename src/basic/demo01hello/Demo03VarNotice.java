package basic.demo01hello;

/**
 * 变量注意事项
 * 1. 如果创建多个变量，变量名不能重复
 * 2. 对于 float 和 long 类型，字母后缀F和L不要丢掉
 * 3. 如果用 byte 和 short 类型，右侧数据值不能超过左侧类型取值范围
 * 4. 没有进行赋值的变量，不能直接使用
 * 5. 变量使用不能超过作用域范围
 * 【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止
 * 6. 可以通过一个语句创建多个变量，不推荐
 */
public class Demo03VarNotice {
    public static void main(String[] args) {
        int num1 = 10; // 创建了num1变量
        // int num1 = 20; // 报错，又创建了num1变量

        int num2; // 定义变量，但没有赋值
        // System.out.println(num2); // 报错，变量没有数据

        // System.out.println(num3); // 报错，创建变量之前，不能使用
        int num3 = 20;

        {
            int num4 = 40;
            System.out.println(num4); // 40
        }
        // System.out.println(num4); // 报错，变量在作用域之外

        int num4 = 80; // 因为上面num4的作用域结束了，消失了，所以可以重定义
        System.out.println(num4); // 80

        int a = 10;
        int b = 20;
        int c = 30;
        int d, e, f;
        int g = 40, h = 50;
    }
}