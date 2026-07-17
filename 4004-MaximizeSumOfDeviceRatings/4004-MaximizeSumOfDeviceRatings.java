// Last updated: 17/07/2026, 15:10:04
class Solution {
    public long maxRatings(int[][] units) {
        int m = units.length;

        int[] mn = new int[m];
        long[] gain = new long[m];

        long base = 0;
        long totalGain = 0;

        final int INF = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int first = INF, second = INF;

            for (int x : units[i]) {
                if (x < first) {
                    second = first;
                    first = x;
                } else if (x < second) {
                    second = x;
                }
            }

            if (units[i].length == 1) {
                second = 0;
            }

            mn[i] = first;
            base += first;

            long g = Math.max(0L, (long) second - first);
            gain[i] = g;
            totalGain += g;
        }

        // Among devices with positive gain, store minimum mn.
        int[] pref = new int[m];
        int[] suff = new int[m];

        for (int i = 0; i < m; i++) {
            int val = gain[i] > 0 ? mn[i] : INF;
            pref[i] = (i == 0) ? val : Math.min(pref[i - 1], val);
        }

        for (int i = m - 1; i >= 0; i--) {
            int val = gain[i] > 0 ? mn[i] : INF;
            suff[i] = (i == m - 1) ? val : Math.min(suff[i + 1], val);
        }

        long ans = base; // no transfers

        for (int sink = 0; sink < m; sink++) {
            int smallestTransferred = INF;

            if (sink > 0) {
                smallestTransferred = Math.min(
                        smallestTransferred, pref[sink - 1]);
            }
            if (sink + 1 < m) {
                smallestTransferred = Math.min(
                        smallestTransferred, suff[sink + 1]);
            }

            // no source with positive gain
            if (smallestTransferred == INF) {
                ans = Math.max(ans, base);
                continue;
            }

            long sinkLoss = Math.max(0, mn[sink] - smallestTransferred);

            long cur =
                    base
                    + (totalGain - gain[sink])
                    - sinkLoss;

            ans = Math.max(ans, cur);
        }

        return ans;
    }
}