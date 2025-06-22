class Solution {

    public String[] divideString(String s, int k, char fill) {
        Queue<Character> q = new LinkedList<>();
        int m =  (s.length()%k== 0) ? s.length()/k :s.length()/ k+1 ;
        String[] st = new String[m];
        int n = s.length();
        int i = 0;
        while (n-- > 0) {
            q.offer(s.charAt(i));
            i++;
        }
        int j = 0;
        while (!q.isEmpty()) {
            String str = "";
            while (str.length() != k && !q.isEmpty()) {
                str = str.concat(String.valueOf(q.poll()));
            }
            st[j++] = str;
        }
        while (st[j - 1].length() != k) {
            st[j - 1] = st[j - 1].concat(String.valueOf(fill));
        }
        return st;
    }
}
