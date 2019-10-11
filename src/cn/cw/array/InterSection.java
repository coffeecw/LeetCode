package cn.cw.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * created by coffeecw 2019/10/11
 * 349. 两个数组的交集
 */
public class InterSection {
    public static void main(String[] args) {

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        //数组排序
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<>();
        for(int num :nums1){//遍历nums1
            if(isContains(nums2,num)){//判断nums2中是否包含在nums1
                set.add(num);//去重添加数据
            }
        }
        int[] res = new int[set.size()];//接收set集合中的数据
        int i = 0;
        for (int num : set){
            res[i++] = num;
        }
        return res;
    }
    //二分查找
    public static boolean isContains(int nums[],int target){
        int low = 0;
        int  height = nums.length - 1;
        while(low<=height){
            int mid = (low+height)/2;
            if(target>nums[mid]){
                low = mid +1;
            }else if(target<nums[mid]){
                height = mid -1;
            }else{
                return true;
            }
        }
        return false;
    }
}
