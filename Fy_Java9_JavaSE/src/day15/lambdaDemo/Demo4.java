package day15.lambdaDemo;

import java.util.Arrays;

/**
 * @author lbf
 * @date 2020/7/30 16:32
 */
public class Demo4 {
    public static void main(String[] args) {
        Person[] array = {
                new Person("貂蝉",254),
                new Person("孙尚香",188),
                new Person("妲己",300),
                new Person("杨玉环",223),

        };
        Arrays.sort(array,(Person a,Person b) ->{
            return a.getAge() - b.getAge();
        });
        for (Person person : array){
            System.out.println(person);
        }
    }
}
