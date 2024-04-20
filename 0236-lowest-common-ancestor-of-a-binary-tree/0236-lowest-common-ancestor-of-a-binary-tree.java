/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null || root == p || root == q) {
            return root;
        }
          
        TreeNode l = lowestCommonAncestor(root.left,p,q);
        TreeNode r = lowestCommonAncestor(root.right,p,q);
        
        if(l == null){
            return r;
        } else if (r == null){
            return l;
        } else {
            return root;
        }
        
    }
    
    public boolean lca(TreeNode root, Stack<TreeNode> st, TreeNode p) {
        
        if(root == p) {
            st.add(root);
            return true;
        }
        if(root == null) {
            return false;
        }
        
        st.add(root);
       
        boolean isTrue = lca(root.left,st,p);
        
        if(!isTrue) {
          
          
          isTrue = lca(root.right,st,p);
          
        }
        if(!isTrue) {
            System.out.println(st.peek().val);
            st.pop();
        }
        
        
        return isTrue;
        
    }
}