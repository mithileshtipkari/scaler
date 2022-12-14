package com.scaler.intermediate.dsa.LinkedLists;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PrintLL {
    public void solve(ListNode A) {
        //calculate size of LinkedList
        int size=0;
        ListNode temp = A;
        boolean withinLimits = true;
        while(temp != null && withinLimits){//N
            if(temp.val >= 1 && temp.val<=1000000000){
                withinLimits = true;
            } else {
                withinLimits = false;
            }
            size++;
            temp = temp.next;
        }
        // System.out.println("withinLimits -" + withinLimits);
        if(withinLimits && size>=1 && size<=100000){
            //criteria satisfied then only move ahead
            // System.out.println("s -" + size);
            ListNode timetraveler = A;
            while(timetraveler != null){//N
                System.out.print(timetraveler.val + " ");
                timetraveler = timetraveler.next;
            }
            System.out.println();
        }
    }
}
//TC - N
//SC - 4 variables taken, so O(1)
class ListNode {
  public int val;
  public ListNode next;
  ListNode(int x) { val = x; next = null; }
}