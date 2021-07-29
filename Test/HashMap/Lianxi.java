package com.hqyj.mc.Test.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//统计输入的字母个数
public class Lianxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String a = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] array = a.toCharArray();
        for (char c : array) {
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else
                map.put(c,1);
        }
            System.out.println(map);
        }
}

