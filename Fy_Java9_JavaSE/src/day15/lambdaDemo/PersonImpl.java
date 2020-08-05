package day15.lambdaDemo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lbf
 * @date 2020/7/30 15:33
 */
public class PersonImpl {
    public static void main(String[] args) {

        Person[] array = {
                new Person("l", 111),
                new Person("lb", 222),
                new Person("lbf", 444),
                new Person("lbfff", 333),
        };
        Comparator<Person> comp = new Comparator<>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array,comp);
//        System.out.println(Arrays.toString(array));
        for (Person person:array){
            System.out.println(person);
        }
    }
}
