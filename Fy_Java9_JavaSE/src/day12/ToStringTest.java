package day12;

/**
 * @author lbf
 * @date 2020/7/27 19:41
 */


public class ToStringTest{
            static int i = 1;
            public static void main(String args[]){
                System.out.println("love " + new ToStringTest());//love java
                ToStringTest a = new ToStringTest();
                a.i++;
                System.out.println("me " + a.i);//me 2
            }
            public String toString(){
                System.out.print("I ");//I
                return "java ";

        }
    }


