package cn.cw.array;

/**
 * created by coffeecw 2019/10/07
 * 35. 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start+1 < end){
            int mid = (end-start)/2+start;
            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                end = mid;
            }else{
                start = mid;
            }
        }
        //如果没有查找到，选择插入的位置 target___target__target
        if(target<=nums[start]){
            return start;
        }else if (target<=nums[end]){
            return end;
        }else{
            return end+1;
        }
    }
}
