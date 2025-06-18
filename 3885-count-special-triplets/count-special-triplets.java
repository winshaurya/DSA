class Solution {
    public int specialTriplets(int[] nums) {
        int ans = 0 ;
        int mod = 1000000007;
        
        Map <Integer , Integer> f = new HashMap<>();
        Map <Integer , Integer> ready = new HashMap<>();

        for (int i = 0 ; i< nums.length ; i++){
            int n = nums[i];
            if (n%2==0){
                ans = (ans+ ready.getOrDefault(n/2 , 0))% mod;
            }

            if (n<50001){
                int n2 = f.getOrDefault( 2*n , 0);
                ready.put(n , (ready.getOrDefault(n, 0)+ n2)% mod);
            }

            f.put(n ,( f.getOrDefault(n,0)+1)%mod);

        }
        return ans;
    }
}