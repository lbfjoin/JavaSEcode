package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lbf
 * @date 2020/4/19 19:55
 */
public class Random07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的名字");
        String name = scanner.nextLine();
        Random random = new Random();
        int num = random.nextInt(6);
        String zhiye = " ";
        switch(num){
            case 0:
                zhiye = "宰相";
                break;
            case 1:
                zhiye = "一品带刀侍卫";
                break;
            case 2:
                zhiye = "皇帝";
                break;
            case 3:
                zhiye = "大内总管";
                break;
            case 4:
                zhiye = "店小二";
                break;
            default:
                zhiye = "江湖郎中";
                break;
        }
        System.out.println("您好"+ name + "经过大数据分析，您上辈子的职业是"+zhiye);
    }
}
