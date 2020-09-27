package javaguis.awt.tut02layout;

import java.awt.*;

public class Demo03BorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("测试FlowLayout");

        // 1. 给frame设置BorderLayout布局管理器
        // BorderLayout(水平间距, 垂直间距)
        frame.setLayout(new BorderLayout(30 ,10));
        // 2. 往frame的指定区域添加组件
        frame.add(new Button("北侧按钮"), BorderLayout.NORTH); // 将此按钮添加到frame容器的北侧
        frame.add(new Button("南侧按钮"), BorderLayout.SOUTH); // 将此按钮添加到frame容器的北侧
//        frame.add(new Button("中部按钮"), BorderLayout.CENTER); // 将此按钮添加到frame容器的北侧
//
//        frame.add(new TextField("测试文本框")); // 会覆盖掉中部按钮（默认没有指定位置就是中部）

        Panel p = new Panel();
        p.add(new Button("中间按钮"));
        p.add(new TextField("测试文本框"));

        frame.add(p); // 默认添加在中部

        frame.pack();
        frame.setVisible(true);
    }
}
