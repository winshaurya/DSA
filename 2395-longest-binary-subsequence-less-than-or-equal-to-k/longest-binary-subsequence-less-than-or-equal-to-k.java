class Solution {

    public int longestSubsequence(String s, int k) {
        int n = s.length();
        int val = 0, one = 0, z = 0;
        long pow = 1;
        for (char c : s.toCharArray()) {
            if (c == '0') z++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(s.length() - 1 - i) == '1') {
                if (val + pow > k) continue;
                one++;
                val += pow;
                pow <<= 1;
            } else pow <<= 1;
            if (pow > k) break;
        }
        return z + one;
    }
}
