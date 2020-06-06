package com.company;

/**
 * @author lbf
 * @date 2020/5/15 11:06
 */
public class OwnArrayList02 {
    private int data[];
    private int size;
public OwnArrayList02(int capacity){
    data = new int[capacity];
    size = 0;
}
    public OwnArrayList02() {
      this(10);
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
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
    public int getCapacity(){
    return data.length;
    }
}
