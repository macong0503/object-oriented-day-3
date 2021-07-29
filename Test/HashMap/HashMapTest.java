package com.hqyj.mc.Test.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    /*
    * HashMap<K,V>集合：
key和value是自定义类型
key是自定义类型： 建议实体类重写equals和hashCode方法
value是自定义类型：可以不用重写equals和hashCode方法
    * */
    //value是自定义类型
    public static void show1(){
        HashMap<String,person> map = new HashMap<>();
        map.put("北京",new person("小明",18));
        map.put("上海",new person("小张",18));
        map.put("广州",new person("小王",18));
        map.put("北京",new person("小明",18));

        Set<String> set = map.keySet();
        for (String key : set) {
            person vlure = map.get(key);
            System.out.println(key+vlure);
        }
    }
    //key是自定义类型： 建议实体类重写equals和hashCode方法
    public static void show2(){
        HashMap<person,String> map = new HashMap<>();
        map.put(new person("小明",18),"北京");
        map.put(new person("小wang",18),"上海");
        map.put(new person("小ai",18),"广州");
        map.put(new person("小b",18),"北京");

        Set<Map.Entry<person, String>> set = map.entrySet();
        for (Map.Entry<person, String> entry : set) {
            person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+value);
        }
    }

    public static void main(String[] args) {
        show1();
        show2();
    }
}
