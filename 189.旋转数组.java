/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        //使用反转会进行三次反转,封装一份反转方法reverse
        //1.全部反转
        reverse(nums, 0, nums.length-1);
        //2.反转前k个
        reverse(nums, 0, k-1);
        //3.反转后面nums.length-k个
        reverse(nums, k, nums.length-1);
    }
    public void reverse(int[] nums, int start, int end) {
        int temp = 0;
        while(start < end) {
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
// @lc code=end

