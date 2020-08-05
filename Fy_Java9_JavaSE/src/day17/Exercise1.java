package day17;

/**
 * @author lbf
 * @date 2020/8/2 16:58
 */
public class Exercise1 <MVP> {
    private MVP mvp;
    public Exercise1(){

    }
    public Exercise1(MVP mvp){
        this.mvp = mvp;
    }
    public MVP getMvp(){
        return mvp;
    }
    public void setMvp(MVP mvp){
        this.mvp = mvp;
    }
}
