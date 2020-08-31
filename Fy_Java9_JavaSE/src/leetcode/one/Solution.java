package leetcode.one;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author lbf
 * @date 2020/8/14 8:51
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums =new int[]{2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
    }
//    nums = [2,7,11,15];target =9
    public int[] twoSum(int[] nums,int target){
        //方法一：
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i +1; j < nums.length ; j++) {
//                if (nums[i] + nums[j] == target){
//                    //返回索引的位置
//                    return new int[]{i,j};
//                }
//            }
//        }
        //方法二：
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
