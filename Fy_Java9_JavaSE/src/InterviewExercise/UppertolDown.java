package InterviewExercise;

import com.alibaba.druid.sql.visitor.functions.Char;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/8/17 15:51
 */
public class UppertolDown {
    public static void main(String[] args) {
        //编程题：给出一句英文句子： "let there be light"
        //得到一个新的字符串，每个单词的首字母都转换为大写
        StringBuilder builder = new StringBuilder();
        StringBuilder str = builder.append("let there be light");
        for (int i = 0; i < str.length(); i++) {
           if (i == 0){
               System.out.print(Character.toUpperCase(str.charAt(i)));
           }else  if (str.charAt(i-1) == ' '){
               System.out.print(Character.toUpperCase(str.charAt(i)));
           }else {
               System.out.print(str.charAt(i));
           }
        }


    }
}
