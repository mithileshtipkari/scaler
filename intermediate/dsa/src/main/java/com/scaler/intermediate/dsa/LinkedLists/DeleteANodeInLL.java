package com.scaler.intermediate.dsa.LinkedLists;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
//TC - O(N)
//SC - O(1)
public class DeleteANodeInLL {
    public ListNode solve(ListNode A, int B) {
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
        if(withinLimits && size>=1 && size<=100000 && B>=0 && B<size){
            //criteria satisfied then only move ahead
            // System.out.println("s -" + size);
            if(B == 0){//remove 1st ele, we cannot traverse to 0-1th position and dereference 0th node
                return A.next;
            }
            ListNode timetraveler = A;
            int i=0;
            //reach till ith node
            while(timetraveler != null && i!=B-1){//N
                timetraveler = timetraveler.next;
                i++;
            }//now timetraveler points to i-1th node, now delete ith node, de-reference it, okay
            // System.out.println("timetraveler cal -" + timetraveler.val);
            timetraveler.next = timetraveler.next.next;
        }
        return A;
    }
}
//TC - O(N)
//SC - O(1)


