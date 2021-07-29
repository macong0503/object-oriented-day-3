package com.hqyj.mc.Test.MapTest;

import java.util.HashMap;
import java.util.Map;

/*
* Map<K,V>集合：
特点：
1）双列集合，一个元素包含两个值（key，value）
2）key和value的数据类型可以相同，也可以不同
3）key不允许重复，value是可以重复的
4）key和value是一一对应的
HashMap<K,V>集合：
1）底层是哈希表数据解雇：查询速度非常快
2）无序的集合，存储和取出元素的顺序可能不一样
linkedHashMap<K,V>
1)底层是哈希表+链表数据结构，多了的这条链表是保证顺序的
2）有序的集合，存储和取出元素的顺序是一样的
* */
public class MapDemo01 {
    /*
   Map集合添加值：
   V put(K key,V value)
   key不允许重复，重复的话value会覆盖
    */
    public static void show1(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志颖",155);
        map.put("林志颖",159);
        System.out.println(map);
    }
    /*
     Map集合删除值：
   V remove(Object key)
   注意：key值存在，v返回的是删除的值
        key值不存在，v返回的是null
    */
    public static void show2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志颖",155);
        System.out.println(map);
        Integer v1 = map.remove("林志颖");
        System.out.println(map);
        Integer v2 = map.remove(180);
        System.out.println(v2);
    }
    /*
       Map集合获取值：
      V get(Object key)
       注意：key值存在，v返回的是对应的value值
           key值不存在，v返回的是null
       */
    public static void show3(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志颖",155);
        System.out.println(map.get("杨颖"));
        System.out.println(map.get("颖"));
    }
    /*
   boolean containsKey(Object key)如果此映射包含指定键的映射，则返回true
   boolean containsValue(Object value)如果此映射将一个或多个键映射到指定的值，则返回true 。
    */
    public static void show4(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志颖",155);
        System.out.println(map.containsKey("杨颖"));
        System.out.println(map.containsValue(165));
    }
    public static void main(String[] args) {
        //show1();
        //show2();
        //show3();
        show4();
    }
}
