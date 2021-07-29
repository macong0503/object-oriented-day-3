package com.hqyj.mc.HomeWork.Practice10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice10 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1930,"乌拉圭");
        map.put(1934,"意大利");
        map.put(1938,"意大利");
        map.put(1950,"乌拉圭");
        map.put(1954,"西德");
        map.put(1958,"巴西");
        map.put(1962,"巴西");
        map.put(1966,"英格兰");
        map.put(1970,"巴西");
        map.put(1974,"西德");
        map.put(1978,"阿根廷");
        map.put(1982,"意大利");
        map.put(1986,"阿根廷");
        map.put(1990,"西德");
        map.put(1994,"巴西");
        map.put(1998,"法国");
        map.put(2002,"巴西");
        map.put(2006,"意大利");
        map.put(2010,"西班牙");
        map.put(2014,"德国");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int i = sc.nextInt();
        if (map.containsKey(i)){
            String s = map.get(i);
            System.out.println("冠军是："+s);
        }else
            System.out.println("没有举办世界杯");

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入国家：");
        String str = sc.next();
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        if (map.containsValue(str)){
        for (Map.Entry<Integer, String> entry : set) {
                System.out.println(entry.getKey());
            }
        }else
            System.out.println("没有获得过冠军");

    }
}
