class Solution {

    public int trap(int[] height) {
        int l = height.length;
        int[] left = new int[l];
        int[] right = new int[l];
        int lmax = height[0], rmax = height[l - 1];
        for (int i = 0, j = l - 1; i < l; i++, j--) {
            left[i] = lmax;
            right[j] = rmax;
            lmax = Math.max(height[i], lmax);

            rmax = Math.max(height[j], rmax);
            
        }
        int ans = 0;
        for (int i = 1; i < l - 1; i++) {
            int t = Math.min(right[i], left[i]) - height[i];
            ans += (t > 0) ? t : 0;
        }
        return ans;
    }
}
