/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left,root.right);
    }
    
    public boolean isSymmetric(TreeNode left, TreeNode right){
        
        if(left==null && right == null){
            return true;
        }
        
        if(left==null || right == null){
            return false;
        }
        
        if(left.val != right.val){
            return false;
        }
        System.out.println(left.val+"-"+right.val);
        boolean isT = isSymmetric(left.left, right.right);
        
        if(isT)
        isT = isSymmetric(left.right, right.left);
        
        
        
        return isT;
    }
}