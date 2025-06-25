class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long left = (long) -1e10 - 1;
        long right = (long) 1e10 + 1;
        long ans = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (countLessEqual(nums1, nums2, mid) >= k) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private long countLessEqual(int[] nums1, int[] nums2, long val) {
        long count = 0;
        for (int x : nums1) {
            if (x == 0) {
                if (val >= 0) count += nums2.length;
                continue;
            }

            int low = 0, high = nums2.length - 1;
            int currentIdx = (x > 0) ? -1 : nums2.length;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) x * nums2[mid] <= val) {
                    if (x > 0) {
                        currentIdx = mid;
                        low = mid + 1;
                    } else {
                        currentIdx = mid;
                        high = mid - 1;
                    }
                } else {
                    if (x > 0) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            count += (x > 0) ? (currentIdx + 1) : (nums2.length - currentIdx);
        }
        return count;
    }
}