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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       
    if(root == null) return false;
       return hasPathSum(root,root.val,targetSum);
        
    }
    
    public boolean hasPathSum(TreeNode root, int sum, int targetSum){
         
         if(root == null) return false;
         if(root.left == null && root.right == null) {
              if(sum == targetSum){
                  return true;
              }
              return false;
          }
        
          
        
          boolean isTrue = false;
          if(root.left != null) {
              sum = sum + root.left.val;
          }
          isTrue = hasPathSum(root.left,sum,targetSum); 
          
        
          if(!isTrue) {
                  if(root.left != null)
                  sum = sum - root.left.val;
        
                  if(root.right != null) {
                     sum = sum + root.right.val;
                     isTrue = hasPathSum(root.right,sum,targetSum); 
                  }
                  
           }
        
        
           return isTrue;
          
        
          
    }
}