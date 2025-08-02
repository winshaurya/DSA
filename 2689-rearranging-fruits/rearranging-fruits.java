class Solution {
    public long minCost(int[] basket1, int[] basket2) {
                Map<Integer, Integer> freq = new HashMap<>();

        for (int x : basket1) freq.put(x, freq.getOrDefault(x, 0) + 1);
        for (int x : basket2) freq.put(x, freq.getOrDefault(x, 0) - 1);

        List<Integer> toSwap = new ArrayList<>();
        for (int x : freq.keySet()) {
            int f = freq.get(x);
            if (f % 2 != 0) return -1; // impossible
            for (int i = 0; i < Math.abs(f) / 2; i++) {
                toSwap.add(x);
            }
        }

        Collections.sort(toSwap);

        int globalMin = Integer.MAX_VALUE;
        for (int x : basket1) globalMin = Math.min(globalMin, x);
        for (int x : basket2) globalMin = Math.min(globalMin, x);

        long cost = 0;
        int half = toSwap.size() / 2;
        for (int i = 0; i < half; i++) {
            cost += Math.min(toSwap.get(i), 2 * globalMin);
        }

        return cost;
    }
}