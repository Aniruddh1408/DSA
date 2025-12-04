class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, k, n, 0, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int start, int k, int n, int sum, List<List<Integer>> res, List<Integer> cur) {
        if(cur.size() == k && sum == n) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if(cur.size() > k || sum > n) {
            return;
        }
        for(int i = start; i <= 9 ; i++) {
            cur.add(i);
            backtrack(i + 1, k, n, sum + i, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}