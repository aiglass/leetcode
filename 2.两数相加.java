/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(0);
       ListNode curr =  dummy;
       int carry = 0;
       while(l1 != null || l2 != null) {
           int sum = carry;
           sum = (l1 != null) ? sum+l1.val : sum;
           sum = (l2 != null) ? sum+l2.val : sum;
           curr.next = new ListNode(sum%10);
           carry = sum / 10;
           l1 = l1 == null ? null : l1.next;
           l2 = l2 == null ? null : l2.next;
           curr = curr.next;
       }
       if(carry != 0){
           curr.next =new ListNode(carry);
       }
       return dummy.next;
    }
}
// @lc code=end

