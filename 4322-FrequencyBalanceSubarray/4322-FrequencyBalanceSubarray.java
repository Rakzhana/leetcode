// Last updated: 17/07/2026, 15:10:06
import java.util.*;

class Solution {
    public int getLength(int[] nums) {
        int n = nums.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> cnt = new HashMap<>();
            Map<Integer, Integer> freqCnt = new HashMap<>();

            for (int j = i; j < n; j++) {
                int x = nums[j];

                int oldFreq = cnt.getOrDefault(x, 0);
                int newFreq = oldFreq + 1;

                cnt.put(x, newFreq);

                if (oldFreq > 0) {
                    int c = freqCnt.get(oldFreq) - 1;
                    if (c == 0) {
                        freqCnt.remove(oldFreq);
                    } else {
                        freqCnt.put(oldFreq, c);
                    }
                }

                freqCnt.put(newFreq,
                        freqCnt.getOrDefault(newFreq, 0) + 1);

                int distinct = cnt.size();

                boolean valid = false;

                if (distinct == 1) {
                    valid = true;
                } else if (freqCnt.size() == 2) {
                    Iterator<Integer> it = freqCnt.keySet().iterator();

                    int f1 = it.next();
                    int f2 = it.next();

                    int small = Math.min(f1, f2);
                    int large = Math.max(f1, f2);

                    if (large == 2 * small) {
                        valid = true;
                    }
                }

                if (valid) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}