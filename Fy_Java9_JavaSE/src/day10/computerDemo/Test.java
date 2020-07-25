package day10.computerDemo;

/**
 * @author lbf
 * @date 2020/7/24 16:41
 */
public class Test {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.run();
//        多态
        USB u = new Mouse();
        //电脑使用鼠标
        c.useUSB(u);
        USB kb = new KeyBoard();
        c.useUSB(kb);
        c.shutDown();
    }
}
