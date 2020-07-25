package day10.zuoye4;

/**
 * @author lbf
 * @date 2020/7/24 20:02
 */
public class Test {
    public static void main(String[] args) {
        Star star = new Star();
        star.shine();
        System.out.println("=================");
        Universe universe = new Sun();
        universe.doAnything();
        Sun sun = (Sun) universe;
        sun.shine();
    }
}
