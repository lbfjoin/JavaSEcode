package day12.myredbag;

import day12.myredbag.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/27 11:09
 */
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount-1; i++) {
         int money = 1 + random.nextInt(leftMoney / leftCount * 2);
         list.add(money);
         leftMoney -= money;
         leftCount--;
        }
        list.add(leftMoney);
        return list;
    }
}
