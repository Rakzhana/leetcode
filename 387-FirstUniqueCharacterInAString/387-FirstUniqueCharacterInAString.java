// Last updated: 17/07/2026, 15:11:03
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        // Count occurrences
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}