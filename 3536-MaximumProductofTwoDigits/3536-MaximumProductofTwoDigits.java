// Last updated: 25/07/2026, 15:13:52
1class Solution {
2    public int maxProduct(int n) {
3        int max1 = 0, max2 = 0;
4
5        for (; n != 0; n /= 10) {
6            int d = n % 10;
7            if (d >= max1) {
8                max2 = max1;
9                max1 = d;
10            } else if (d > max2) 
11                max2 = d;
12        }
13
14        return max1 * max2;
15    }
16}