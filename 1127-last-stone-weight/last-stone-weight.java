class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder()) ;
       for ( int j : stones){
        p.add(j);

       }
       while (p.size()!=1){
        int a = p.poll(), b= p.poll();
        if (a==b ){
           if (p.size()==0) p.add(0);
        }
        else { 
            p.add(Math.abs(a-b));
        }

    
       }
       return p.poll();
    }
}