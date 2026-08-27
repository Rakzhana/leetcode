// Last updated: 27/08/2026, 09:43:14
1class Solution {
2    public int arrangeCoins(int n) {
3        int low=1;
4        int high=n;
5        int ans=1;
6        while(low<=high){
7            int mid=low+(high-low)/2;
8            if(helper(mid)<=n){
9                ans=mid;
10                low=mid+1;
11            }
12            else high=mid-1;
13        }
14        return ans;
15    }
16    public long helper(int mid){
17        long sum=(long)mid*(mid+1)/2;
18        return sum;
19    }
20}