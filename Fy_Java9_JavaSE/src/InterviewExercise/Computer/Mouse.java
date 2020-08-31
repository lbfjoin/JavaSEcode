package InterviewExercise.Computer;

/**
 * @author lbf
 * @date 2020/8/11 20:21
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }
    public void click(){
        System.out.println("鼠标点击");
    }
}
