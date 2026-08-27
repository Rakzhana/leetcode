// Last updated: 27/08/2026, 09:27:16
1class Solution {
2    public String addStrings(String num1, String num2) {
3        int i= num1.length()-1;
4        int j = num2.length()-1;
5        int carry =0;
6        StringBuilder sb = new StringBuilder();
7        while(i>=0||j>=0||carry!=0)
8        {
9            int d1=(i>=0)?num1.charAt(i)-'0':0;
10            int d2=(j>=0)?num2.charAt(j)-'0':0;
11            int sum = d1+d2+carry;
12             carry = sum/10;
13            sb.append(sum%10);
14            i--;
15            j--;
16        }
17        return sb.reverse().toString();
18        
19    }
20}