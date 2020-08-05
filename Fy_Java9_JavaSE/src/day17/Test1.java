package day17;

/**
 * @author lbf
 * @date 2020/8/2 17:05
 */
public class Test1 {
    public static void main(String[] args) {
        Exercise1<String> exercise1 = new Exercise1<>();
        exercise1.setMvp("嘀嘀嘀");
        System.out.println(exercise1.getMvp());
        Exercise1<Integer> exercise11 = new Exercise1<>();
        exercise11.setMvp(13);
        System.out.println(exercise11.getMvp());
    }
}
