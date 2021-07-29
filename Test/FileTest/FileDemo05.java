package com.hqyj.mc.Test.FileTest;

import java.io.File;
import java.io.IOException;

public class FileDemo05 {
    /*
File类创建删除功能的方法：
public boolean createNewFile()throws IOException当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
public boolean delete()删除由此抽象路径名表示的文件或目录。
public boolean mkdir()创建由此抽象路径名命名的目录。
public boolean mkdirs()创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
 */
        public static void main(String[] args) throws IOException {
            show03();
        }
        /*
        public boolean delete()删除由此抽象路径名表示的文件或目录。
         */
        private static void show03() {
            File f1 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\1.txt");
            boolean b1 = f1.delete();
            System.out.println(b1);

        }

        /*
        public boolean mkdir()创建由此抽象路径名命名的目录。
        public boolean mkdirs()创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
         */
        private static void show02() {

            File f1 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\aaa");
            boolean b1 = f1.mkdir();
            System.out.println(b1);
            File f2 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\111\\222\\333");
            boolean b2 = f2.mkdirs();
            System.out.println(b2);


        }

        /*

        public boolean createNewFile()throws IOException
        当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
        注意：
        1.此方法只能创建文件，不能创建文件夹
        2.创建文件的路径必须存在，否则会抛出异常
         */
        private static void show01() throws IOException {
            File f1 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\1.txt");
            boolean b1 = f1.createNewFile();
            System.out.println(b1);
            File f2 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3\\a");
            boolean b2 = f2.createNewFile();
            System.out.println(b2);


        }
    }
