package day13.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author lbf
 * @date 2020/7/28 16:58
 */
public class Poker1 {
    public static void main(String[] args) {
        ArrayList<String> pokerBox = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();

        colors.add("红桃");
        colors.add("方片");
        colors.add("黑桃");
        colors.add("梅花");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + " ");
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");

        for(String color: colors){
            for (String number: numbers){
                pokerBox.add(color  + number);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        Collections.shuffle(pokerBox);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < pokerBox.size(); i++) {
            String card = pokerBox.get(i);
            if (i >= 51){
                dipai.add(card);
            }else {
                if (i % 3 == 0){
                    player1.add(card);
                }else if (i % 3 == 1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }

        }
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);

    }
}
