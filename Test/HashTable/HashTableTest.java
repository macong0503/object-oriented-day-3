package com.hqyj.mc.Test.HashTable;

import java.util.Hashtable;

/*
* HashTable:
1.底层也是哈希表数据结构，是线程安全的
从Java 2平台v1.2，如果不需要线程安全的实现，建议使用HashMap代替Hashtable 。 如果需要线程安全的并发实现，那么建议使用ConcurrentHashMap代替Hashtable 。
HashTable在开发中不建议使用，但是它的子类Properties属性集类还在使用。
此类是唯一一个和IO相结合的集合类。
2.HashMap集合元素的key 和value值允许为null,
HashTable集合元素的key和value值不允许为null
* */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        table.put(null,"a");
        table.put(null,"b");
        table.put("c",null);
        System.out.println(table);

    }

}
