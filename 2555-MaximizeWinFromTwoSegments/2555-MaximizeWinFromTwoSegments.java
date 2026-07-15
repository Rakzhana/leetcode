// Last updated: 15/07/2026, 14:32:58
1class Solution {
2    public int[] separateDigits(int[] nums) {
3        
4        List<Integer> list = new ArrayList<>();
5
6        for (int num : nums) {
7
8            String s = String.valueOf(num);
9
10            for (char ch : s.toCharArray()) {
11
12                list.add(ch - '0');
13            }
14        }
15
16        int[] result = new int[list.size()];
17
18        for (int i = 0; i < list.size(); i++) {
19            result[i] = list.get(i);
20        }
21
22        return result;
23    }
24}