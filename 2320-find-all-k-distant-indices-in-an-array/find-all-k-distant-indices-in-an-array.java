class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean b = false;
            for (int j = 0; j < nums.length; j++) {
                if (Math.abs(i - j) <= k && nums[j] == key) {
                    b = true;
                }
            }
            if (b) l.add(i);
        }
        return l;
    }
}
