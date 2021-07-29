package com.hqyj.mc.Test.RecursionTest;

import java.io.File;

public class RecursionDemo03 {
    public static void recursion(File file){
        File[] f = file.listFiles();
        for (File file1 : f) {
            if (file1.isDirectory()){
                recursion(file1);
            }else{
                if (file1.getName().endsWith(".exe")){
                    System.out.println(file1);
                }
            }
        }
    }

    public static void main(String[] args) {
        File f = new File("D:\\jdk8");
        recursion(f);
    }
}
