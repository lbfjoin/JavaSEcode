package day12;

import java.util.Objects;

/**
 * @author lbf
 * @date 2020/7/27 14:29
 */
public class Person {
    private String name;
    private int age;
//    @Override
//    public String toString(){
//        return "Person{" + "name=" + name + ",age=" + age + "}";
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    @Override
////    public boolean equals(Object o){
////        //如果对象的地址值一样，则认为相同
////        if (this == o){
////            return true;
////        }
////        //如果参数为空，或者类型信息不一样，则认为不同
////        if ( o == null || getClass() != o.getClass())
////        return false;
////        // 转换为当前类型
////        Person person = (Person) o;
////        //要求基本类型相等，并且将引用类型交给Objects类的equals静态方法取用结果
////        return this.age == person.age && Objects.equals(this.name,person.name);
////    }
    @Override
    public boolean equals(Object o ){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass() )
            return false;
        Person person = (Person)o;
        return this.age == person.age && Objects.equals(this.name,person.name);
    }


}
