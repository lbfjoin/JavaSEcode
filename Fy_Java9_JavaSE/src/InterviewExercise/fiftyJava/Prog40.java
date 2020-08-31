package InterviewExercise.fiftyJava;

/**
 * @author lbf
 * @date 2020/8/25 8:02
 */
public class Prog40 {
    //    字符串排序。
    public static void main(String[] args) {
        String[] str = {"abc", "cad", "m", "fa", "f", "ddddddd"};
        String flag = " ";
        for (int j = str.length - 1; j >= 0; j--) {
            for (int i = 0; i < str.length - 1; i++) {
                if (str[i].length() < str[i + 1].length()) {
                    flag = str[i];
                    str[i] = str[i + 1];
                    str[i + 1] = flag;
                }
            }
        }
        for (String s : str) {
            System.out.print(s + "\t");
        }
    }
}
