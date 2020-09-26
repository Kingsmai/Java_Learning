package learn.awt.tut01container;

import java.awt.*;

/*
    java.awt.Panel extends Container
    Panel的默认布局管理器是flowLayout
    构造方法：
        Panel() 使用默认布局管理器创建新面板。
        Panel(LayoutManager layout) 使用指定的布局管理器创建新面板。
    常用方法：
        Component add(Component comp) 将指定的组件追加到此容器的末尾。

    文本输入框控件：
        java.awt.TextField extends TextComponent extends Component
        构造方法：
            TextField() 构造一个新的文本字段。
            TextField(String text) 构造使用指定文本初始化的新文本字段。

    按钮控件：
        java.awt.Button extends Component
        构造方法：
            Button() 构造一个带有空字符串的按钮作为其标签。
            Button(String label) 构造具有指定标签的按钮。
 */
public class Demo02Panel {
    public static void main(String[] args) {
        // 1. 创建一个window对象：因为panel以及其他的容器都不能独立存在，必须依附于window存在
        Frame frame = new Frame("演示Panel");
        // 2. 创建Panel对象
        Panel panel = new Panel();
        // 3. 创建一个文本框和一个按钮，并且把他们放入到panel容器中
        panel.add(new TextField("这是一个测试文本"));
        panel.add(new Button("测试按钮"));
        // 4. 把panel放入到window中
        frame.add(panel);
        // 5. 设置window的位置以及大小
        frame.setBounds(100, 100, 500, 300);
        // 6. 设置window可见
        frame.setVisible(true);
    }
}
