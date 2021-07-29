package com.hqyj.mc.Test.FileTest;

import java.io.File;

public class FileDemo03 {
    /*
File类获取功能的方法：
public String getAbsolutePath()返回此抽象路径名的绝对路径名字符串。
public String getPath()将此抽象路径名转换为路径名字符串。
public String getName()返回由此抽象路径名表示的文件或目录的名称。
public long length()返回由此抽象路径名表示的文件的长度。
 */
        public static void main(String[] args) {
            show04();
        }
        /*
        public long length()返回由此抽象路径名表示的文件的长度。
        注意：文件夹没有大小概念，不能获取文件夹大小；文件有大小的，以字节为单位的
        如果构造方法中给出的路径不存在，那么length值也会返回0
         */
        private static void show04() {
            File f1 = new File("D:\\Typora\\笔记\\老师笔记\\面向对象\\day02\\参考\\双向链表.png");
            long l1 = f1.length();
            System.out.println(l1);
            File f2 = new File("D:\\Typora\\笔记\\老师笔记\\面向对象\\day02\\参考\\1.png");
            long l2 = f2.length();
            System.out.println(l2);
        }

        /*
        public String getName()返回由此抽象路径名表示的文件或目录的名称。
        获取到的是路径的结尾部分
         */
        private static void show03() {
            File f1 = new File("D:\\upload\\2.jpg");
            String name = f1.getName();
            System.out.println(name);

        }

        /*
        public String getPath()将此抽象路径名转换为路径名字符串。
         */
        private static void show02() {

            File f1 = new File("D:\\workspace210701\\day03\\src\\com\\hqyj\\demo05\\FileTest03.java");

            File f2 = new File("a.txt");
            String path1 = f1.getPath();
            String path2 = f2.getPath();
            System.out.println(path1);
            System.out.println(path2);
        }

        /*
    public String getAbsolutePath()返回此抽象路径名的绝对路径名字符串。
    无论构造方法传递的路径是绝对路径还是相对路径，getAbsolutePath()方法
    调用后返回的都是绝对路径字符串
         */
        private static void show01() {
            File f1 = new File("D:\\workspace210701\\day03\\src\\com\\hqyj\\demo05\\FileTest03.java");
            String absolutePath = f1.getAbsolutePath();
            System.out.println(absolutePath);
            File f2 = new File("a.txt");
            String absolutePath1 = f2.getAbsolutePath();
            System.out.println(absolutePath1);


        }

    }

