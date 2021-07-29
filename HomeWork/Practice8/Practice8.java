package com.hqyj.mc.HomeWork.Practice8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）
// 出现的次数。例如：集合中有”abc”、”bcd”两个元素，
// 程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
public class Practice8 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abd");
        list.add("ace");
        list.add("bbads");

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <list.get(i).length() ; j++) {
                char chars = list.get(i).charAt(j);

                    if (map.containsKey(chars)){
                        Integer value = map.get(chars);
                        value++;
                        map.put(chars,value);
                    }else
                        map.put(chars,1);
            }
        }
        System.out.println(map);
    }
}
