package com.hqyj.mc.Test.FileTest;

import java.io.File;

public class FileDemo06 {

  /*  File类遍历文件夹（目录）功能：
    public String[] list()返回一个字符串数组，命名由此抽象路径名表示的目录中的文件和目录。
    public File[] listFiles()返回一个抽象路径名数组，表示由该抽象路径名表示的目录中的文件。
    注意：
    list()和listFiles()方法遍历的是构造方法中给出的目录
    如果构造方法给出的目录不存在，就会抛出空指针
    如果构造方法给出的不是一个目录，也会抛出空指针
 */
        public static void main(String[] args) {
            show02();
        }
        /*
        public File[] listFiles()
         */
        private static void show02() {
            File f1 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3");
            File[] files = f1.listFiles();
            for (File file : files) {
                System.out.println(file);
            }

        }

        /*
        public String[] list()
         */
        private static void show01() {
            File f1 = new File("D:\\Idea\\华清代码\\j210701\\面向对象编程\\day-3");
            String[] list = f1.list();
            for (String s : list) {
                System.out.println(s);
            }

        }
    }


