class Solution {

    public int findDuplicate(int[] nums) {
        int i = 0 ;
        while (i<nums.length) {
            if (nums[i] != i + 1) {
                if (nums[nums[i] - 1] == nums[i]) {
                    return nums[i];
                } else {
                    int t = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = t;
                }
            } else {
                i++;
            }
        }

        if (nums[nums.length - 1] != nums.length) return nums[nums.length - 1];
        return -1;
    }
}
