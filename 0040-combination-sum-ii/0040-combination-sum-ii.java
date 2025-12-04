class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, 0, target, ans, new ArrayList<Integer>());
        return ans;
    }
    public void backtrack(int start, int[] nums, int sum, int target, List<List<Integer>> res, List<Integer> cur) {
        if(sum == target) {
            res.add(new ArrayList<Integer>(cur));
            return;
        }
        if(sum > target) {
            return;
        }
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            if(sum + nums[i] > target) {
                break;
            }
            cur.add(nums[i]);
            backtrack(i + 1, nums, sum + nums[i], target, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}