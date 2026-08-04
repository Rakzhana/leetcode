// Last updated: 04/08/2026, 10:00:27
1class Solution {
2    public int addDigits(int num) {
3        if (num == 0)
4            return 0;
5        if (num % 9 == 0)
6            return 9;
7        return num % 9;
8    }
9}