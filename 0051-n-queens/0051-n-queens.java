class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        List<List<String>> brd = createBoard(n);
        List<List<String>> ans = new ArrayList();
        int[] leftRow = new int[n];
        int[] lowerDiagonal = new int[2*n-1];
        int[] upperDiagonal = new int[2*n-1];
        solve(ans,brd,0,0,n,leftRow,lowerDiagonal,upperDiagonal);        
        return ans;
    }
    
    public boolean isSafe(List<List<String>> ans, int row, int col, int n){
        
          int drow = row;
          int dcol = col;
        
          //check row
          while(col>=0){
              if(ans.get(row).get(col--) == "Q") return false;
          }
        
        //check up diagonal
          row = drow;
          col = dcol;
          while(row>=0 && col>=0){
              if(ans.get(row--).get(col--) == "Q") return false;
          }
        
        //check down diagonal
          row = drow;
          col = dcol;
          while(row<n && col>=0){
              if(ans.get(row++).get(col--) == "Q") return false;
          }
        
          return true;
    }
    
    public void solve(List<List<String>> ans, List<List<String>> brd, int row, int col, int n, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal) {
        if(col == n) {
            
          List<String> newLi = new LinkedList();
          for(List<String> l: brd) {
              
              StringBuilder sb = new StringBuilder();
              
              for(String s: l){
                  sb.append(s);
              }
              // System.out.println("adding"+ sb.toString());
              newLi.add(sb.toString());
              
          }
          ans.add(newLi);
          return;
            
        }
         
        for(int i=0;i<n;i++){
             
             if(leftRow[i]==0 && lowerDiagonal[i + col]==0 && upperDiagonal[brd.size() - 1 + col - i] == 0 ) {
                 
                 brd.get(i).set(col,"Q");
                 leftRow[i] = 1;
                 lowerDiagonal[i + col] = 1;
                 upperDiagonal[brd.size() - 1 + col - i] = 1;
                 solve(ans,brd,i,col+1,n,leftRow,lowerDiagonal,upperDiagonal);
                 brd.get(i).set(col,".");
                 leftRow[i] = 0;
                 lowerDiagonal[i + col] = 0;
                 upperDiagonal[(brd.size() - 1 + col - i)] = 0;
             }
         }
        
    }
    
    public List<List<String>> createBoard(int n) {
        
        List<List<String>> board = new ArrayList();
        for(int i=0;i<n;i++) {
            
            List<String> list = new LinkedList();
            
            for(int j=0;j<n;j++) {
                list.add(".");
            }
            board.add(list);
        }
        
        return board;
        
    }
}