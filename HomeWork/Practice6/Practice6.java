package com.hqyj.mc.HomeWork.Practice6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
要求：
1.遍历集合，并将序号与对应人名打印。
2.向该map集合中插入一个编码为5姓名为李晓红的信息
3.移除该map中的编号为1的信息
4.将map集合中编号为2的姓名信息修改为"周林"
* */
public class Practice6 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String> ();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");
        //遍历集合，并将序号与对应人名打印。
        System.out.println("遍历结果为：");
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            String s = map.get(i);
            System.out.println(i+" "+s);
        }
        //向该map集合中插入一个编码为5姓名为李晓红的信息
        map.put(5,"李晓红");
        System.out.println("插入编码5后的集合为：");
        System.out.println(map);
        //移除该map中的编号为1的信息
        map.remove(1);
        System.out.println("移除编码1后的集合为");
        System.out.println(map);
        //将map集合中编号为2的姓名信息修改为"周林"
        map.put(2,"周林");
        System.out.println("修改后：");
        System.out.println(map);

    }
}
