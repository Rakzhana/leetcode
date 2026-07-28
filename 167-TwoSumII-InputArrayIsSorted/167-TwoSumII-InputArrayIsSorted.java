// Last updated: 28/07/2026, 09:36:59
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder sb = new StringBuilder();
4        while (columnNumber > 0) {
5            columnNumber--;
6            sb.append((char) ('A' + columnNumber % 26));
7            columnNumber /= 26;
8        }
9        return sb.reverse().toString();
10    }
11}