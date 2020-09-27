package javaguis.awt.tut02layout;

import java.awt.*;

public class Demo01FlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("测试FlowLayout");

        // 1. 通过setLayout方法设置容器的布局管理器
        // FlowLayout(对齐方式, 横间距, 纵间距)
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20)); // 左对齐（默认）
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // 居中对齐
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20)); // 右对齐
        // 2. 添加多个按钮到frame中
        for (int i = 1; i <= 100; i++) {
            frame.add(new Button("按钮" + i));
        }
        // 3. 设置最佳大小，pack方法
        frame.pack();

        frame.setVisible(true);
    }
}
