package learn.awt.tut02layout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    java.awt.CardLayout extends Object
    将容器中的每个组件视为卡片。 一次只能看到一张卡片，而容器则充当一叠卡片。
    构造方法：
        CardLayout() 创建一个大小为零的新卡片布局。
        CardLayout(int hgap, int vgap) 创建具有指定水平和垂直间隙的新卡片布局。
    常用方法：
        void first(Container parent) 翻转到容器的第一张卡片。
        void last(Container parent) 翻转到容器的最后一张卡片。
        void previous(Container parent) 翻转到指定容器的上一张卡片。
        void next(Container parent) 翻转到指定容器的下一张卡片。
        void show(Container parent, String name) 使用 addLayoutComponent翻转到使用指定的 name添加到此布局的组件。
 */
public class Demo07CardLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("测试CardLayout");

        // 1. 创建一个 Panel 用来存储多张卡片
        Panel p1 = new Panel();
        // 2. 创建 CardLayout 对象，并且把该对象设置给之前创建的容器
        CardLayout cardLayout = new CardLayout();
        p1.setLayout(cardLayout);
        // 3. 往 Panel 中存储多个组件
        String[] names = {"第一张", "第二张", "第三张", "第四张", "第五张"};
        for (int i = 0; i < names.length; i++) {
            p1.add(names[i], new Button(names[i]));
        }
        // 4. 把 Panel 放到 frame 的中间区域
        frame.add(p1);

        // 5. 创建另外一个 Panel，用来存储另外一个按钮组件
        Panel p2 = new Panel();
        // 6. 创建五个按钮组件
        Button b1 = new Button("上一张");
        Button b2 = new Button("下一张");
        Button b3 = new Button("第一张");
        Button b4 = new Button("最后一张");
        Button b5 = new Button("第三张");
        // 7. 创建一个事件监听器，监听按钮的点击动作
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionCommand = e.getActionCommand(); // 这个字符串其实就是按钮上的文字
                switch (actionCommand) {
                    case "上一张":
                        cardLayout.previous(p1);
                        break;
                    case "下一张":
                        cardLayout.next(p1);
                        break;
                    case "第一张":
                        cardLayout.first(p1);
                        break;
                    case "最后一张":
                        cardLayout.last(p1);
                        break;
                    case "第三张":
                        cardLayout.show(p1, "第三张");
                        break;
                    default:
                        break;
                }
            }
        };
        // 8. 把当前事件监听器和多个按钮绑定到一起
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);
        b3.addActionListener(actionListener);
        b4.addActionListener(actionListener);
        b5.addActionListener(actionListener);
        // 9. 把按钮添加到容器 p2 中
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        // 10. 把 p2 放到 frame 的南部区域
        frame.add(p2, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
