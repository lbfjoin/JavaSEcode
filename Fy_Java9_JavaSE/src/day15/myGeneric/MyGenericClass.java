package day15.myGeneric;

/**
 * @author lbf
 * @date 2020/7/30 9:04
 */
public class MyGenericClass<MVP> {
        //没有MVP类型，在这里代表未知的一种数据类型
       //未来传递什么就是什么类型
    private MVP mvp;

    public MyGenericClass() {
    }

    public MyGenericClass(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
}
