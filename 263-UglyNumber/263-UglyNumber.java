// Last updated: 04/08/2026, 10:03:54
1class Solution {
2public static boolean isUgly(int num) {
3    if (num <= 0) return false;
4    while (num % 2 == 0) num /= 2;
5    while (num % 3 == 0) num /= 3;
6    while (num % 5 == 0) num /= 5;
7    return num == 1;
8}
9}