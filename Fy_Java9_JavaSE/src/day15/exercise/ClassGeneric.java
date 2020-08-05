package day15.exercise;

/**
 * @author lbf
 * @date 2020/7/30 10:49
 */
public class ClassGeneric<DDD> {
    private DDD ddd;
    public ClassGeneric(){

    }
    public DDD getDdd() {
        return ddd;
    }

    public void setDdd(DDD ddd) {
        this.ddd = ddd;
    }
}
