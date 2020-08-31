package InterviewExercise.fiftyJava;

/**
 * @author lbf
 * @date 2020/8/19 20:53
 * 计算字符串中子串出现的次数
 */
public class Prog49 {
    //计算字符串中子串出现的次数
    public static void main(String[] args) {
        String str = "I come from County DingYuan Province AnHui.";
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' '){
                count++;
            }
        }
        System.out.println(count+1);
    }

}
