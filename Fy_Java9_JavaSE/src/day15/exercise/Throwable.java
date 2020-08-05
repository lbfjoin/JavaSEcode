package day15.exercise;

/**
 * @author lbf
 * @date 2020/8/2 19:01
 */
public class Throwable {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int index = 4;
        System.out.println(judegeException(arr, index));


    }
    public static int judegeException(int[] arr,int index){
        if (index < 0 || index > arr.length - 1){
            throw  new NullPointerException("数组越界了兄弟");
        }
        return arr[index];
    }
}
