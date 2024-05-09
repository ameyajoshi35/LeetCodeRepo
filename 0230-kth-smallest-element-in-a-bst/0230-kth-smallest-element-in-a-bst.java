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
    public int kthSmallest(TreeNode root, int k) {
        
        
        int[] ans = new int[1];
        int[] cnt = new int[1];
        inorder(root,k,cnt,ans);
        return ans[0];
        
        
    }
    
    public void inorder(TreeNode root, int k,int[] cnt, int[] ans){
        
        if(root == null){
            return;
        }
        
        inorder(root.left,k,cnt,ans);
        
        cnt[0]++;
        if(cnt[0]==k){
            ans[0] = root.val;
        }
        
        
        inorder(root.right,k,cnt,ans);
        
    }
}