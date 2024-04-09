class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> cmap = new HashMap();
        
        int r = 0;
        int l = 0;
        int length = 0;
        int max = 0;
        while(r<s.length()){
            if(cmap.get(s.charAt(r)) == null || cmap.get(s.charAt(r)) < l) {
                cmap.put(s.charAt(r), r);
                length = r - l+1;
                 r++;
            } else {   
                l = cmap.get(s.charAt(r)) + 1;
            }
            max = Math.max(max, length);   
           
            
         }
        
        return max;
        
       }
}