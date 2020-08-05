package day15.exercise;

import java.io.FileNotFoundException;

/**
 * @author lbf
 * @date 2020/8/2 19:31
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        try{
            read("xiaomimi.com");
        } catch (FileNotFoundException e) {
            System.out.println("=====================");
            System.out.println(e);

        }finally{
            System.out.println("无论发生任何情况，我都会执行");
        }
    }
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("XIAOMIMI.com")){
            throw new FileNotFoundException("文件找不到了");
        }
    }
}
