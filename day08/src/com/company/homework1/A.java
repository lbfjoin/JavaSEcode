package com.company.homework1;

import org.w3c.dom.ls.LSOutput;

public interface A {
   public abstract void showA();
   private static void show10(String str){
       for (int i = 0; i < 10; i++) {
           System.out.print(str + " \t");
       }
   }
   public static void showB10(){
       System.out.println("static BBBB");
       show10("BBBB");
       System.out.println();
   }

    public static void showC10(){
        System.out.println("static CCCC");
        show10("CCCC");
    }
}
