// Last updated: 27/08/2026, 09:25:43
1class Solution {
2    public int thirdMax(int[] nums) {
3       long max1 = Long.MIN_VALUE;
4        long max2 = Long.MIN_VALUE;
5        long max3 = Long.MIN_VALUE;
6
7        for (int num : nums) {
8           
9            if (num == max1 || num == max2 || num == max3) {
10                continue;
11            }
12
13            if (num > max1) {
14                max3 = max2;
15                max2 = max1;
16                max1 = num;
17            } else if (num > max2) {
18                max3 = max2;
19                max2 = num;
20            } else if (num > max3) {
21                max3 = num;
22            }
23        }
24
25        // If third max doesn't exist, return the largest
26        return (max3 == Long.MIN_VALUE) ? (int) max1 : (int) max3;
27
28    }
29}