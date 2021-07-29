package com.hqyj.mc.Test.RecursionTest;

public class RecursionDemo01 {
    /*
递归：方法自己调用自己——用到的较少
递归的分类：
分为两种：直接递归和间接递归
直接递归方法自己调用自己
间接递归是A方法调用B方法，B方法调用C方法
注意事项：
1.递归要有限定条件，保证递归能停止，否则会发生栈内存溢出
2.在递归中不只要有限定条件，递归的次数也不能太多，否则也会发生栈内存溢出
3.构造方法，禁止递归
递归的使用前提：
当调用方法时，方法的主题不变，每次调用方法的参数不同，可以使用递归
 */
        public static void main(String[] args) {
            //a();
            b(1);
        }
        /*
        3.构造方法，禁止递归
         */
       // public RecursionTest01() {
            //RecursionTest01();
       // }

        /**
         *
         2.在递归中不只要有限定条件，递归的次数也不能太多，否则也会发生栈内存溢出
         *
         */
        private static void b(int i) {
            System.out.println(i);
            if(i==20000){
                return;
            }
            b(++i);
        }

        /*
        1.递归要有限定条件，保证递归能停止，否则会发生栈内存溢出
        Exception in thread "main" java.lang.StackOverflowError
         */
        private static void a() {
            System.out.println("a");
            a();
        }

    }
