class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        int cnt = 0;
        
        
        for(int i=0;i<nums.length;i++){
            int prd = 1;
            
            for(int j=i;j<nums.length;j++){
                
                prd = prd * nums[j];
                if(prd < k){
                    cnt++;
                } else{
                    break;
                }
                
            }
            
        }
        
        
        return cnt;
        
    }
}