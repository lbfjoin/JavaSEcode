package com.company;

/**
 * @author lbf
 * @date 2020/5/15 11:06
 */
public class OwnArrayList02 {
    private int[] arr;
    private int size;
    public OwnArrayList02(int capacity){
        arr = new int[capacity];
        size = 0;

    }
    public OwnArrayList02(){
        this(10);
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
}
