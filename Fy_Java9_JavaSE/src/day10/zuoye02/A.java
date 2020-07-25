package day10.zuoye02;

public interface A {
    public void showA();

    private void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.print(str + "\t");
        }
        System.out.println();
    }

    public default void showB10() {
        show10("BBBBB");
    }

    public default void showC10() {
        show10("CCCCC");
    }
}
