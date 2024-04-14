class Solution {
    public boolean canJump(int[] nums) {
        
        int possibleIndex = -1;
        int toIndex = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            
             if(i+nums[i] >= toIndex){
                 toIndex = i;
             }
            
        }
        
        
        return toIndex == 0;
        
    }
}