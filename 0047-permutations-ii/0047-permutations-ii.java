class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> cur) {
        if(cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            if(used[i]) {
                continue;
            }
            used[i] = true;
            cur.add(nums[i]);
            backtrack(nums, used, res, cur);
            cur.remove(cur.size() - 1);
            used[i] = false;
        }
    }
}