package learn.awt.tut01container;

import java.awt.*;

/*
    java.awt.ScrollPane extends Container extends Component
    构造方法：
        ScrollPane() 创建一个新的滚动窗格容器，滚动条显示策略为“根据需要”。
        ScrollPane(int scrollbarDisplayPolicy) 创建一个新的scrollpane容器。
    字段：
        static int SCROLLBARS_ALWAYS 指定始终显示水平/垂直滚动条，而不管滚动窗格和子项的相应大小。
        static int SCROLLBARS_AS_NEEDED 指定仅当子项的大小超过水平/垂直维度中滚动窗格的大小时才应显示水平/垂直滚动条。
        static int SCROLLBARS_NEVER 指定不管滚动窗格和子项的相应大小，都不应显示水平/垂直滚动条。
 */
public class Demo03ScrollPane {
    public static void main(String[] args) {
        Frame frame = new Frame("测试ScrollPane");

        // 1. 创建一个ScrollPane
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        // 2. 往ScrollPane中添加内容
        sp.add(new TextField("这是测试文本")); // 因为scrollpane的布局管理器是borderlayout，所以只显示按钮
        sp.add(new Button("测试按钮"));
        // 3. 把ScrollPane添加到Frame中
        frame.add(sp);

        frame.setBounds(100, 100, 500, 300);
        frame.setVisible(true);
    }
}
