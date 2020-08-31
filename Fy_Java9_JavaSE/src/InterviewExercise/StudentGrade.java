package InterviewExercise;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @author lbf
 * @date 2020/8/21 7:47
 */
public class StudentGrade {
    public static void main(String[] args) {
        //1.图论某班有 40 个学生，学号为 180201-180240，
        // 全部参加 Java 集合阶段检测，给出所有同学的成绩 （可随机产生，范围为 50-100），
        // 请编写程序将本班 各位同学成绩从高往低排序打印输出， 注：成绩相同时学号较小的优先打印
        // 要求：打印的信息包含学号、姓名（姓名统一为 “同学 J”[J=10,11,12。。。]）和成绩 。
        Random random = new Random();
        ArrayList<String> list = new ArrayList<>();
        HashMap<ArrayList<String>, Integer> map = new HashMap<>();
        for (int i = 0; i < 40; i++) {
            String sno = "学号：" + 180201 + i++;
            String name = "同学" + ( i++);
            int score = random.nextInt(51) + 50;
//            System.out.println(sno + "\t"+ name +"\t"+ "\t分数：" +score );
            list.add(sno + "\t"+ name +"\t"+ "\t分数：" );
            for (int i1 = 0; i1 < list.size(); i1++) {
//                map.put(list.get(i),score);
            }
        }
    }
    public static  HashMap<ArrayList<Object>, Integer> orderByGrade(){

        return null;
    }
}
