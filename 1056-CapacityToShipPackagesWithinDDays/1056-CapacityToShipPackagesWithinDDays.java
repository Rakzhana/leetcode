// Last updated: 17/07/2026, 15:10:15
class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int low=0;
        int high=0;
        for(int w:weights) 
        {
            low=Math.max(low,w);
            high+=w;
        }
        int ans=high;
        while(low<=high) 
        {
            int mid=low+(high-low)/2;
            if(canShip(weights,D,mid)) {
                ans=mid;
                high=mid-1;
            } 
            else
             {
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canShip(int[]weights,int D,int cap) {
        int days=1;
        int load=0;
        for(int w:weights) {
            if(load+w>cap) {
                days++;
                load=w;
            }
             else 
            {
                load+=w;
            }
            if(days>D)
            {
                return false;
            }
        }
        return true;
    }
}