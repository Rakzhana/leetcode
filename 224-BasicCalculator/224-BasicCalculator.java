// Last updated: 28/07/2026, 10:26:47
1class Solution {
2    public int calculate(String s) {
3        Stack<Integer> st = new Stack<>();
4
5        int ans = 0;
6        int num = 0;
7        int sign = 1;
8
9        for (int i = 0; i < s.length(); i++) {
10            char ch = s.charAt(i);
11
12            if (ch >= '0' && ch <= '9') {
13                num = num * 10 + (ch - '0');
14            }
15
16            else if (ch == '+') {
17                ans += sign * num;
18                num = 0;
19                sign = 1;
20            }
21
22            else if (ch == '-') {
23                ans += sign * num;
24                num = 0;
25                sign = -1;
26            }
27
28            else if (ch == '(') {
29                st.push(ans);
30                st.push(sign);
31
32                ans = 0;
33                sign = 1;
34            }
35
36            else if (ch == ')') {
37                ans += sign * num;
38                num = 0;
39
40                int prevSign = st.pop();
41                int prevAns = st.pop();
42
43                ans = prevAns + prevSign * ans;
44            }
45        }
46
47        ans += sign * num;
48
49        return ans;
50    }
51}