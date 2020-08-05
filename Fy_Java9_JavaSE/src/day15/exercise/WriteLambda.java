package day15.exercise;

import com.company.exercise.Person;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lbf
 * @date 2020/8/2 19:53
 */
public class WriteLambda {
    public static void main(String[] args) {
        Person[] array = {
                new Person("貂蝉", 223),
                new Person("孙尚香", 18),
                new Person("妲己", 300),
                new Person("杨玉环", 221),
        };
        Arrays.sort(array,(Person a,Person b)->{
            return a.getAge() - b.getAge();
        });
        for (Person person:array){
            System.out.println(person);
        }
    }


}
