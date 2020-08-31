package InterviewExercise.Computer;

/**
 * @author lbf
 * @date 2020/8/11 20:22
 */
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }
    public void input(){
        System.out.println("键盘打字");
    }
}
