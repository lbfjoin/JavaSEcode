package day10.zuoye03;

public interface A {
    public void showA();
    private static void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str + "\t");
        }
        System.out.println();
    }
    public static void showB10(){
        System.out.println("static BBBB");
        A.show10("BBBBB");
    }
    public static void showC10(){
        System.out.println("static CCCC");
        A.show10("CCCCC");
    }
}
