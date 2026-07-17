// Last updated: 17/07/2026, 15:13:56
import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            l1.add(nums1[i]);
        }
        for(int j=0;j<n;j++)
        {
            l1.add(nums2[j]);
        }
        Collections.sort(l1);
        for(int i=0;i<m+n;i++)
        {
            nums1[i]=l1.get(i);
        }
        
    }
}