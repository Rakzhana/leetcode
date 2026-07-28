// Last updated: 28/07/2026, 09:38:59
1class Solution {
2    public int calculateMinimumHP(int[][] dungeon) {
3        int m = dungeon.length, n = dungeon[0].length;
4        int[] dp = new int[n + 1];
5        Arrays.fill(dp, Integer.MAX_VALUE);
6        dp[n - 1] = 1; // will be computed properly in last row
7
8        for (int i = m - 1; i >= 0; i--) {
9            int[] newDp = new int[n + 1];
10            Arrays.fill(newDp, Integer.MAX_VALUE);
11            for (int j = n - 1; j >= 0; j--) {
12                int bestNext;
13                if (i == m - 1 && j == n - 1) {
14                    newDp[j] = Math.max(1, 1 - dungeon[i][j]);
15                    continue;
16                }
17                // right neighbor: newDp[j+1], below neighbor: dp[j]
18                bestNext = Math.min(
19                    newDp[j + 1] == Integer.MAX_VALUE ? Integer.MAX_VALUE : newDp[j + 1],
20                    dp[j] == Integer.MAX_VALUE ? Integer.MAX_VALUE : dp[j]
21                );
22                newDp[j] = Math.max(1, bestNext - dungeon[i][j]);
23            }
24            dp = newDp;
25        }
26
27        return dp[0];
28    }
29}