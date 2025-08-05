class Solution {
    public int numOfUnplacedFruits(int[] f, int[] b) {
        for (int i = 0 ; i< f.length ; i++){
            int one = -1 , s = 2000;
            for (int j = b.length-1 ; j >=0 ; j--){
                if (b[j]>=f[i]) {
                    
                        one= j;
                        s=b[j];
                    
                }
            }
            if (one> -1){
                b[one]=0;
                f[i]=-1;
            }
        }
        int t=0;
        for (int i: f){
            if (i!=-1)t++;
        }
        return t;
    }
}