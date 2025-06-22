class Solution {
    public int[] maxSlidingWindow(int[] data, int winLen) {
        if (data == null || data.length == 0 || winLen <= 0) {
            return new int[0];
        }

        Deque<Integer> idxQue = new ArrayDeque<>();
        List<Integer> maxList = new ArrayList<>();

        for (int currIdx = 0; currIdx < data.length; currIdx++) {
            if (!idxQue.isEmpty() && idxQue.peekFirst() == currIdx - winLen) {
                idxQue.removeFirst();
            }

            while (!idxQue.isEmpty() && data[idxQue.peekLast()] <= data[currIdx]) {
                idxQue.removeLast();
            }

            idxQue.addLast(currIdx);

            if (currIdx >= winLen - 1) {
                maxList.add(data[idxQue.peekFirst()]);
            }
        }

        int[] maxArr = new int[maxList.size()];
        for (int j = 0; j < maxList.size(); j++) {
            maxArr[j] = maxList.get(j);
        }

        return maxArr;
    }
}
