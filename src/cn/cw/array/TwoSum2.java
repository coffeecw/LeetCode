package cn.cw.array;

import java.util.Arrays;

/**
 * created by coffeecw 2019/10/11
 * 167. 两数之和 II - 输入有序数组
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
       int left,right;
       int l = 0;
       int r = numbers.length - 1;
       while (l<r){
           left = numbers[l];
           right = numbers[r];
           if(target<(left+right)){
               r--;
               continue;
           }
           if(target>(left+right)){
               l++;
               continue;
           }
           return new int[]{l+1,r+1};
       }
       return null;
    }
}
