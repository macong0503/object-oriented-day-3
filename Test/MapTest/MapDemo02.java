package com.hqyj.mc.Test.MapTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
* Map集合的第一种遍历方式：通过键找值的方式：
方法：
Set<K> keySet()返回此地图中包含的键的Set视图。
实现步骤：
1.使用keySet()方法，把Map集合中的key取出来，存入到一个set<K>集合中
2，遍历Set<K>集合，获取到集合每一个key
3.通过Map集合中V get(Object key),获取到所有的value值，输出
* */
public class MapDemo02 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);

        Set<Integer> set = map.keySet();
        for (Integer Key : set) {
            Integer value = map.get(Key);
            System.out.println(Key+"="+value);
        }
    }
}
