// Last updated: 04/08/2026, 10:32:45
1class Solution {
2    public String toHex(int num) {
3        if (num == 0) return "0";
4
5        char[] hexChars = "0123456789abcdef".toCharArray(); 
6        StringBuilder sb = new StringBuilder();
7        while (num != 0) {
8            int rem = num & 15;
9            sb.append(hexChars[rem]);
10            num >>>= 4;
11        }
12
13        return sb.reverse().toString();
14    }
15}