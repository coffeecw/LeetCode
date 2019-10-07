package cn.cw.array;

/**
 * created by coffeecw 2019/10/07
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{4,-1,2,1};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int res = nums[0];
        for (int i = 1;i<nums.length; i++){
            sum = Math.max(nums[i],sum+nums[i]);
            res = Math.max(res,sum);
        }
        return res;
    }
    public static int maxSubArray2(int[] nums) {
     int[] dp = new int[nums.length];
     dp[0] = nums[0];
     int res = nums[0];
     for (int i = 1; i < nums.length; i++){
         dp[i] = nums[i] + (dp[i-1] < 0 ? 0:dp[i-1]);
         res = Math.max(dp[i],res);
     }
     return res;
    }
}
