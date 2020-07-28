package day13;

import java.util.Arrays;

/**
 * @author lbf
 * @date 2020/7/28 10:15
 */
public class TestSystem2 {
    public static void main(String[] args) {
        //将src中前三个元素，赋值到dest的前三个位置上 复制元素前
        //操作之后：[1，2，3，4，5] dest[1，2，3，9，10]
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);

        System.out.println(Arrays.toString(dest));
    }
}
