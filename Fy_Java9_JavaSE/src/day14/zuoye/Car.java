package day14.zuoye;

import java.util.Objects;

/**
 * @author lbf
 * @date 2020/7/29 20:27
 */
public class Car {

        //请使用Map集合存储自定义数据类型Car做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
     private String name;
     private String color;

    public Car() {
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}
