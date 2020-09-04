# Java-Learning

![GitHub top language](https://img.shields.io/github/languages/top/Kingsmai/JavaLearning)![GitHub commit activity](https://img.shields.io/github/commit-activity/m/Kingsmai/JavaLearning)![GitHub last commit](https://img.shields.io/github/last-commit/Kingsmai/JavaLearning)

![GitHub issues](https://img.shields.io/github/issues/Kingsmai/JavaLearning)![GitHub pull requests](https://img.shields.io/github/issues-pr/Kingsmai/JavaLearning)![GitHub stars](https://img.shields.io/github/stars/Kingsmai/JavaLearning)![GitHub forks](https://img.shields.io/github/forks/Kingsmai/JavaLearning)

![JDK Version](https://img.shields.io/badge/JDK-1.8.0__261-green)![JDK Version](https://img.shields.io/badge/JDK-11.0.8-green)![JDK Version](https://img.shields.io/badge/JDK-14.0.2-red)

学习Java所做的笔记和程序，请各位给我一个**star**喔，您的支持是我继续完善这个库的动力！:wink:

基本上小项目我都会发在这个库里边，大型项目才会新建一个库。

对代码有问题的，或者代码发现错误的，可以发**Issue**，我会对代码进行调试和修复。

Tutorial文件夹是一个Java项目，用eclipse或者intellij打开项目就行~

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
   1. 上方Source菜单，找到Generate Getter / Setter
   2. 选择所有成员变量，然后OK
2. 创建无参构造方法
   1. 上方Source菜单，找到Generate Constructor Using Field
   2. 取消勾选所有的成员变量，然后OK
3. 创建有参构造方法
   1. 上方Source菜单，找到Generate Constructor Using Field
   2. 选择所有成员变量，然后OK

`SHIFT + ALT + A` 光标会变成＋，这时候就可以通过鼠标拖拽进行块状编辑(Block Selection)