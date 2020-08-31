package InterviewExercise.CalculateArea;



/**
 * @author lbf
 * @date 2020/8/18 22:13
 */
public class CircleArea {
    //计算圆锥的底面积
    private double radius;
    private double s;
    public CircleArea() {
    }

    public CircleArea(double radius) {
        this.radius = radius;

    }
    public void Circle(double radius){
        s = radius*radius*(Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
