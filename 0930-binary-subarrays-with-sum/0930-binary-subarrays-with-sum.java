class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        return numSub(nums,goal) - numSub(nums,goal-1);
        
    }
    
    public int numSub(int[] nums, int goal){
        if(goal < 0) return 0;
        int sum = 0;
        int ans = 0;
        int l = 0;
        int r= 0;
        while(r < nums.length) {

            sum += nums[r];
            while(l<nums.length && sum > goal) {
                sum-=nums[l];
                l++;
            }
            ans += r-l+1;     
            r++;


        }
        
        return ans;
    }
}