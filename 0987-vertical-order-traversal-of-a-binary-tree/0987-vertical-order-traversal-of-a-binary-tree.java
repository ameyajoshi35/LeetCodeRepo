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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        Map<Integer,Map<Integer,List<Integer>>> map = new TreeMap();
        vt(root,0,0,map);
        List<List<Integer>> ans = new ArrayList();
        
        for(Integer k : map.keySet()){
            List<Integer> list = new ArrayList();
            Map<Integer,List<Integer>> rm = map.get(k);
            for(Integer row: rm.keySet()){
                List<Integer> l = rm.get(row);
                Collections.sort(l);
                list.addAll(l);
                
            }
            ans.add(list);
        }
        
        return ans;
        
    }
    
    public void vt(TreeNode root, int row,int col, Map<Integer,Map<Integer,List<Integer>>> map){
        
        if(root == null) {
            return;
        }
        
        if(map.get(col) == null) {
            List<Integer> l = new ArrayList();
            l.add(root.val);
            Map<Integer,List<Integer>> rM = new TreeMap();
            rM.put(row,l);
            map.put(col, rM);
        } else {
            Map<Integer,List<Integer>> rM  = map.get(col);
            List<Integer> l = rM.get(row);
            if(l==null) {
                l = new ArrayList();
                l.add(root.val);
                rM.put(row,l);
            } else {
                l.add(root.val);
            }
            
        }
        
        if(root.left != null){
            vt(root.left,row+1,col-1,map);
        }
        if(root.right!=null){
            vt(root.right, row+1,col+1,map);
        }
        
    }
}