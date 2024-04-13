class MinStack {
    
    Stack<Integer> st = null;
    Stack<Integer> minSt = null;
   
    public MinStack() {
        
        st = new Stack();
        minSt = new Stack();
        
    }
    
    public void push(int val) {
        // System.out.println(val);
        st.push(val);
        if(minSt.isEmpty()){
            minSt.push(val);
            return;
        }
        if(minSt.peek() >= val){
            minSt.push(val);
        }
    }
    
    public void pop() {
        
        Integer val = st.pop();
        System.out.println(minSt.peek());
         if(minSt.peek().intValue()== val){
             minSt.pop();
         }
        
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */