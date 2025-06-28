class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [][] a = new int [nums.length][2];
        int [] ans = new int [k];
        for (int i = 0 ; i < nums.length; i++){
            a[i][0]= i;
            a[i][1]=nums[i];
        }
        Arrays.sort(a ,(x,y)-> Integer.compare(y[1],x[1]));
        Arrays.sort(a,0,k,(x,y)-> Integer.compare(x[0],y[0]));
        for (int i = 0 ; i < k; i++){
            ans[i] = a[i][1];
        }
        return ans;
    }
}