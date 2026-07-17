// Last updated: 17/07/2026, 15:17:12
class Solution {
     private static int getValue(char romanChar) {
        switch (romanChar) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
         int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentVal = getValue(s.charAt(i));
            if (i + 1 < length) {
                int nextVal = getValue(s.charAt(i + 1));if (currentVal < nextVal) {
                    total -= currentVal;
                } else {
                    total += currentVal;
                }
            } else {
                 total += currentVal;
            }
        
       
    }
    return total;
    }
}                               