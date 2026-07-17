// Last updated: 17/07/2026, 15:14:09
class Solution {
    public boolean search(int[] nums, int target) {
        for(int n:nums)
        {
            if(n==target)
            {
                return true;
            }
        }
        return false;
    }
}