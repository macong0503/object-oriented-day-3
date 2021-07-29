package com.hqyj.mc.Test.FileTest;

import java.io.File;

/*
* java.io.File
此类和后面的IO流一点关系都没有，还是一个与操作系统无关的类，任何操作系统都可以用File类中的方法
文件和目录路径名的抽象表示形式
Java中把电脑中的文件和文件夹（目录）封装为一个File类。
我们可以使用File类对文件和文件夹进行操作
File类方法：
创建文件/文件夹的方法
删除文件/文件夹的方法
获取文件/文件夹的方法
判断文件/文件夹是否存在的方法
遍历文件/文件夹的方法
获取文件大小
重点：记住三个单词——
file:文件
directory：文件夹/目录
path:路径
* */
public class FileDemo {
    /*
    *   public static final String pathSeparator与系统相关的路径分隔符字符，为方便起见，表示为字符串。
        public static final char pathSeparatorChar与系统相关的路径分隔符。
        public static final String separator与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
        public static final char separatorChar与系统相关的默认名称分隔符。
        操作路径：适应不同的操作系统
        c:\a\b\a.txt Windows
        c:/a/b/a.txt linux
        "c"+File.separator+"a"+File.separator+"b"+File.separator+"a.txt"
    * */

    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//;
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparatorChar);//;
        String separator = File.separator;
        System.out.println(separator);//\
        char separatorChar = File.separatorChar;
        System.out.println(separatorChar);//\
    }
}
