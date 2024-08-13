class Solution {
    private void backtrack(int[] candidates, int target, int start, List<Integer> tempList, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue; // skip duplicates
            if (candidates[i] > target) break; 
            tempList.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, tempList, result); 
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
}

