// Last updated: 24/07/2026, 10:05:36
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int n = gas.length;
4        int total_surplus = 0;
5        int surplus = 0;
6        int start = 0;
7        
8        for(int i = 0; i < n; i++){
9            total_surplus += gas[i] - cost[i];
10            surplus += gas[i] - cost[i];
11            if(surplus < 0){
12                surplus = 0;
13                start = i + 1;
14            }
15        }
16        return (total_surplus < 0) ? -1 : start;
17    }
18}