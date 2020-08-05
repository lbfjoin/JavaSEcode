package day15.exercise;

/**
 * @author lbf
 * @date 2020/7/30 10:50
 */
public class ClassTest  {
   public static void main(String[] args){
       ClassGeneric<String> generic = new ClassGeneric<>();
       generic.setDdd("lbf");
       System.out.println(generic.getDdd());
       ClassGeneric<Integer> generic1 = new ClassGeneric<>();
       generic1.setDdd(123);
       System.out.println(generic1.getDdd());
   }

}
