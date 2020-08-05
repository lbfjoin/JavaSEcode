package day12.myredbag;

import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/27 11:09
 */
public class Bootstrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("刘宝枫发的红包");
        myRed.setOwnerName("刘宝枫");

//        NoramlMode noramlMode = new NoramlMode();
//        myRed.setOpenWay(noramlMode);
        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);



    }
}
