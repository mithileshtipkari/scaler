package com.scaler.intermediate.dsa.LinkedLists;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PrintReverseLL {
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
            //currentNode = A, pass to print(A) function to make use of stack using recursion
            //if currentNode.next != null, give currentNode.next to print function
            ListNode timetraveler = A;
            print(A);
            System.out.println();
        }
    }

    public void print(ListNode currentNode){
        if(currentNode.next != null){
            print(currentNode.next);
        }
        System.out.print(currentNode.val + " ");
    }
}
//TC - O(N), as traversing through all ele in LL
//SC - N nodes for recursive call + 2 local nodes -> O(N)
