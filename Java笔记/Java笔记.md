# Java语言

**跨平台性**：一次编写，到处运行 (Write once, run anywhere)

## JDK, JRE & JVM

**JDK** Java Development Kit （Java 开发包），是Sun微系统针对Java开发人员发布的免费软件开发工具包
**JRE** Java Runtime Environment （Java 运行环境），可以让电脑系统运行Java应用程序
**JVM** Java Virtual Machine （Java 虚拟机），是Java平台的一部分，能够运行以Java语言写作的软件程序。

JDK > JRE > JVM

# 环境配置

> 过后补上

## JDK安装

## 环境变量设置

## Tomcat安装

## 如果使用VSCode作为开发环境

到vscode的扩展市场搜索`Java Extension Pack`

下载，等待安装所有六个包

按一下键盘上的F1，输入`Setting`，打开`Open Setting (JSON)`，复制这一段进去

``` JSON
"java.home": "C:\\Program Files\\Java\\jdk-14.0.2", // 这里改成你的jdk安装路径，格式和我的一样（注释别复制过去）
"intelephense.format.braces": "k&r",
"editor.suggestSelection": "first",
"vsintellicode.modify.editor.suggestSelection": "automaticallyOverrodeDefaultValue",
"java.semanticHighlighting.enabled": true,
"files.exclude": {
    "**/.classpath": true,
    "**/.project": true,
    "**/.settings": true,
    "**/.factorypath": true
}
```



# 编写Hello World

> 初学者先从头到尾跟着敲一遍（理解原理）

创建一个文本文档`txt`，命名为`HelloWorld.java`（后缀名改为java）

**注意**：这时候文件类型将会变为`Java Source File`如果文件类型还是`Text Source File`，那就点击`View`然后打勾`File Name Extensions`，这时候就会发现所有文件（除了文件夹）都会变成`文件名.后缀名`，
然后把你刚刚搞得`HelloWorld.java.txt`后面那个`.txt`删掉

用记事本（或任意文本编辑器）打开刚刚创建的`HelloWorld.java`，内容输入

> 推荐使用：（先不用eclipse，后面用得上的~）
> VScode https://code.visualstudio.com/
> Notepad++ https://notepad-plus-plus.org/downloads/

``` Java
public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello world!");
    }
}
```

这时候打开命令提示符（CMD）
或者可以在`HelloWorld.java`文件所在的目录下点击`File` > `Open Windows PowerShell`

> 前提是JDK环境要配好！
>
> 现在我的`HelloWorld.java`文件在`C:\Coding\JavaNote`里

``` CMD
cd C:\Coding\JavaNote
javac HelloWorld.java
java HelloWorld
```

第一句是跳转到`HelloWorld.java`的目录
第二句是通过 javac 程序编译 HelloWorld.java，这个指令使用完之后，同一个目录下会出现`HelloWorld.class`
第三句就是通过 java 程序运行 HelloWorld.class（注意，这里不需要.class后缀名）

## 分析

``` Java
// 公有的，类，类名叫HelloWorld
// 类名必须与文件名'HelloWorld.java'相同
public class HelloWorld {
    // 每个Java程序必须有个主函数 main
    // 这一句的写法在所有Java程序中是一样的
    public static void main (String[] args) {
        // 这句是调用含数，在控制台输出 Hello world!
        System.out.println("Hello world!");
    }
}
```

# Java语法

## 关键字

> 在语言中含有特殊含义、被保留的、不能随意使用的字符

1. 完全小写的字母 `public` `class` `static`
2. 在增强版的记事本当中（如VScode，Notepad++）文字有特殊颜色的 `void` `String`

HelloWorld 例子中，HelloWorld不是关键字、main也不是关键字

## 标识符

程序员自定义的名字：类名、方法（函数）名、变量名等等

* **命名规则`硬性要求`**

