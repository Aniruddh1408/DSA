class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, n, "", 0, 0);
        return ans;
    }
    public void backtrack(List<String> list, int n, String s, int open, int close) {
        if(open == close && open + close == 2 * n) {
            list.add(s);
            return;
        }
        if(open < n) {
            backtrack(list, n, s + "(", open + 1, close);
        }
        if(close < open) {
            backtrack(list, n, s + ")", open, close + 1);
        }
    }
}