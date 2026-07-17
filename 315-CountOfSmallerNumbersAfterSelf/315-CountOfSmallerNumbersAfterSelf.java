// Last updated: 17/07/2026, 15:11:11
class Solution {
    int[] count;
    int[] index;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        count = new int[n];
        index = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergeSort(nums, 0, n - 1);

        List<Integer> ans = new ArrayList<>();
        for (int c : count) {
            ans.add(c);
        }

        return ans;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;
        int rightCount = 0;

        while (i <= mid && j <= right) {
            if (nums[index[j]] < nums[index[i]]) {
                temp[k++] = index[j++];
                rightCount++;
            } else {
                count[index[i]] += rightCount;
                temp[k++] = index[i++];
            }
        }

        while (i <= mid) {
            count[index[i]] += rightCount;
            temp[k++] = index[i++];
        }

        while (j <= right) {
            temp[k++] = index[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            index[left + p] = temp[p];
        }
    }
}