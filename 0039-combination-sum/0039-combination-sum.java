class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int start, int[] nums, int sum, int target, List<List<Integer>> res, List<Integer> cur) {
        if(sum == target) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(sum > target) {
            return;
        }
        for(int i = start; i < nums.length; i++) {
                cur.add(nums[i]);
                backtrack(i , nums, sum + nums[i], target, res, cur);
                cur.remove(cur.size() - 1);
        }
    }
}