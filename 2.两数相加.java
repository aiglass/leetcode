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
    int crr=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode newList = new ListNode(0);
       ListNode a = l1, b = l2, curr = newList;
       int carry = 0;
       while(a != null || b != null) {
           int x = (a != null)?a.val:0;
           int y = (b != null)?b.val:0;
           int sum = carry + x + y;
           carry = sum / 10;
           curr.next = new ListNode(sum%10);
           curr = curr.next;
           if (a != null) a = a.next;
           if (b != null) b = b.next;
       }
       if(carry > 0){
           curr.next =new ListNode(carry);
       }
       return newList.next;
    }
}
// @lc code=end

