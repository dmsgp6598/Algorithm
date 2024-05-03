class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(arr[0]);
        for (String str : arr) {
            n = Integer.parseInt(str);
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return min + " " + max;
    }
}