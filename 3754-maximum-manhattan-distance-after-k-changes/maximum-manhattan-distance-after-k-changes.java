class Solution {

    public int maxDistance(String s, int k) {
        int[] fr1 = new int[2];
        int[] fr2 = new int[2];
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') fr1[0]++;
            if (c == 'W') fr1[1]++;
            if (c == 'N') fr2[0]++;
            if (c == 'S') fr2[1]++;

            int ans = Math.max(fr1[0], fr1[1]) + Math.max(fr2[0], fr2[1]);

            if (k < Math.min(fr1[0], fr1[1]) + Math.min(fr2[0], fr2[1])) {
                ans = ans + 2 * k - Math.min(fr1[0], fr1[1]) - Math.min(fr2[0], fr2[1]);
            } else {
                ans = ans + Math.min(fr1[0], fr1[1]) + Math.min(fr2[0], fr2[1]);
            }

            max = Math.max(max, ans);
        }

        return max;
    }

    int cal(Character c) {
        if (c == 'E' || c == 'N') return 1; else return -1;
    }
}
