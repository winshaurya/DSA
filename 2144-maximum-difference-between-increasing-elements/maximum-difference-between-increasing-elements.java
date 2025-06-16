class Solution {
    public int maximumDifference(int[] nums) {
        int ans=-1;
        int n = nums.length;
        int min = nums[0];
        for(int i=1;i<n;i++){
            int val = nums[i];
            if(min<val){
                ans = Math.max(ans,val-min);
            }
            min = Math.min(min,val);             
        } 
        return ans;            
    }       
}
