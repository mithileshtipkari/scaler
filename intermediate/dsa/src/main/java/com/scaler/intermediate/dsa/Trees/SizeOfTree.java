package com.scaler.intermediate.dsa.Trees;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class SizeOfTree {
    boolean withinLimits = true;
    public int solve(TreeNode A) {
        int size = size(A);
        if(withinLimits && size>=1 && size<=100000){
            // System.out.println("within limits -" + withinLimits);
            return size;
        }
        return -1;
    }

    public int size(TreeNode A){
        if(withinLimits){
            if(A == null){
                return 0;
            }
            if(A.val>=0 && A.val<=10000000){
                int l = size(A.left);
                int r = size(A.right);
                return l+r+1;
            } else {
                withinLimits = false;
            }
        }
        return -1;
    }
}

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
  }
