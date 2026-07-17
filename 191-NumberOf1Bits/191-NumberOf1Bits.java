// Last updated: 17/07/2026, 15:11:47
class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n &= (n - 1);
        }

        return count;
    }
}