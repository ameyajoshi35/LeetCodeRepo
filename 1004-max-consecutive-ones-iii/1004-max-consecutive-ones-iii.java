class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int j = 0;
        int zeros = 0;
        int max = 0;
        int l =0; int r = 0;
    
        while(r < nums.length){
            
            if(nums[r] == 0) {
                zeros++;
            }
            if(l< nums.length && zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            } 

            if(zeros <= k) {
                int length = r - l + 1;
                max = Math.max(max, length);
            }
            r++;
            
            
            
        }
        
        return max;
        
    }
}