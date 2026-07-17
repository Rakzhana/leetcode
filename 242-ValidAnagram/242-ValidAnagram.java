// Last updated: 17/07/2026, 15:11:25
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
          Arrays.sort(sArray);
        Arrays.sort(tArray);
          return Arrays.equals(sArray, tArray);
    }
    }
