package com.company.homework;

/**
 * @author lbf
 * @date 2020/6/7 19:04
 */
public class Star {
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
    public void getUniverse(Universe universe){
        if (universe != null){
            if (universe instanceof Sun)
            universe.doAnything();
        }
    }
}
