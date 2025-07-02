class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i = 0 ;
        while (i<nums.length) {
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

        List<Integer> a = new ArrayList<>();
        for (int j=0; j<nums.length;j++){
            if (nums[j]!=j+1)a.add(nums[j]);
        }

        return a;
    }
}