// Last updated: 27/08/2026, 09:19:50
1class Solution {
2    public List<String> fizzBuzz(int n) {
3        List<String> ans = new ArrayList<>();
4
5        for(int i=1; i<=n; i++) {
6            if(i%3 ==0 && i%5==0) {
7                ans.add("FizzBuzz");
8            }
9            else if(i%3==0) {
10                ans.add("Fizz");
11            }
12            else if(i%5==0) {
13                ans.add("Buzz");
14            }
15            else {
16                ans.add(Integer.toString(i));
17            }
18        }
19        return ans;
20    }
21}