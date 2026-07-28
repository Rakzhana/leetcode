// Last updated: 28/07/2026, 09:36:17
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length-1;
5        while (left < right){
6            int sum = numbers[right] + numbers[left];
7            if(sum > target){
8                right--;
9            }
10            else if(sum < target){
11                left++;
12            }
13            else {
14                return new int[]{left+1,right+1};
15            }
16        }
17        return new int[]{};
18    }
19}