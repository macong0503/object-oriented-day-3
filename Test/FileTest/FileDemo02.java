package com.hqyj.mc.Test.FileTest;

import java.io.File;

public class FileDemo02 {
    /*
    * public File(String pathname)通过将给定的路径名字符串转换为抽象路径名来创建新的File实例。
参数：
pathname - 路径名字符串
路径可以是以文件结尾，也可以是以文件夹结尾
路径可以是相对路径，也可以是绝对路径
路径可以是存在，也可以是不存在的
创建File对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
    * */
    public static void show1(){
        File f1 = new File("D:\\workspace210701\\\\day03\\\\src\\\\com\\\\hqyj\\\\demo05\\\\FileTest02.java");
        System.out.println(f1);
        File f2 = new File("D:\\workspace210701\\\\day03\\\\src\\\\com\\\\hqyj\\\\demo05\\\\");
        System.out.println(f2);
        File f3 = new File("D:\\a.txt");
        System.out.println(f3);
        File f4 = new File("a.txt");
    }
    // public File(String parent,String child)从父路径名字符串和子路径名字符串创建新的File实例。
    //    好处：父路径和子路径单独书写，使用起来非常灵活，父路径和子路经可以分别随时改动
    private static void show2(String parent,String child){
        File f = new File(parent,child);
        System.out.println(f);
    }
    /*
   public File(File parent,String child)从父抽象路径名和子路径名字符串创建新的File实例。
   好处：
   1.父路径和子路径单独书写，使用起来非常灵活，父路径和子路经可以分别随时改动
   2.父路径是一个File类型，可以使用File类中的方法对父路径进行一系列的操作
    */
    private static void show03() {
        File parent = new File("c:\\");
        File f1 = new File(parent,"hello.java");
        System.out.println(f1);
    }
    public static void main(String[] args) {
        show03();
    }
}

