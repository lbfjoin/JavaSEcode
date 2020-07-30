package day14.zuoye;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lbf
 * @date 2020/7/30 8:10
 */
public class CarTest {
    public static void main(String[] args) {
        HashMap<Car, Integer> test = new HashMap<>();
        Car car1 = new Car("福特","黑色");
        Car car2 = new Car("奔驰","流光蓝");
        Car car3 = new Car("雷克萨斯","暗夜绿");
        test.put(car1,1000000);
        test.put(car2,6666666);
        test.put(car3,8888888);

        for (Car car:test.keySet()){
            System.out.println( car.getName()+":"+car.getColor()+":"+test.get(car));
        }
        Set<Map.Entry<Car, Integer>> set = test.entrySet();
        for (Map.Entry<Car, Integer> entry : set){
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName() + ","+ key.getColor() + ":"+ value);
        }
    }
}
