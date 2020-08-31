package InterviewExercise.CalculateArea;

/**
 * @author lbf
 * @date 2020/8/18 22:13
 */
public class FangzhuiArea {
    //计算方锥的底面积
    private double width;
    private double length;

    private double s;

    public FangzhuiArea() {
    }

    public FangzhuiArea(double width, double length) {
        this.width = width;
        this.length = length;

    }

    public void Fangzhui(double width, double length) {
        s = width * length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


}
