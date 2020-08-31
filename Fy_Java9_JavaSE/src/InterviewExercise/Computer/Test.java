package InterviewExercise.Computer;

/**
 * @author lbf
 * @date 2020/8/11 20:28
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
        USB mouse = new Mouse();
        USB keyBoard = new KeyBoard();

        computer.useUSB(mouse);

        computer.useUSB(keyBoard);

        computer.close();
    }
}
