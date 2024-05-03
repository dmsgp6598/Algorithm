class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(arr[0]);
        for (String str : arr) {
            n = Integer.parseInt(str);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;
    }
}