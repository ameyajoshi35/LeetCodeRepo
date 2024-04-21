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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
     
       List<Integer> ans = new ArrayList();
        
       Queue<TreeNode> q = new LinkedList();
       List<TreeNode> isVisited = new ArrayList();
       Map<TreeNode,TreeNode> pMap = new HashMap(); 
        
        q.add(root);
        pMap.put(root,null);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i= 0;i<size;i++){
                TreeNode n = q.poll();
                
                
                if(n.left != null){
                    q.add(n.left);
                    pMap.put(n.left,n);
                }
                if(n.right != null){
                    q.add(n.right);
                    pMap.put(n.right,n);
                }
            }
        }
        
        
        q.add(target);
        int d = 0;
        while(!q.isEmpty()){
            
            
            if(d++==k) break;
            
            
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode n = q.poll();
            
                isVisited.add(n);
                //System.out.println(n.val);
                if(n.left != null && !isVisited.contains(n.left)) {
                    q.add(n.left);
                }
                if(n.right != null && !isVisited.contains(n.right)) {
                    q.add(n.right);
                    
                }
                if(pMap.get(n) != null && !isVisited.contains(pMap.get(n))) {
                    q.add(pMap.get(n));
                }
                
            }
           
            
            
            
        }
        
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            ans.add(n.val);
        }
        
        
       return ans;
        
    }
}