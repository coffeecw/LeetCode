package cn.cw.array;

/**
 * created by coffeecw 2019/10/05
 *
 * 26. 删除排序数组中的重复项
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *示例 1:
 *
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 * 你不需要考虑数组中超出新长度后面的元素
 *
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int  removeDuplicates(int[] nums) {
        //边界条件
        if(nums==null || nums.length==0){
            return 0;
        }
        //记录数组下标,从1开始
        int count = 1;
        //注意for循环也是从1开始
        for (int i = 1; i <nums.length ; i++) {
            //数组前一个数和后一个数比较
            if(nums[i-1]!=nums[i]){
                nums[count++]=nums[i];
            }
        }
        return count;
    }
}
