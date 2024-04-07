class Solution {
    public boolean checkValidString(String s) {
        
        int left = 0;
        int right = 0;
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '*'){
                left++;
            } else {
                left--;
            }
            
            if(s.charAt(s.length()-1-i) == ')'  || s.charAt(s.length()-1-i) == '*'){
                right++;
            } else {
                right--;
            }
            
            if(left < 0 || right < 0){
                return false;
            }
            
        }
        
        
        return true;
        
    }
}