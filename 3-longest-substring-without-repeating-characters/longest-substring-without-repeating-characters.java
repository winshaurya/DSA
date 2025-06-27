class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0)return 0;
        Queue<Character> q = new LinkedList<>();
        Set<Character> st = new HashSet<>();
        
        int max = 0;
        q.offer(s.charAt(0));
        for (char c : s.toCharArray()) {
            if (st.contains(c)) {
                while (q.peek() != c) {
                    st.remove(q.poll());
                }
            }
            if (q.peek() == c) q.poll();
            st.add(c);
            q.offer(c);

            max = max > q.size() ? max : q.size();
        }
        return max;
    }
}
