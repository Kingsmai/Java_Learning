package javaguis.awt.tut01container;

import java.awt.*;

/*
    java.awt.Frame extends Window extends Container
    构造方法：
        Frame(String title) 构造一个具有指定标题的新的，最初不可见的 Frame对象。
    常用方法（继承自java.awt.Window类）：
        Component add(Component comp) 将指定的组件追加到此容器的末尾。
        void setSize(int width, int height) 调整此组件的大小，使其宽度为 width ，高度为 height 。
        void setLocation(int x, int y) 将此组件移动到新位置。
        void setBounds(int x, int y, int width, int height) 移动并调整此组件的大小。
        void setVisible(boolean b) 显示或隐藏此 Window具体取决于参数 b的值。
 */
public class Demo01Window {
    public static void main(String[] args) {
        // 1. 创建一个窗口对象
        Frame frame = new Frame("测试Window窗口");
        // 2. 指定窗口的位置，大小（单位：像素）
        frame.setLocation(100, 100);
        frame.setSize(500, 300);
        // 3. 设置窗口对象可见
        frame.setVisible(true);
    }
}
