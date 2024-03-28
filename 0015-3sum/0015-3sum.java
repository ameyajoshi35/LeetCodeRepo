class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        Set<List<Integer>> res = new HashSet();
        Arrays.sort(nums);
        
  
        
        for(int i=0;i<nums.length;i++){
            int l = i+1; int r = nums.length-1;
            
            while(l<r){
                if(nums[i]+nums[l]+nums[r] == 0) {
                     List<Integer> list = new ArrayList();
                     list.add(nums[i]);
                     list.add(nums[l]);
                     list.add(nums[r]);                     
                     res.add(list);
                     l++;
                     r--;
                } else if(nums[i] + nums[l] + nums[r] > 0){
                    r--;
                } else {
                    l++;
                }
            }
                
        }
        return new ArrayList(res);
        
     }
        
        
        
    
    
//     public void findTwoSum(int[] nums, List<List<Integer>> res, int n) {
       
        
//         int l = 0; int r = nums.length-1;
        
//         while(l<=r) {
//             if(nums[l]+ nums[r] + n == 0){
//                List<Integer> list = new ArrayList();
//                list.add(nums[l]);
//                list.add(nums[r]);
//                list.add(n);
//                res.add(list);
//             } else if(nums[l]+ nums[r] + n > 0) {
//                 r--;
//             } else {
//                 l++;
//             }
            
//         }
//     }
}