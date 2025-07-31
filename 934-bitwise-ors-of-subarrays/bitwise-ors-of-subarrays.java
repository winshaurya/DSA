class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans = new HashSet();
        Set<Integer> c = new HashSet();
        c.add(arr[0]);
        for (int x:arr){
            Set<Integer> c2 = new HashSet();
            for (int y: c ){
                c2.add(x|y);
            }
            c2.add(x);
            c=c2;
            ans.addAll(c);
        }
        return ans.size();
    }
}