/**
 * 与（并且）&&     全 true 为 true
 * 或（或者）||     有 true 为 true
 * 非（取反）!      true 变 false，false 变 true
 * 
 * 短路
 * 与 && ，或 || 具有短路效果
 * 
 * 注意事项：
 * 1. 逻辑运算符只能用于布尔值
 * 2. 与或需左右有布尔值，取反只要一个
 * 3. 与或如果有多个条件，可以连着写
 */
public class Demo08Logic {
    public static void main(String[] args) {
        System.out.println(true && false); // false
        System.out.println(true && true); // true
        System.out.println(3 < 4 && 10 > 5); // true && true
        
        System.out.println(true || false); // true（这边已经短路了，后面的false是dead code）
        System.out.println(true || true); // true
        System.out.println(false || false); // false

        System.out.println(true); // true
        System.out.println(!true); // false

        int a = 10;
        System.out.println(3 > 4 && ++a < 100); // false && ... 短路
        System.out.println(a); // 10，后面的 ++a 不运算了

        int b = 20;
        System.out.println(3 < 4 || ++b < 100); // true || ... 短路
        System.out.println(b); // 20，同理
    }
}