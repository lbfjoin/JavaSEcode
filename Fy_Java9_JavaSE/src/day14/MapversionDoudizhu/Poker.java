package day14.MapversionDoudizhu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/7/29 11:31
 */
public class Poker {
    public static void main(String[] args) {
        //创建map集合
        HashMap<Integer, String> pokerMap = new HashMap<>();
        //花色和数字
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors, "♥", "♦", "♠", "♣");
        Collections.addAll(numbers, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        int count = 1;
        pokerMap.put(count++, "大王");
        pokerMap.put(count++, "小王");
        //初始化其他牌
            for (String number : numbers) {
                for (String color : colors) {
                String card = color + number;
                pokerMap.put(count++, card);
            }
        }
        System.out.println(pokerMap);
        //洗牌
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        System.out.println(numberList);
        //创建玩家和底牌编号
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //不发牌，发编号
        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            if (i >= 51) {
                diPai.add(no);
            } else if (i % 3 == 0) {
                noP1.add(no);
            } else if (i % 3 == 1) {
                noP2.add(no);
            } else {
                noP3.add(no);
            }

        }
        System.out.println(noP1);
        System.out.println(noP2);
        System.out.println(noP3);
        System.out.println(diPai);
        //地编号进行排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(diPai);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        //遍历
        for (Integer i : noP1) {
            String card = pokerMap.get(i);
            player1.add(card);
        }
        for (Integer i : noP2) {
            String card = pokerMap.get(i);
            player2.add(card);
        }
        for (Integer i : noP3) {
            String card = pokerMap.get(i);
            player3.add(card);
        }
        for (Integer i : diPai) {
            String card = pokerMap.get(i);
            dipai.add(card);
        }
        System.out.println("1" + player1);
        System.out.println("2"+ player2);
        System.out.println("3"+ player3);
        System.out.println("底牌"+ dipai);


    }
}
