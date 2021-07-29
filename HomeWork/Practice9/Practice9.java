package com.hqyj.mc.HomeWork.Practice9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
// 如果该 年没有举办世界杯，则输出：没有举办世界杯。
public class Practice9 {
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
        map.put(2018,"法国");
        map.put(2020,"法国");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int i = sc.nextInt();
        if (i>=1930&&i<=2020){
            String s = map.get(i);
            System.out.println("冠军是："+s);
        }else
            System.out.println("没有举办世界杯");


    }
}
