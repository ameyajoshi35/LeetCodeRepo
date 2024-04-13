class Solution {
    public boolean isValid(String s) {
        
//         if(s.charAt(0)==')' || s.charAt(0)==']' || s.charAt(0)=='}' )                  return false;
        
        Stack<Character> st = new Stack();
        Stack<Character> st2 = new Stack();
        Map<Character,Character> map = new HashMap();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            } else if(!st.isEmpty()) {
                char c = st.pop();
                if(map.get(s.charAt(i)) != c){
                    return false;
                }
            } else {
                return false;
            }
        }
        
        
        return st.isEmpty();
        
    }
}