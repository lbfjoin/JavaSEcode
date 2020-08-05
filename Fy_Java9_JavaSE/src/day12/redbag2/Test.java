package day12.redbag2;

/**
 * @author lbf
 * @date 2020/7/31 18:19
 */
public class Test {
    public static void main(String[] args) {
        MyRed myred = new MyRed("刘宝枫的红包");
        myred.setOwnerName("刘宝枫");

//        NormalMode normalMode = new NormalMode();
//        myred.setOpenWay(normalMode);
        RandomMode randomMode = new RandomMode();
        myred.setOpenWay(randomMode);
    }
}
