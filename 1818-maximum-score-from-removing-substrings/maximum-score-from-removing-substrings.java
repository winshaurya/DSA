class Solution {

    public int maximumGain(String s, int x, int y) {
        char[] c = s.toCharArray();
        int aa = 0, bb = 0, t = 0;
        if (x < y) {
            int temp = y;
            y = x;
            x = temp;
            s = new StringBuilder(s).reverse().toString();
        }
        for (char ch : s.toCharArray()) {
            if (ch == 'a') aa++; else if (ch == 'b') {
                if (aa > 0) {
                    aa--;
                    t += x;
                } else {
                    bb++;
                }
            } else {
                t += Math.min(aa, bb) * y;
                aa = 0;
                bb = 0;
            }
        }
          t += Math.min(aa, bb) * y;
        
        return t;
    }
}
