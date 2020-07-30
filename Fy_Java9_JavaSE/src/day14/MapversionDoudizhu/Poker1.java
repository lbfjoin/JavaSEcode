package day14.MapversionDoudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/7/29 14:28
 */
public class Poker1 {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerMap = new HashMap<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(numbers, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        Collections.addAll(colors, "♥", "♦", "♠", "♣");

        int count = 1;
        pokerMap.put(count++, "大王");
        pokerMap.put(count++, "小王");
        for (String number : numbers) {
            for (String color : colors) {
                pokerMap.put(count++, color + number);
            }
        }
        System.out.println(pokerMap);

        ArrayList<Integer> shufflePoker = new ArrayList<>();
        Set<Integer> keySet = pokerMap.keySet();
        shufflePoker.addAll(keySet);
        Collections.shuffle(shufflePoker);
        System.out.println(shufflePoker);

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> remind = new ArrayList<>();

        for (int i = 0; i < shufflePoker.size(); i++) {
            if (i >= 51) {
                remind.add(shufflePoker.get(i));
            } else {
                if (i % 3 == 0) {
                    one.add(i);
                } else if (i % 3 == 1) {
                    two.add(shufflePoker.get(i));
                } else {
                    three.add(shufflePoker.get(i));
                }
            }

        }
//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(three);
//        System.out.println(remind);
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(remind);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (Integer i : one) {
            player1.add(pokerMap.get(i));
        }
        for (Integer i : two) {
            player2.add(pokerMap.get(i));
        }
        for (Integer i : three) {
            player3.add(pokerMap.get(i));
        }
        for (Integer i : remind) {
             dipai.add(pokerMap.get(i));
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);


    }
}
