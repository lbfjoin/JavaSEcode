package day12.redbag2;

import day12.redbag2.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/31 18:16
 */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg );

        }
        list.add(avg + mod);

        return list;
    }
}
