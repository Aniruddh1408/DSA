class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int nums[], List<List<Integer>> res, List<Integer> cur) {
        if(cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(cur.contains(nums[i])) {
                continue;
            }
            cur.add(nums[i]);
            backtrack(nums, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}