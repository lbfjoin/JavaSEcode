package day15.myGeneric;

/**
 * @author lbf
 * @date 2020/7/30 9:19
 */
public class MyGenericMethod {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }
    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
}
