package day10.computerDemo;

import java.security.PublicKey;

/**
 * @author lbf
 * @date 2020/7/24 16:28
 */
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启，小彩灯嗷嗷闪");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭，小彩灯嗷嗷灭");

    }
    public void type(){
        System.out.println("键盘打字");
    }
}
