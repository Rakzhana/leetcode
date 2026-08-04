// Last updated: 04/08/2026, 10:21:52
class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> sub = new ArrayList<>();

        findSubsequences(
                1,
                n,
                k,
                0,
                new ArrayList<>(),
                sub);

        return sub;
    }

    static void findSubsequences(int currentNumber,
                                 int target,
                                 int k,
                                 int currentSum,
                                 List<Integer> current,
                                 List<List<Integer>> sub) {

        // Pruning
        if(currentSum > target || current.size() > k)
            return;

        // Base Case
        if(currentNumber > 9){

            if(currentSum == target &&
               current.size() == k){

                sub.add(new ArrayList<>(current));
            }

            return;
        }

        // Pick current number
        current.add(currentNumber);

        findSubsequences(
                currentNumber + 1,
                target,
                k,
                currentSum + currentNumber,
                current,
                sub);

        // Backtrack
        current.remove(current.size() - 1);

        // Don't Pick current number
        findSubsequences(
                currentNumber + 1,
                target,
                k,
                currentSum,
                current,
                sub);
    }
}