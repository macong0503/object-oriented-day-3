package com.hqyj.mc.Test.RecursionTest;

import java.io.File;
import java.io.FileFilter;

public class RecursionDemo04 {

    public static void recursion(File file){
        File[] f = file.listFiles(new FileFilterImpl());
        for (File file1 : f) {
            if (file1.isDirectory()){
               recursion(file1);
            }else{
                    System.out.println(file1);
           }
        }
    }

    public static void main(String[] args) {
        File f = new File("D:\\jdk8");
        recursion(f);
    }
}
