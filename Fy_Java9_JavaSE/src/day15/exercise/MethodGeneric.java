package day15.exercise;

import org.w3c.dom.ls.LSOutput;

/**
 * @author lbf
 * @date 2020/7/30 13:59
 */
public class MethodGeneric {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }
    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }


}
