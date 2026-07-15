// Last updated: 15/07/2026, 14:28:07
1class Solution {
2    public boolean isPossibleToCutPath(int[][] grid) {
3        int first=dfs(grid,0,0);
4        grid[0][0]=1; //reset for 2nd dfs() as got updated above
5        int second=dfs(grid,0,0);
6        return second >= 1 ? false : true;
7    }
8    
9    private int dfs(int[][] g, int r, int c) {
10        if(r == g.length-1 && c == g[0].length-1)
11            return 1;
12        if(r == g.length || c == g[0].length || g[r][c] == 0)
13            return 0;
14        
15        g[r][c]=0;
16        if(dfs(g,r+1,c) == 1)
17            return 1;
18        return dfs(g,r,c+1);
19    }
20}