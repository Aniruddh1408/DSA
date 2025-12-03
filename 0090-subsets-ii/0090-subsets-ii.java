class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int start, int nums[], List<List<Integer>> res, List<Integer> cur) {
        res.add(new ArrayList<>(cur));
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            cur.add(nums[i]);
            backtrack(i + 1, nums, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}