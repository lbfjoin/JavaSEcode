package day10;

/**
 * @author lbf
 * @date 2020/7/24 11:10
 */
public class Dog extends Animal {
    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void watchHouse(){
        System.out.println("看家");
    }
}
