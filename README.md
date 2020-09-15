# Java-Learning

![GitHub top language](https://img.shields.io/github/languages/top/Kingsmai/JavaLearning)![GitHub commit activity](https://img.shields.io/github/commit-activity/m/Kingsmai/JavaLearning)![GitHub last commit](https://img.shields.io/github/last-commit/Kingsmai/JavaLearning)

![GitHub issues](https://img.shields.io/github/issues/Kingsmai/JavaLearning)![GitHub pull requests](https://img.shields.io/github/issues-pr/Kingsmai/JavaLearning)![GitHub stars](https://img.shields.io/github/stars/Kingsmai/JavaLearning)![GitHub forks](https://img.shields.io/github/forks/Kingsmai/JavaLearning)

![JDK Version](https://img.shields.io/badge/JDK-1.8.0__261-green)![JDK Version](https://img.shields.io/badge/JDK-11.0.8-green)![JDK Version](https://img.shields.io/badge/JDK-14.0.2-red)

学习Java所做的笔记和程序，请各位给我一个**star**喔，您的支持是我继续完善这个库的动力！:wink:

基本上小项目我都会发在这个库里边，大型项目才会新建一个库。

对代码有问题的，或者代码发现错误的，可以发**Issue**，我会对代码进行调试和修复。

Tutorial文件夹是一个Java项目，用eclipse或者intellij打开项目就行~

## How To Use (Eclipse 2020.6)

> `Tutorial, Tutorial2, Tutorial3` 是使用Eclipse编程的，所以用Eclipse打开能保持无冲突（Idea暂时还未尝试）

1. Eclipse 的 Workspace 定位到本项目的根目录下 `Java_Learning\`。打开Eclipse之后，选择`Import Projects`
2. 弹出的框选择：`General > Projects from Folder or Archive`
3. Import source找到路径：\Java_Learning\Tutorialx x是每个不同的Tutorial项目（由入门到高级），一个一个import就行。
4. 本项目是基于JDK11的，所以先[安装JDK11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)，配置好环境变量后，回到Eclipse
5. `Windows > Preferences`打开设置（译：首选项）
6. 接着找到`Java > Installed JREs`，列表右侧点击Add，选择Standard VM，Next
7. JRE Home的路径定位到刚刚JDK11安装的路径，如：C:\Program Files\Java\jdk-11.0.8，然后点击OK就行
8. 回到列表，你可以选择打勾JDK11，这意味着你在这个workspace里的项目将会默认基于JDK11开发。
9. 点击Apply，到这里基本上就完成了。
10. 可以试试随便找到一个有主函数的类，运行该类看看会不会正确输出。

## 学习成长日志

```diff
2020/08/15
# 创建了此库
+ JavaNote 笔记
+ Java 基础源码
2020/08/16
+ JavaNote 增加了新的笔记
2020/08/17
+ Tutorial Java项目
2020/08/23
+ Tutorial/procgenmap 随机地图生成的小项目（做成一个包了）
- 删除了 Tutorial 项目下的 bin 二进制文件
+ Java 面向对象编程
2020/08/24
! 修改包名格式：原先的tut.demo.xxx改为tut.demo01.xxx，一个系列（内定）一个序号
! tut.demo01 Java基础
+ tut.demo02 Java的API
+ Java java.util.Scanner类 键盘输入
+ Java 匿名对象
+ Java java.util.Random类 随机值
2020/08/25
+ Java java.util.ArrayList类 集合
2020/08/27
+ Java java.lang.String类 字符串
+ Useful Material 存放实用文件
! 修改了Java笔记子文件布局
2020/08/28
+ static 关键词的应用
+ Java java.util.Arrays 类
+ Java java.lang.Math 类
2020/08/29
+ Java 继承
+ Java 抽象
+ Java 发红包实列
2020/08/30
! 创建了新的Java项目，命名Tutorial2，从接口Interface开始往这边放代码（包命名有区别）
+ Java Interface 接口
2020/08/31
+ Java Polymorphism 对象的多态性
+ 接口的上下转型
+ 笔记本接口实现案列
2020/09/01
+ 内部类
+ 类或接口作为成员变量类型
+ 接口作为方法的参数和返回值
2020/09/02
+ Java java.lang.Object 类 对象
+ Java java.util.Objects 类 操作对象
+ Java java.util.Date 类 日期
+ Java java.text.DateFormat 抽象类 格式化日期
+ Java java.text.SimpleDateFormat （DateFormat子类）
2020/09/03
+ Java java.util.Calendar 抽象类 日历
2020/09/04
+ Java java.util.System 类
! 重新归类tutorial3项目中，常用API用法的包和类（现在将它们全部集中于tut.d1api.frequent包下）
2020/09/05
+ Java java.lang.StringBuilder 类
+ Java 包装类
2020/09/08
! 调整了几个Java编译器报的警告，使用@SuppressWarning()
2020/09/10
+ Java java.util.Collection 类 集合
+ Java java.util.Iterator 类 迭代器
+ Java foreach 增强for循环
2020/09/12
! 修改Tutorial3项目的包名
+ Java Generic 泛型
+ Java 斗地主案列
2020/09/13
+ 数据结构（有歧义）不完整
+ Java java.util.List接口
+ Java java.util.LinkedList接口
+ Java java.util.Vector集合 （已过时）
+ Java java.util.Set接口
+ Java java.util.HashSet集合
+ Java 哈希值
2020/09/14
+ Java 哈希表
+ Java Set集合存储元素不重复的原理
+ Java java.util.HashSet存储自定义元素
+ Java java.util.LinkedHashSet集合（有序集合）
+ Java Var Args可变参数
+ Java java.util.Collections集合工具类
+ 安利了 eclipse 中文Bug 字体（修复中文字之后标点符号莫名其妙变小的Bug）【在实用工具里边】
2020/09/16
+ Java java.util.Map接口 集合
+ Java Map集合遍历 {keySet 和 entrySet}
+ Java java.util.HashMap 集合
+ Java java.util.LinkedHashMap 集合
```

## Eclipse 笔记：

在class里边输入`main`然后按下`CTRL + Space`然后回车`Enter`，就能快速生成

``` java
public static void main(String[] args){}
```

在main或者任意函数里边输入`sysout`或`sout`然后按下`CTRL + Space`，就能快速生成

``` Java
System.out.println();
```

快速上下复制一行：`CTRL + ALT + 上下方向键`

快速移动整行：`ALT + 上下方向键`

快速创建类：

1. 创建Getter / Setter
   1. 上方Source菜单，找到`Generate Getter / Setter...`
   2. 选择所有成员变量，然后OK
2. 创建无参构造方法
   1. 上方Source菜单，找到`Generate Constructor Using Field...`
   2. 取消勾选所有的成员变量，然后OK
3. 创建有参构造方法
   1. 上方Source菜单，找到`Generate Constructor Using Field...`
   2. 选择所有成员变量，然后OK
4. 重写toString方法
   1. 上方Source菜单，找到`Generate toString()...`
   2. 打勾Fields，然后Generate
5. 重写hashCode方法和equals方法
   1. 上方Soutce菜单，找到`Generate hashCode() and equals()...`
   2. 全选成员变量，打勾`Use Objects.hash and Objects.equals methods (1.7 or higher)`

`SHIFT + ALT + A` 光标会变成＋，这时候就可以通过鼠标拖拽进行块状编辑(Block Selection)

`Test Commit 3`