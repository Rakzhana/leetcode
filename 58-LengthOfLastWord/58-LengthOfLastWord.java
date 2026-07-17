// Last updated: 17/07/2026, 15:15:16
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=s.lastIndexOf(" ");
        return s.length()-last -1;
        
    }
}