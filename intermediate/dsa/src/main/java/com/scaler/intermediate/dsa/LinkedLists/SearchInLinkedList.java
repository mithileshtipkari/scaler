/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
//TC - O(N)
//SC - o(1)
public class SearchInLinkedList {
    public int solve(ListNode A, int B) {
        int size=0;
        // ListNode temp = A;
        if(B>=1 && B<=1000000){//B constraint
            while(A != null && size<=100000){//N //checks size constraint
                if(A.val >= 1 && A.val<=1000000000){ //value constraint
                    if(A.val == B) return 1;
                }
                size++;
                A = A.next;
            }
            return 0;
        }
        return -1;
    }
}