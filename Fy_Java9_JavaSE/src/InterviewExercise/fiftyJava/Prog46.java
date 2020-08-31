package InterviewExercise.fiftyJava;

/**
 * @author lbf
 * @date 2020/8/20 21:25
 */
public class Prog46 {
    public static void main(String[] args) {
        //两个字符串连接程序
//        String str1 = "hello";
//        String str2 = "world";
//        String str = str1 + str2;
//        System.out.println(str);
        StringBuilder builder = new StringBuilder();
        builder.append("hello");
        builder.append("world");
        System.out.println(builder);
    }
}
