/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;//用作计数
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i+1]){
                ++k;
                nums[k]=nums[i+1];
            }
        }
        return k+1;
    }
}
// @lc code=end

