class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int n: nums) {
            sum+= n;
            maxSum = Math.max(maxSum, sum);
            sum = sum < 0 ? 0 : sum;
        }

        return maxSum;
        
    }
}