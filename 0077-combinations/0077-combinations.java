class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, n, k, ans, new ArrayList<>());
        return ans;
    }
    public void backtrack(int start, int n, int k, List<List<Integer>> res, List<Integer> cur) {
        if(cur.size() == k) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = start; i < n; i++) {
            cur.add(i + 1);
            backtrack(i + 1, n, k, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}