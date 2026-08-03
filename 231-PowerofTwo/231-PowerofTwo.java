// Last updated: 03/08/2026, 08:57:13
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        return n > 0 && (n & (n - 1)) == 0;
4    }
5}