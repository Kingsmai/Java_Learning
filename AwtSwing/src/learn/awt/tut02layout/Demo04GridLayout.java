package learn.awt.tut02layout;

import java.awt.*;

/*
    java.awt.GridLayout extends Object
    构造方法：
        GridLayout() 在单行中创建一个网格布局，每个组件的默认值为一列。
        GridLayout(int rows, int cols) 创建具有指定行数和列数的网格布局。
        GridLayout(int rows, int cols, int hgap, int vgap) 创建具有指定行数和列数的网格布局。
    常用方法：
        void setColumns(int cols) 将此布局中的列数设置为指定值。
        void setHgap(int hgap) 将组件之间的水平间隙设置为指定值。
        void setRows(int rows) 将此布局中的行数设置为指定值。
        void setVgap(int vgap) 将组件之间的垂直间距设置为指定值。
 */
public class Demo04GridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("计算器");

        // 1. 创建一个Panel对象，里面存放一个TextField组件
        Panel p1 = new Panel();
        p1.add(new TextField(30)); // 可以容纳30个字符
        // 2. 把当前这个Panel添加到frame的北边区域（Frame对象的默认布局管理器是BorderLayout）
        frame.add(p1, BorderLayout.NORTH);
        // 3. 创建一个Panel对象，并且设置他的布局管理器为GridLayout
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3, 5, 4, 4));
        // 4. 往Panel添加内容
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i + ""));
        }
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        // 5. 把当前Panel添加到frame中（默认Center就行）
        frame.add(p2);

        frame.pack();
        frame.setVisible(true);
    }
}
