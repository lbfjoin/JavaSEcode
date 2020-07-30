package day15.myGeneric;

/**
 * @author lbf
 * @date 2020/7/30 9:08
 */
public class TestGenericDemo1 {
    public static void main(String[] args) {
        //创建一个泛型为String类
        MyGenericClass<String> my = new MyGenericClass<>();
        my.setMvp("登哥");
        String mvp = my.getMvp();
        System.out.println(mvp);

        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(13);
        System.out.println(my2.getMvp());

        MyGenericClass<Double> my3 = new MyGenericClass<>();
        my3.setMvp(13.00);
        System.out.println(my3.getMvp());
    }
}
