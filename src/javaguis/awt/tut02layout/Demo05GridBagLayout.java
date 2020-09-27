package javaguis.awt.tut02layout;

import java.awt.*;

/*
    java.awt.GridBagLayout 功能强大，但是麻烦
    下面就随意写，参考就好
 */
public class Demo05GridBagLayout {
    public static void main(String[] args) {
        // 1. 创建 Frame 对象
        Frame frame = new Frame("测试GridBagLayout");

        // 2. 创建 GridBagLayout 对象
        GridBagLayout gbl = new GridBagLayout();

        // 3. 把 Frame 对象的布局管理器设置为 GridBagLayout
        frame.setLayout(gbl);

        // 4. 创建 GridBagConstraints 对象
        GridBagConstraints gbc = new GridBagConstraints();

        // 5. 创建容量为 10 的 Button 数组
        Button[] btnarr = new Button[10];

        // 6. 遍历数组，初始化每一个 Button
        for (int i = 0; i < btnarr.length; i++) {
            btnarr[i] = new Button("按钮" + (i + 1));
        }

        // 7. 设置所有的 GridBagConstraints 对象的 fill 属性为 GridBagConstraints.BOTH，当有空白区域时，自动扩大占满空白区域
        gbc.fill = GridBagConstraints.BOTH;

        // 8. 设置 GridBagConstraints 对象的 weightx 为 1，表示横向扩展比列为 1
        gbc.weightx = 1;

        // 9. 往 frame 中添加数组中的三个 Button
        addComponent(frame, btnarr[0], gbl, gbc);
        addComponent(frame, btnarr[1], gbl, gbc);
        addComponent(frame, btnarr[2], gbl, gbc);
        
        // 10. 把 GridBagConstraints 的 gridwidth 设置为 GridBagConstraints.REMAINDER，则表明当前组件是横向最后一个组件
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        // 11. 把 Button 数组中的第 4 个按钮添加到 frame 中
        addComponent(frame, btnarr[3], gbl, gbc);

        // 12. 把 GridBagConstraints 的 weighty 设置为 1，表示纵向扩展比例为 1
        gbc.weighty = 1;

        // 13. 把 Button 数组中的第 5 个按钮添加到 frame 中
        addComponent(frame, btnarr[4], gbl, gbc);

        // 14. 把 GridBagConstraints 的 gridheight 和 gridwidth 设置为 2，表示纵向和横向会占用两个网格
        gbc.gridwidth = 2;
        gbc.gridheight = 2;

        // 15. 把 Button 数组中的第 6 个按钮添加到 frame 中
        addComponent(frame, btnarr[5], gbl, gbc);

        // 16. 把 GridBagConstraints 的 gridheight 和 gridwidth 设置为 1，表示纵向和横向会占用一个网格
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        // 17. 把 Button 数组中的第 7 个按钮添加到 frame 中
        addComponent(frame, btnarr[6], gbl, gbc);

        // 18. 把 GridBagConstraints 的 gridwidth 设置为 GridBagConstraints.REMAINDER，则表明当前组件是横向最后一个组件
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        // 19. 把 Button 数组中的第 8 个按钮添加到 frame 中
        addComponent(frame, btnarr[7], gbl, gbc);

        // 20. 把 GridBagConstraints 的 gridwidth 设置为 1，表示纵向会占用一个网格
        gbc.gridwidth = 1;

        // 21. 把 Button 数组中的第 9、10 个按钮添加到 frame 中
        addComponent(frame, btnarr[8], gbl, gbc);
        addComponent(frame, btnarr[9], gbl, gbc);

        // 22. 设置 frame 为最佳大小
        frame.pack();

        // 23. 设置 frame 可见
        frame.setVisible(true);
    }

    private static void addComponent(Frame frame, Button button, GridBagLayout gbl, GridBagConstraints gbc) {
        gbl.addLayoutComponent(button, gbc);
        frame.add(button);
    }
}
