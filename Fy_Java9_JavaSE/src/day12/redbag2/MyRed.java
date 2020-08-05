package day12.redbag2;

import day12.redbag2.utils.RedPacketFrame;

/**
 * @author lbf
 * @date 2020/7/31 18:13
 */
public class MyRed extends RedPacketFrame {
    /**
     * 构造方法
     * title 界面的标题
     *
     * @param title
     */
    public MyRed(String title) {
        super(title);
    }
}
