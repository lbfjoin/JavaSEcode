package day14.MapversionDoudizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author lbf
 * @date 2020/7/30 10:34
 */
public class Poker3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        Collections.addAll(numbers,"2","3","4","5","6","7","8","9","10","J","Q","K","A");
        Collections.addAll(colors,"♥","♠","♣","♦");
        int count = 1;
        map.put(count++,"大王");
        map.put(count++,"小王");
        for (String number:numbers){
            for (String color: colors){
                map.put(count++,color+number);
            }
        }
        System.out.println(map);

        //洗牌
        ArrayList<Integer> shufflePoker = new ArrayList<>();
        shufflePoker.addAll(map.keySet());
//        System.out.println(shufflePoker);
        Collections.shuffle(shufflePoker);
        System.out.println(shufflePoker);

        //发牌
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        ArrayList<Integer> di = new ArrayList<>();
        for (int i = 0; i < shufflePoker.size(); i++) {
            if (i >= 51){
                di.add(shufflePoker.get(i));
            }
            else {
                if (i % 3 == 0){
                    one.add(shufflePoker.get(i));
                }else if (i % 3 == 1){
                    two.add(shufflePoker.get(i));
                }else {
                    three.add(shufflePoker.get(i));

                }
            }

        }
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(di);
        
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        Collections.sort(di);

        //
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (Integer integer:one){
            player1.add(map.get(integer));
        }
        for (Integer integer:two){
            player2.add(map.get(integer));
        }
        for (Integer integer:three){
            player3.add(map.get(integer));
        }
        for (Integer integer:di){
            dipai.add(map.get(integer));
        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

    }
}
