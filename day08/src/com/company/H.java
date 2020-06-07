package com.company;

public interface H extends F,G{
    @Override
    default void method() {//子接口继承父接口 接口默认方法是写default

    }
}
