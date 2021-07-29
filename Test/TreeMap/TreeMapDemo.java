package com.hqyj.mc.Test.TreeMap;

import java.util.TreeSet;
/*
TreeSet/TreeMap:
1.TreeSet集合底层实际上就是一个TreeMap
2.TreeMap集合底层数据结构是：自平衡二叉树
3.向TreeSet集合中存放元素，等同于放入了TreeMap集合的key部分
4.TreeSet集合中元素是无序不可重复的，但是它可以按照元素大小顺序自动排序
所以，它是一个可排序的集合
*/
public class TreeMapDemo {
        public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(1);
            set.add(10);
            set.add(9);
            set.add(5);
            for (Integer i : set) {
                System.out.println(i);
            }
        }
    }
