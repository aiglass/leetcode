/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();//存储字符到hash表
        int ans = 0, i = 0, j = 0;// ans长度，i左指针，j右指针
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){//判断字符是否存在在hash表中
                set.add(s.charAt(j++));//不存在则存入hash表
                ans = Math.max(ans, j - i);//设置最大值
            }
            else {
                set.remove(s.charAt(i++));//有则删除第i个字符
            }
        }
        return ans;
    }
}
// @lc code=end

