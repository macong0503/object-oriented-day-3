package com.hqyj.mc.HomeWork.Practice5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//请使用Map集合存储自定义数据类型Car做键，对应的价格做值。
// 并使用keySet和entrySet两种方式遍历Map集合。
public class Practice5 {
    public static void main(String[] args) {
        HashMap<Car,Integer> map = new HashMap<>();
        map.put(new Car("奔驰"),100000);
        map.put(new Car("宝马"),200000);
        map.put(new Car("奥迪"),4000000);
        map.put(new Car("法拉利"),8000000);

        System.out.println("keySet遍历：");
        Set<Car> set = map.keySet();
        for (Car key : set) {
            Integer value = map.get(key);
            System.out.println(key + " " +value);
        }
        System.out.println("entrySet遍历：");
        Set<Map.Entry<Car, Integer>> set1 = map.entrySet();
        for (Map.Entry<Car, Integer> entry : set1) {
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" "+value);
        }
    }
}
