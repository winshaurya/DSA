class Solution {

    public int maxSum(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int k = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > 0) s.add(i); else k = k > i ? k : i;
        }
        int m = 0;
        for (Integer i : s) {
            m += i;
        }

        if (m > 0) return m; else return k;
    }
}
