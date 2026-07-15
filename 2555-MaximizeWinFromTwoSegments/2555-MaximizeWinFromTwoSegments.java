// Last updated: 15/07/2026, 14:31:45
1class Solution {
2    public int maxCount(int[] banned, int n, int maxSum) {
3        int[] arr=new int[10001];
4        for(int i=0; i<banned.length; i++){
5            arr[banned[i]]=1;
6        }
7
8        long sum=0;
9        int cnt=0;
10        for(int i=1; i<=n; i++){
11            if(arr[i]==1){continue;}
12            sum+=i;
13            if(sum>maxSum){
14               break;
15            }
16            cnt++;
17        }
18
19        return cnt;
20    }
21}