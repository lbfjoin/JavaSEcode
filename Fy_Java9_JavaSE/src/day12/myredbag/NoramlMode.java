package day12.myredbag;

import day12.myredbag.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author lbf
 * @date 2020/7/27 11:09
 */
public class NoramlMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalCount % totalCount;

        for (int i = 0; i < totalCount-1; i++) {
            list.add(avg);

        }
        list.add(avg + mod);
        return list;
    }
}
