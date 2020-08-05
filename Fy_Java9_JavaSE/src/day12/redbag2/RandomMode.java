package day12.redbag2;

import day12.redbag2.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/31 18:25
 */
public class RandomMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            int money = 1 + random.nextInt(leftMoney );

            list.add(money);
            leftCount--;
            leftMoney -= money;

        }
        list.add(leftMoney);
        return list;
    }
}
