
/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int water =0 ;
        int max = 0;//最高点的值
        int index = 0;//最高点的位置
        //1.找最高点
        for(int i = 0; i < height.length; i++){
            if(max < height[i]){
                max = height[i];
                index = i;
            }
        }

        //左右两边夹击，遍历最高点
        int pre = 0;//记录移动的位置
        boolean flage = false;
        for ( int i = 0; i < index; i++){
            if(height[i]<height[pre]) water += (height[pre] - height[i]);
            else pre = i;
        }
        flage = false;
        pre = height.length - 1;
        for ( int i = height.length -2; i > index; i--){
            if(height[i]<height[pre]) water += (height[pre] - height[i]);
            else pre = i;
        }
        return water;
    }
}
// @lc code=end

