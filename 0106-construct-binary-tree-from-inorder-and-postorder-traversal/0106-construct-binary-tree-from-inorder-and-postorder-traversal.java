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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int index = 0;
        Map<Integer,Integer> hm = new HashMap();
        for(int n:inorder){
            hm.put(n,index++);
        }
        
        
        return  buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,hm);
        
    }
    
    public TreeNode buildTree(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, Map<Integer,Integer> hm ){
        
        if(is>ie || ps>pe) return null;
        
        
        int iR = hm.get(postorder[pe]);
        int numElems = iR - is;
        TreeNode root = new TreeNode(postorder[pe]);
        root.left = buildTree(inorder,is,iR-1,postorder,ps,ps+iR-is-1,hm);
        root.right = buildTree(inorder,iR+1,ie,postorder,ps+iR-is,pe-1,hm);
        
        return root;
    }
        
}