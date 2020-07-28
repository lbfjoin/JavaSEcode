package day11.FatherAndSon;

/**
 * @author lbf
 * @date 2020/7/25 18:46
 */
public class Son extends Father {
    int x = 2;
    public Son(){
        System.out.println("Son");
    }
    public Son(String s){
        System.out.println("Son" + s);
    }
}
