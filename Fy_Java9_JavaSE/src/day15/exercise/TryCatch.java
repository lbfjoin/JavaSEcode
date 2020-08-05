package day15.exercise;

import java.io.FileNotFoundException;

/**
 * @author lbf
 * @date 2020/8/2 19:27
 */
public class TryCatch {
    public static void main(String[] args) {
        try {
            read("xiaomimi.com");
        } catch (FileNotFoundException e) {
            System.out.println("============");
            System.out.println(e);
        }
        System.out.println("end");

    }
    public static void read(String path) throws FileNotFoundException {
        if (path != "XIAOMIMI.com"){
            throw new FileNotFoundException("未找到该位置");
        }
    }
}
