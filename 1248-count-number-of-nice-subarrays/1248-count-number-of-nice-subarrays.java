class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        
        return numbSub(nums,k) - numbSub(nums,k-1);
    }
    
    public int numbSub(int[] nums, int k){
        if(k < 0) return 0;
        
        int l = 0, r = 0;
        int cnt = 0; 
        int max = 0;
        int sum = 0;
        while(r<nums.length) {
            
            sum+=nums[r]%2;
            
            while(sum > k){
                sum-=nums[l]%2;
                l++;
            }
            cnt += r-l+1;
            r++;
            
        }
        
        return cnt;
    }
}