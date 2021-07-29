package com.hqyj.mc.Test.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* Map集合的第二种遍历方式：使用Entry对象遍历
Entry：键值对（key-value）
方法：
Map接口：
方法：
Set<Map.Entry<K,V>> entrySet()返回此地图中包含的映射的Set视图
java.util Interface Map.Entry<K,V>
K getKey()返回与此条目相对应的键
V getValue()返回与此条目相对应的值。
实现步骤：
1.使用Map集合entrySet()方法，把集合中多个Entry对象取出来，存储到一个Set集合中
2.遍历Set集合，获取到每一个Entry对象
3.调用Map.Entry<K,V>接口中的getKey()和getValue()获取出键和值
* */
public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : set) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);


        }
    }
}
