package day11.InnerClassDemo2;

/**
 * @author lbf
 * @date 2020/7/25 11:34
 */
public class InnerDemo2 {
    public static void main(String[] args) {
        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("嗷嗷飞");
            }
        });

    }
    public static void showFly(FlyAble flyAble){
        flyAble.fly();

    }

}
