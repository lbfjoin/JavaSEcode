package day12.redbag;

import java.util.Random;

/**
 * @author lbf
 * @date 2020/7/27 8:59
 * 红包界面启动程序
 * <p>
 * 普通红包：之前介绍过
 */
public class Bootstrap {
    public static void main(String[] args) {

        //设置标题
        MyRed myRed = new MyRed("Java9班抢红包");

        //设置群主名
        myRed.setOwnerName("马云");

        //设置分发策略

        //普通红包
//        NormalMode normalMode = new NormalMode();
//        myRed.setOpenWay(normalMode);
        RandomMode randomMode = new RandomMode();
        myRed.setOpenWay(randomMode);

    }
}
