//Java Solution

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        int index = 0;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> temp = new LinkedList<Integer>();
        
        backtrack(result, temp, sum, index, target, candidates);
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, LinkedList<Integer> temp, int sum, int index, int target, int[] candidates) {
        if (sum > target) {
            return;
        }
        
        if (sum == target) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        
        for (int i = index; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backtrack(result, temp, sum + candidates[i], i, target, candidates);
            temp.removeLast();
        }
    }
}