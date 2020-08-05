package day15.execptionDemo;

import java.io.FileNotFoundException;

/**
 * @author lbf
 * @date 2020/7/30 14:13
 */
public class Demo4 {
    public static void main(String[] args) {
        try {
            read("xiaomiMi.txt");
        } catch (Exception e) {
            //在try中抛出什么异常，在括号中就捕获什么异常类型
//            e.printStackTrace();
            System.out.println("+++++++++++");
            System.out.println(e);
        }finally {
            System.out.println("不管try和catch执行什么，我这里都会执行");
            System.out.println("我是接盘侠");
        }
        System.out.println("end");
    }

    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("xiaomimi.txt")) {
            throw new FileNotFoundException("你的文件怎么消失了呢");
        }
    }
}
