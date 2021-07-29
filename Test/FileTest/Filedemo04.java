package com.hqyj.mc.Test.FileTest;

import java.io.File;

/*
File类判断功能的方法：
public boolean exists()测试此抽象路径名表示的文件或目录是否存在。
public boolean isDirectory()测试此抽象路径名表示的文件是否为目录。
public boolean isFile()测试此抽象路径名表示的文件是否为普通文件。
 */
public class Filedemo04 {
    public static void main(String[] args) {
        show02();
    }
    /*
    public boolean isDirectory()测试此抽象路径名表示的文件是否为目录。
    public boolean isFile()测试此抽象路径名表示的文件是否为普通文件。

     */
    private static void show02() {
        File f2 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\src\\com\\hqyj\\mc\\Test\\FileTest");
        if(f2.exists()) {
            System.out.println(f2.isFile());
            System.out.println(f2.isDirectory());
        }
    }

    /*
    public boolean exists()测试此抽象路径名表示的文件或目录是否存在。
     */
    private static void show01() {

        File f1 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\src\\com\\hqyj\\mc\\Test\\FileTest\\Filedemo04");
        System.out.println(f1.exists());
        File f2 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\src\\com\\hqyj\\mc\\Test\\FileTest\\Filedemo04");
        System.out.println(f2.exists());
        File f3 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\src\\com\\hqyj\\mc\\Test\\FileTest\\a");
        System.out.println(f3.exists());

    }

}

