
class Solution {

    public int minimumDeletions(String word, int k) {
        int[] fr = new int[26];

        for (char c : word.toCharArray()) {
            fr[c - 'a']++;
        }

        Arrays.sort(fr);

        int minTotalDeletions = word.length();

        for (int i = 0; i < 26; i++) {
            int lb = fr[i];
            int ub = lb + k;

            int Deletions = 0;

            for (int j = 0; j < 26; j++) {
                int f = fr[j];

                if (f == 0) {
                    continue;
                }

                if (f < lb) {
                    Deletions += f;
                } else if (f > ub) {
                    Deletions += (f - ub);
                }
            }

            minTotalDeletions = Math.min(minTotalDeletions, Deletions);
        }

        return minTotalDeletions;
    }
}
