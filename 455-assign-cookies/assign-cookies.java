class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        Queue<Integer> h = new LinkedList<>();

        for (int i : s) {
            h.add(i);
        }
        int ans = 0;
        for (int i = 0; i < g.length; i++) {
           while (g[i] > 0 && !h.isEmpty() ){
            
            if (g[i] - h.peek()<= 0){
                g[i]= g[i] - h.peek();
                ans++;
                
            } 
            h.poll();
           }
        }
        return ans;
    }
}
