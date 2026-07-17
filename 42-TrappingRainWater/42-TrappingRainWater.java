// Last updated: 17/07/2026, 15:15:55
class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0)
        return 0;
        int left=0;
        int right=height.length-1;
        int leftmax=height[left];
        int rightmax=height[right];
        int water=0;
        while(left<right)
        {
            if(leftmax<rightmax)
            {
                left++;
                leftmax=Math.max(leftmax,height[left]);
                water+=leftmax-height[left];
            }
            else
            {
                right--;
                rightmax=Math.max(rightmax,height[right]);
                water+=rightmax-height[right];
            }
        }
        return water;

    }
}