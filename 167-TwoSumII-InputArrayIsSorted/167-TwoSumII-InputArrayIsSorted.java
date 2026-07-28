// Last updated: 28/07/2026, 09:37:43
1class Solution {
2    public int trailingZeroes(int n) {
3        int ans = Math.floorDiv(n, 5);
4        ans += Math.floorDiv(n, 25);
5        ans += Math.floorDiv(n, 125);
6        ans += Math.floorDiv(n, 625);
7        ans += Math.floorDiv(n, 3125);
8        
9        
10        return ans;
11    }
12}