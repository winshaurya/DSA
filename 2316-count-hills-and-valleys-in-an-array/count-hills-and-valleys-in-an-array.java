class Solution {
    public int countHillValley(int[] nums) {
        if (nums.length==1 || nums.length==2 )return 0;
    int t = 0 ,i =1;
    while (i<nums.length-1 ){
        
        if (nums[i]>nums[i-1]&&nums[i]==nums[i+1]){
            int p=0;
            for (int j= i+1 ; j <nums.length-1 ; j++){
            if(nums[j]==nums[i]){
            p++; i++;
            }
            else break;
            if ( nums[i]>nums[i+1])t++;

            }
        }
        else if (nums[i]<nums[i-1]&&nums[i]==nums[i+1]){
            int p=0;
            for (int j= i+1 ; j <nums.length-1 ; j++){
            if(nums[j]==nums[i]){
            p++; i++;
            }
            else break;
            }
            if ( nums[i]<nums[i+1])t++;
        }
        else if (nums[i]>nums[i-1]&& nums[i]>nums[i+1]){
            t++;
        }
        else if (nums[i]<nums[i-1]&& nums[i]<nums[i+1]){
            t++;
        }
        i++;
    }
    return t;
    }
}