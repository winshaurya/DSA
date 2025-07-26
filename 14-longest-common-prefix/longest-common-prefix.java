class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        int m = 300;int index = 0;
        for (int i = 0 ; i < strs.length; i++){
        if ( m > strs[i].length() ){
            m= strs[i].length();
            index = i;
             }
     }
     int  x=strs[index].length();
        for (int i =0 ; i< strs.length ; i++){
            int t = 0;
            for (int j = 0 ;  j< m; j++){
                if (strs[i].charAt(j)==strs[index].charAt(j)){
                    t++;
                }
                else break;

            }
            x = x<t ? x:t;

        }
            return s.append(strs[index] , 0, x).toString();

    }
}