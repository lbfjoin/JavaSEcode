package InterviewExercise.Computer;

/**
 * @author lbf
 * @date 2020/8/11 20:25
 */
public class Computer {
    public void run(){
        System.out.println("电脑开机");
    }
    public void useUSB(USB usb){
        if (usb!= null) {
            usb.open();
            if (usb instanceof Mouse) {
                Mouse mouse = (Mouse) usb;
                mouse.click();
            }
            if (usb instanceof KeyBoard) {
                KeyBoard keyBoard = (KeyBoard) usb;
                keyBoard.input();
            }
            usb.close();
        }
    }
    public void close(){
        System.out.println("电脑关闭");
    }
}
