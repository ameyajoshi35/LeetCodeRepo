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
        
        // for(TreeNode r : pMap.keySet()){
        //     System.out.println(r.val +"-"+pMap.get(r).val);
        // }
        
        q.add(target);
        if(k==0) ans.add(target.val);
        int d = 1;
        while(!q.isEmpty() && d <=k){
            
            int size = q.size();
            for(int i=0;i<size;i++) {
                TreeNode n = q.poll();
            
                isVisited.add(n);
                System.out.println(n.val);
                if(n.left != null && !isVisited.contains(n.left)) {
                    q.add(n.left);
                    if(k==d){
                        ans.add(n.left.val);
                    }
                }
                if(n.right != null && !isVisited.contains(n.right)) {
                    q.add(n.right);
                    if(k==d){
                        ans.add(n.right.val);
                    }
                }
                if(pMap.get(n) != null && !isVisited.contains(pMap.get(n))) {
                    q.add(pMap.get(n));
                    if(k==d){
                        ans.add(pMap.get(n).val);
                    }
                }
                
            }
            d++;
            
            
            
        }
        
        
        
       return ans;
        
    }
}