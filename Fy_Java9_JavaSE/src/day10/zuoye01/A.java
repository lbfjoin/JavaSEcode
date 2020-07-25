package day10.zuoye01;

public interface A {
    public abstract void showA();
    public default void showB(){
        System.out.println("showB");
    }
}
