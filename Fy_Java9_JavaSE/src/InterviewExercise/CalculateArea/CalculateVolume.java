package InterviewExercise.CalculateArea;

/**
 * @author lbf
 * @date 2020/8/18 21:52
 * //编程题 ：1、计算圆锥、方锥的体积
 * //描述：声明一个泛型类，包含计算体积的方法，只关心它的底是否能计算面积，并不关心底的类型。
 * // 声明圆类和矩形类，分别包含计算面积的方法。
 * // 用户输入圆锥的半径和高，打印输出圆锥的体积。   V= 1/3(S*H)
 * // 输入方锥的长、宽、高，计算方锥的体积并输出。
 */
public class CalculateVolume<E> {
    private E e;
    private double height;

    public CalculateVolume() {
    }

    public CalculateVolume(E e, double height) {
        this.e = e;
        this.height = height;
    }
  public void volume(){

  }
    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
