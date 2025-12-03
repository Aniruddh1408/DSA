class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int start, int[] nums, List<List<Integer>> res, List<Integer> cur) {
        if(start == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[start]);
        backtrack(start + 1, nums, res, cur);
        cur.remove(cur.size() - 1);
         
         while (start + 1 < nums.length && nums[start] == nums[start + 1]) {
            start++;
        }
        backtrack(start + 1, nums, res, cur);
    }
}