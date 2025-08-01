class Solution {

    public String[] divideString(String s, int k, char fill) {
        StringBuilder str = new StringBuilder(s);
        while (str.length() % k != 0) {
            str.append(fill);
        }
        String arr[] = new String[str.length() / k];
        for (int i = 0; i < str.length() / k; i++) {
            arr[i] = str.substring(i * k, (i + 1) * k);
        }
        return arr;
    }
}
