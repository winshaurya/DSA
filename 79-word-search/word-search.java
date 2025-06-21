class Solution {
    int r ; 
    int c;
    Set <String > v ; 
    public boolean exist(char[][] board, String word) {
        r = board.length;
        c = board[0].length;
        v = new HashSet<>();
        for (int i = 0 ; i < r ; i++){
            for (int j = 0 ; j < c ; j++){
               if (board[i][j]== word.charAt(0)){
                    if( dfs( board ,word, i , j  , 0)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] b , String w , int i , int j , int rn){
        if (rn == w.length()) return true;
        String s = i+","+j;
        if (v.contains(s) || i<0 ||j < 0 || j >= c || i >= r || b[i][j] != w.charAt(rn))return false ;
        v.add(s);
        boolean res = dfs(b, w, i-1 , j , rn +1)||
                    dfs(b, w, i+1 , j , rn +1)||
                    dfs(b, w, i , j+1 , rn +1)||
                    dfs(b, w, i , j-1 , rn +1);
        v.remove(s);
        return res;
    }
}
