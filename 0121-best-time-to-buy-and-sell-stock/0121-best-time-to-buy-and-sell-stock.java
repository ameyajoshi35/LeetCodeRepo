class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int ans = 0;

        
        for(int i=1;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            int max = Math.max(min,prices[i]);
            if(ans < (max-min)){
                ans = (max-min);
            }

        }
       
        return ans < 0 ? 0: ans;
        
    }
}