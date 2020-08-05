package day15.exercise;

import java.io.FileNotFoundException;

/**
 * @author lbf
 * @date 2020/7/30 14:30
 */
public class FinallyDemo {
    public static void main(String[] args) {
        try{
            read("kkkkkkkkk");
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println(e);
        }
    }
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("121541212")){
            throw new FileNotFoundException("输入的不正确");
        }
    }
}
