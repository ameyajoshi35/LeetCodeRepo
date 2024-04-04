class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        int maxPrd = Integer.MIN_VALUE;
        int maxPrefix = Integer.MIN_VALUE;
        int maxSuffix = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i=0;i<nums.length;i++) {

            prefix *= nums[i];
            maxPrefix = Math.max(maxPrefix,prefix);
            if(prefix==0) prefix =1;
            
            suffix *= nums[nums.length-1-i];
            maxSuffix = Math.max(maxSuffix,suffix);
            if(suffix==0) suffix =1;
            
            maxPrd = Math.max(maxPrefix,maxSuffix);
            

        }

        return maxPrd;
    }
}