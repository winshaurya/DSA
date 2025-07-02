class Solution {

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] a = new int[2];
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                if (nums[nums[i] - 1] == nums[i]) {
                    i++;
                } else {
                    int t = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = t;
                }
            } else {
                i++;
            }
        }

       
        for (int j = 0 ; j<nums.length;j++){
            if (nums[j]!= j+1 ){
            a[0] = nums[j];
            a[1] = j+1;
            }
        }
        return a;
    }
}
