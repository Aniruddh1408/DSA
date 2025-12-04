class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }
    public int helper(int[] nums, int target, int index, int sum) {
        if(index >= nums.length) {
            return sum == target ? 1 : 0;
        }
        int add = helper(nums, target, index + 1, sum + nums[index]);
        int sub = helper(nums, target, index + 1, sum - nums[index]);
        return add + sub;
    }
}