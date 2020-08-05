package day15.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lbf
 * @date 2020/7/30 15:03
 */
public class Demo3 {
    public static void main(String[] args) {
        Person[] array = {
                new Person("貂蝉",254),
                new Person("孙尚香",188),
                new Person("妲己",300),
                new Person("杨玉环",223),

        };
        Comparator<Person> comp = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        //第二个参数是排序规则

        Arrays.sort(array,comp);
        for (Person person: array){
            System.out.println(person);
        }
    }
//     new Comparator
}

