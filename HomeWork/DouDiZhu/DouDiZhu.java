package com.hqyj.mc.HomeWork.DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        HashMap<Integer, String> poker = new HashMap<>();
        String[] color = {"♥", "♠", "♣", "♦"};
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A", "2"};
        String[] wang = {"小王", "大王"};


                for (String s1 : number) {
                    for (String s : color) {
                    list1.add(s+s1);
                }
            }
        for (String s : wang) {
            list1.add(s);
        }
        for (int i = 0; i < list1.size(); i++) {
            poker.put(i,list1.get(i));
        }

        for (int k = 0; k < 54; k++) {
            list.add(k);
        }

       //洗牌
        Collections.shuffle(list);
        //摸牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int p = list.get(i);
            if (i>=51){
                dipai.add(p);
            }
            if (i%3==0){
                player1.add(p);
            }
            if (i%3==1){
                player2.add(p);
            }
            if (i%3==2){
                player3.add(p);
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);
        //看牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> DiPai = new ArrayList<>();
        for (Integer i1 : player1) {
            String p1 = poker.get(i1);
            player01.add(p1);
        }
        for (Integer i2 : player2) {
            String p2 = poker.get(i2);
            player02.add(p2);
        }for (Integer i3 : player3) {
            String p3 = poker.get(i3);
            player03.add(p3);
        }
        for (Integer i4 : dipai) {
            String p4 = poker.get(i4);
            DiPai.add(p4);
        }
        System.out.println("小明"+player01);
        System.out.println("小红"+player02);
        System.out.println("小王"+player03);
        System.out.println("DiPai"+DiPai);

    }
}
